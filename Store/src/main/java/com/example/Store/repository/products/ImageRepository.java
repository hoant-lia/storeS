package com.example.Store.repository.products;

import com.example.Store.entity.products.ImageDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<ImageDB,String> {
}
