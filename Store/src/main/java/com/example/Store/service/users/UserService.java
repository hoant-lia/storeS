package com.example.Store.service.users;

import com.example.Store.entity.users.TbUser;
import com.example.Store.repository.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<TbUser> findAllUser(){
        return userRepository.findAll();
    }
    public TbUser findById(String id){
        return userRepository.findById(id).get();
    }
    public TbUser add(TbUser user){
        return userRepository.save(user);
    }
}
