package com.example.Store.repository.products;

import com.example.Store.entity.products.ProductDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductDB,String> {
}
