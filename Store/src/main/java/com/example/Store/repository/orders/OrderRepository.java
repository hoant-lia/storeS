package com.example.Store.repository.orders;

import com.example.Store.entity.orders.OrderDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderDB,String > {

    public OrderDB findByName(String name);
}
