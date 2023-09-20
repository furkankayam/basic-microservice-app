package com.furkankaya.productservice.controller;

import com.furkankaya.productservice.service.impl.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<String> getAllProducts() {
        return productService.getAppProduct();
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public String createProduct(@RequestBody String name) {
        return productService.createProduct(name);
    }

}
