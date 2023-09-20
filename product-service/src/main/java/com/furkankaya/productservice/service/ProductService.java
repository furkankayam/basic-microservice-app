package com.furkankaya.productservice.service;

import java.util.List;

public interface ProductService {

    List<String> getAppProduct();

    String getProductById(int id);

    String createProduct(String name);
}
