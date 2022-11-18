package com.example.Store.service.products;

import com.example.Store.entity.products.ColorDB;
import com.example.Store.repository.products.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColorService {

    @Autowired
    private ColorRepository colorRepository;

    public List<ColorDB> findAll(){
        return colorRepository.findAll();
    }

    public Optional<ColorDB> findById(String id){
        return colorRepository.findById(id);
    }
    public ColorDB addColor(ColorDB colorDB){
        return colorRepository.save(colorDB);
    }
    public ColorDB findByTitle(String title){
        return colorRepository.findByTitle(title);
    }
}
