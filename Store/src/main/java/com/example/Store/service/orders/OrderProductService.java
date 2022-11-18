package com.example.Store.service.orders;

import com.example.Store.entity.orders.OrderDB;
import com.example.Store.entity.orders.OrderProductDB;
import com.example.Store.repository.orders.OrderProductRepository;
import com.example.Store.repository.orders.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductService {
    @Autowired
    private OrderProductRepository orderProductRepository;

    public List<OrderProductDB> findAll(){
        return orderProductRepository.findAll();
    }
    public OrderProductDB findById(String id){
        return orderProductRepository.findById(id).get();
    }

    public OrderProductDB addOrderProduct(OrderProductDB orderProductDB){
        return orderProductRepository.save(orderProductDB);
    }
}
