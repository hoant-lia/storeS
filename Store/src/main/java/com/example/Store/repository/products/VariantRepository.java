package com.example.Store.repository.products;

import com.example.Store.entity.products.VariantDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariantRepository extends JpaRepository<VariantDB,String > {
}
