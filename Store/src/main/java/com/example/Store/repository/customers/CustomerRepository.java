package com.example.Store.repository.customers;

import com.example.Store.entity.customers.CustomerDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDB,String > {
}
