package com.example.Store.service.orders;

import com.example.Store.entity.orders.OrderProductDB;
import com.example.Store.entity.orders.OrderVendorDB;
import com.example.Store.repository.orders.OrderProductRepository;
import com.example.Store.repository.orders.OrderVenorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderVendorService {
    @Autowired
    private OrderVenorRepository orderVenorRepository;

    public List<OrderVendorDB> findAll(){
        return orderVenorRepository.findAll();
    }
    public OrderVendorDB findById(String id){
        return orderVenorRepository.findById(id).get();
    }

    public OrderVendorDB addOrderVendor(OrderVendorDB orderVendorDB){
        return orderVenorRepository.save(orderVendorDB);
    }
}
