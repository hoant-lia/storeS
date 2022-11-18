package com.example.Store.data.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/webhook")
public class Webhook {

    @PostMapping("/orders_update")
    public ResponseEntity<String> orderUpdate(@RequestBody String requestBody){
        System.out.println("OrderUpdate: "+requestBody);
        return new ResponseEntity<String>(requestBody, HttpStatus.OK);
    }
    @PostMapping("/orders_create")
    public ResponseEntity<String> orderCreate(@RequestBody String requestBody){
        System.out.println("OrderCreate: "+requestBody);
        return new ResponseEntity<String>(requestBody, HttpStatus.OK);
    }

}