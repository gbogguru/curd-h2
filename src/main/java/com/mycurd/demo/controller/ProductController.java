package com.mycurd.demo.controller;

import com.mycurd.demo.entity.Product;
import com.mycurd.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product){

        productService.addProduct(product);
        return "Product added successfully";
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PutMapping("/updateProduct/{id}")
    public String updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct){
        productService.updateProduct(id, updatedProduct);
        return "Product updated successfully";
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return "Product deleted successfully";
    }

}
