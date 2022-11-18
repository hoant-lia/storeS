package com.example.Store.service.products;

import com.example.Store.entity.products.VariantDB;
import com.example.Store.repository.products.VariantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VariantService {
    @Autowired
    private VariantRepository variantRepository;

    public List<VariantDB> findAll(){
        return variantRepository.findAll();
    }
    public VariantDB addVariant(VariantDB variantDB){
        return variantRepository.save(variantDB);
    }
    public VariantDB findById(String id){
        return variantRepository.findById(id).get();
    }
}
