package com.example.Store.service.customers;

import com.example.Store.entity.customers.CustomerDB;
import com.example.Store.repository.customers.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerDB add(CustomerDB customerDB){
        return customerRepository.save(customerDB);
    }
    public List<CustomerDB> findAll(){
        return customerRepository.findAll();
    }
    public Optional<CustomerDB> findById(String id){
        return customerRepository.findById(id);
    }
}
