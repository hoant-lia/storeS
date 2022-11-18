package com.example.Store.controller.admin;

import com.example.Store.entity.users.TbUser;
import com.example.Store.service.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<Object> getAllUser(){
        List<TbUser> users = userService.findAllUser();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable("id") String id){
        TbUser user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/users")
    public ResponseEntity<Object> addUser(@RequestBody TbUser user){
        TbUser user1 = userService.add(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
}
