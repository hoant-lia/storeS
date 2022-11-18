package com.example.Store.repository.products;

import com.example.Store.entity.products.ColorDB;
import com.example.Store.entity.products.MaterialDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<MaterialDB,String > {
    public MaterialDB findByTitle(String title);
}
