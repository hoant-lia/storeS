package com.example.Store.repository.customers;

import com.example.Store.entity.customers.CountryDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<CountryDB,String > {
    List<CountryDB> findByCityAndAndCountry(String city, String country);
}
