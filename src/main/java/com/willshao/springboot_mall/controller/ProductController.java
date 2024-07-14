package com.willshao.springboot_mall.controller;

import com.willshao.springboot_mall.model.Product;
import com.willshao.springboot_mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    // 使用GET METHOD，參數帶入productId
    @GetMapping("products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer productId) {
        Product product = productService.getProductById(productId);
        if (product != null) {
            // Http: 200 Ok, Response body=product
            return ResponseEntity.status(HttpStatus.OK).body(product);
        } else {
            // 404 Not Found
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }
}
