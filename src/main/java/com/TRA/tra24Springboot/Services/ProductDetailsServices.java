package com.TRA.tra24Springboot.Services;

import com.TRA.tra24Springboot.InvoiceRepositories.ProductDetailsRepository;
import com.TRA.tra24Springboot.Models.Product;
import com.TRA.tra24Springboot.Models.ProductDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailsServices {

    @Autowired
    ProductDetailsRepository productDetailsRepository;

    public ProductDetails addToProduct(ProductDetails productDetails){
        return productDetailsRepository.save(productDetails);
    }
}
