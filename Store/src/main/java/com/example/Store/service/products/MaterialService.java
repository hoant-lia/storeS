package com.example.Store.service.products;

import com.example.Store.entity.products.MaterialDB;
import com.example.Store.entity.products.StyleDB;
import com.example.Store.repository.products.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialService {
    @Autowired
    private MaterialRepository materialRepository;

    public List<MaterialDB> getAll(){
        return materialRepository.findAll();
    }

    public MaterialDB findByTitle(String title){
        return materialRepository.findByTitle(title);
    }
    public MaterialDB addMaterial(MaterialDB materialDB){
        return materialRepository.save(materialDB);
    }
    public Optional<MaterialDB> findById(String id){
        return materialRepository.findById(id);
    }
}
