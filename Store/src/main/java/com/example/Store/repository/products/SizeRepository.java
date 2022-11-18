package com.example.Store.repository.products;

import com.example.Store.entity.products.ColorDB;
import com.example.Store.entity.products.SizeDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends JpaRepository<SizeDB,String > {
    public SizeDB findByTitle(String title);
}
