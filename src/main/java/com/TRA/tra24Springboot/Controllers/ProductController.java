package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.DTO.ProductDTO;
import com.TRA.tra24Springboot.Repositories.ProductDetailsRepository;
import com.TRA.tra24Springboot.Repositories.ProductRepository;
import com.TRA.tra24Springboot.Models.Product;
import com.TRA.tra24Springboot.Models.ProductDetails;
import com.TRA.tra24Springboot.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductService productService;
    @Autowired
    ProductDetailsRepository productDetailsRepository;
    Product globalProduct = new Product();

    @PostMapping("add")
    public Product addProduct(Product product){

        return productService.addProduct(product);
    }


    @PostMapping("delete")
    public String deleteProduct(@RequestParam Integer id){

        return productService.deleteProduct(id);
    }

    @PutMapping("update")
    public String updateProduct(@RequestParam Integer id, @RequestParam Integer quantity){
        return  productService.updateProduct(id,quantity);
    }
    @GetMapping("getAll")
    public List<ProductDTO> getProducts(){
        return productService.getProducts();
    }


    @GetMapping("getByName")
    public List<Product >getProductByName(@RequestParam String name) {
        return productService.getProductsByName(name);

    }
    @GetMapping("getByColor")
    public List<Product >getProductByColor(@RequestParam String color) {
        return productService.getProductsByColor(color);

    }
    @GetMapping("getBySize")
    public List<Product >getProductBySize(@RequestParam String size) {
        return productService.getProductsBySize(size);

    }
    @GetMapping("getById")
    public Product getProductById(@RequestParam Integer id) {
        return productService.getProductsById(id);

    }
    @GetMapping("getByPrice")
    public List<Product> getProductById(@RequestParam Double price) {
        return productService.getProductsByPrice(price);

    }
    @GetMapping("getByCountry")
    public List<Product> getProductByCountryOfOrigin(@RequestParam String country) {
        return productService.getProductsByCountryOfOrigin(country);

    }
    @GetMapping("getBySKU")
    public Product getProductBySKU(@RequestParam UUID sku) {

        return productService.getProductsBySKU(sku);

    }
    @GetMapping("getByCategory")
    public List<Product> getProductByCategory(@RequestParam String category) {

        return productService.getProductsByCategory(category);

}
}
