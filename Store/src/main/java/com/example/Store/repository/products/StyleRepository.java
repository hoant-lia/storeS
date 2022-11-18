package com.example.Store.repository.products;

import com.example.Store.entity.products.ColorDB;
import com.example.Store.entity.products.StyleDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleRepository  extends JpaRepository<StyleDB,String> {
    public StyleDB findByTitle(String title);
}
