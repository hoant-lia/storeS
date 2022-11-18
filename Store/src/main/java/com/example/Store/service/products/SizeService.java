package com.example.Store.service.products;

import com.example.Store.entity.products.SizeDB;
import com.example.Store.repository.products.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SizeService {

    @Autowired
    private SizeRepository sizeRepository;

    public List<SizeDB> getAll(){
        return sizeRepository.findAll();
    }

    public SizeDB findByTitle(String title){
        return sizeRepository.findByTitle(title);
    }
    public SizeDB addSize(SizeDB sizeDB){
        return sizeRepository.save(sizeDB);
    }
    public Optional<SizeDB> findById(String id){
        return sizeRepository.findById(id);
    }
}
