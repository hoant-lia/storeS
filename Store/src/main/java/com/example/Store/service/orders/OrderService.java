package com.example.Store.service.orders;

import com.example.Store.entity.orders.OrderDB;
import com.example.Store.repository.orders.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<OrderDB> findAll(){
        return orderRepository.findAll();
    }
    public OrderDB findById(String id){
        return orderRepository.findById(id).get();
    }
    public OrderDB findByName(String name){
        return orderRepository.findByName(name);
    }
    public OrderDB addOrder(OrderDB orderDB){
        return orderRepository.save(orderDB);
    }
}
