package com.example.Store.repository.orders;

import com.example.Store.entity.orders.CheckoutDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutDB,String > {
}
