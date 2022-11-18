package com.example.Store.service.products;

import com.example.Store.entity.products.ImageDB;
import com.example.Store.repository.products.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    public ImageDB addImage(ImageDB imageDB){
        return imageRepository.save(imageDB);
    }
    public List<ImageDB> getAll(){
        return imageRepository.findAll();
    }
    public Optional<ImageDB> findById(String id){
        return imageRepository.findById(id);
    }
}
