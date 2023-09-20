package com.furkankaya.productservice.service.impl;

import com.furkankaya.productservice.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private List<String> products;

    public ProductServiceImpl() {
        this.products=new ArrayList<>();
        this.products.add("Dell");
        this.products.add("Acer");
        this.products.add("Hp");
        this.products.add("Huawei");
    }

    @Override
    public List<String> getAppProduct() {
        return products;
    }

    @Override
    public String getProductById(int id) {
        return products.get(id);
    }

    @Override
    public String createProduct(String name) {
        products.add(name);
        return "Product added";
    }
}
