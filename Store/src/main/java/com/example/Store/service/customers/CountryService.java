package com.example.Store.service.customers;

import com.example.Store.entity.customers.CountryDB;
import com.example.Store.repository.customers.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public CountryDB add(CountryDB countryDB){
        return countryRepository.save(countryDB);
    }
    public String findCountry(CountryDB countryDB){
        System.out.println("findCountry");
        List<CountryDB> countryDB1=  countryRepository.findByCityAndAndCountry(countryDB.getCity(), countryDB.getCountry());
        System.out.println("Country:" +countryDB1.size());
        if(countryDB1.size()!=0) return countryDB1.get(0).getId();
        return null;
    }
}
