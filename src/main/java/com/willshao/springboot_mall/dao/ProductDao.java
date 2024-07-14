package com.willshao.springboot_mall.dao;

import com.willshao.springboot_mall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}