package com.example.Store.service.vendors;

import com.example.Store.entity.vendors.TbVendor;
import com.example.Store.repository.vendors.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendorService {
    @Autowired
    private VendorRepository vendorRepository;
    public List<TbVendor> getAll(){
        return vendorRepository.findAll();
    }
    public TbVendor findById(String id){
        return vendorRepository.findById(id).get();
    }
    public TbVendor add(TbVendor vendor){
        return vendorRepository.save(vendor);
    }
    public TbVendor findByName(String name){
        return vendorRepository.findByName(name);
    }
}
