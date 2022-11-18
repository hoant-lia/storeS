package com.example.Store.controller.admin;

import com.example.Store.entity.customers.CustomerDB;
import com.example.Store.entity.products.ProductDB;
import com.example.Store.service.products.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public ResponseEntity<Object> getAllProducts(){
        List<ProductDB> productDBS = productService.findAll();
        return ResponseEntity.ok(productDBS);
    }

    @GetMapping("/roducts/{id}")
    public ResponseEntity<Object> getCustomerById(@PathVariable("id") String id){
        Optional<ProductDB> productDB = productService.findById(id);
        return ResponseEntity.ok(productDB);
    }

    @PostMapping("/products/{id}")
    public ResponseEntity<Object> addCustomer(@RequestBody ProductDB productDB){
        ProductDB productDB1 = productService.addProduct(productDB);
        return ResponseEntity.status(HttpStatus.CREATED).body(productDB1);
    }
}
