package com.example.Store.service.orders;

import com.example.Store.entity.orders.CheckoutDB;
import com.example.Store.entity.orders.OrderProductDB;
import com.example.Store.repository.orders.CheckoutRepository;
import com.example.Store.repository.orders.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckoutService {
    @Autowired
    private CheckoutRepository checkoutRepository;

    public List<CheckoutDB> findAll(){
        return checkoutRepository.findAll();
    }
    public CheckoutDB findById(String id){
        return checkoutRepository.findById(id).get();
    }

    public CheckoutDB addCheckout(CheckoutDB checkoutDB){
        return checkoutRepository.save(checkoutDB);
    }
}
