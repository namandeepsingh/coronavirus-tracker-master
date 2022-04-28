package com.controller;

import com.modal.Product;
import com.service.Inventory;
import com.service.ProductInfo;
import com.service.ProductPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan("com.service")
public class ProductController {

    @Autowired
    private ProductInfo productInfo;
    @Autowired
    private ProductPrice productPrice;
    @Autowired
    private Inventory inventory;

    @GetMapping("/product/details/{productID}")
 public Product getProductDetails(@PathVariable Long productID)
 {
     productInfo=productInfo.getProductInfo(productID);
     productPrice=productPrice.getProductPrice(productID);
     inventory=inventory.getStock(productID);
     return new Product(productInfo.getProductID(),productInfo.getProductName(),productInfo.getProductDesc(),productPrice.getDiscountPrice(),inventory.isInStock()==true?"Instock":"Out Of Stock");
 }

}
