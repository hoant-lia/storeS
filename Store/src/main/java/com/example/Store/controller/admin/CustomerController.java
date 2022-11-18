package com.example.Store.controller.admin;

import com.example.Store.entity.customers.CustomerDB;
import com.example.Store.service.customers.CountryService;
import com.example.Store.service.customers.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CountryService countryService;

    @GetMapping("/customers")
    public ResponseEntity<Object> getAllCustomers(){
        List<CustomerDB> customerDBS = customerService.findAll();
        return ResponseEntity.ok(customerDBS);
    }

    @GetMapping("customers/{id}")
    public ResponseEntity<Object> getCustomerById(@PathVariable("id") String id){
        Optional<CustomerDB> customerDB = customerService.findById(id);
        return ResponseEntity.ok(customerDB);
    }

    @PostMapping("/customers/{id}")
    public ResponseEntity<Object> addCustomer(@RequestBody CustomerDB customerDB){
        CustomerDB customerDB1 = customerService.add(customerDB);
        return ResponseEntity.status(HttpStatus.CREATED).body(customerDB1);
    }
}
