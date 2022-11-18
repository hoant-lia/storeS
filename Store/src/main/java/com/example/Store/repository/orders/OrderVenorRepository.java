package com.example.Store.repository.orders;

import com.example.Store.entity.orders.OrderDB;
import com.example.Store.entity.orders.OrderVendorDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderVenorRepository extends JpaRepository<OrderVendorDB,String> {

}
