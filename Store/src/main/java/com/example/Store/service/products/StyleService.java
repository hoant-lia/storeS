package com.example.Store.service.products;

import com.example.Store.entity.products.SizeDB;
import com.example.Store.entity.products.StyleDB;
import com.example.Store.repository.products.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StyleService {
    @Autowired
    private StyleRepository styleRepository;
    public List<StyleDB> getAll(){
        return styleRepository.findAll();
    }

    public StyleDB findByTitle(String title){
        return styleRepository.findByTitle(title);
    }
    public StyleDB addStyle(StyleDB styleDB){
        return styleRepository.save(styleDB);
    }
    public Optional<StyleDB> findById(String id){
        return styleRepository.findById(id);
    }
}
