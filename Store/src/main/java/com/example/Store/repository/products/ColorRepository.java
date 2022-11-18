package com.example.Store.repository.products;

import com.example.Store.entity.products.ColorDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<ColorDB,String > {
    public ColorDB findByTitle(String title);
}
