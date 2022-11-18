package com.example.Store.service.products;

import com.example.Store.entity.products.ProductDB;
import com.example.Store.repository.products.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductDB> findAll(){
        return productRepository.findAll();
    }
    public Optional<ProductDB> findById(String id){
        return productRepository.findById(id);
    }
    public ProductDB addProduct(ProductDB productDB){
        return productRepository.save(productDB);
    }

}
