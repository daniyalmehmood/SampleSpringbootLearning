package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.Models.*;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    Order order1 = new Order();

    @PostMapping("create")
    public Order createOrder(/*List<Product> productList*/){
        order1.setId(1);
        order1.setOrderDate( new Date());
        order1.setStatus(OrderStatus.PENDING);
        order1.setCategoryName("\\Electronics //");
        order1.setDescription("The first order");
        order1.setPaymentStatus(PaymentStatus.PAID);
/*
        order1.setProductsOrdered(productList);
*/
        order1.setPaymentType(PaymentType.CASH);

        return order1;
    }

    @PutMapping("update")
    public Order updateOrder(@RequestBody Order userOrder){
        order1.setUpdatedDate(new Date());
        order1 = userOrder;
        return order1;
    }

    @PostMapping("cancel/{id}")
    public String cancelOrder(@PathVariable Integer id){
        if(order1.getId().equals(id)){
            order1.setStatus(OrderStatus.CANCELED);
        }

        return "Success";
    }

    @GetMapping("get")
    public Order reportOrder(){
        return order1;
    }
}
