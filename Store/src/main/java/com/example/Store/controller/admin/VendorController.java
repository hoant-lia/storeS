package com.example.Store.controller.admin;

import com.example.Store.entity.users.TbUser;
import com.example.Store.entity.vendors.TbVendor;
import com.example.Store.service.vendors.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @GetMapping("/vendors")
    public ResponseEntity<Object> getAllUser(){
        List<TbVendor> vendors = vendorService.getAll();
        return ResponseEntity.ok(vendors);
    }

    @GetMapping("/vendors/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable("id") String id){
        TbVendor vendor = vendorService.findById(id);
        return ResponseEntity.ok(vendor);
    }

    @PostMapping("/vendors")
    public ResponseEntity<Object> addUser(@RequestBody TbVendor vendor){
        TbVendor vendor1 = vendorService.add(vendor);
        return ResponseEntity.status(HttpStatus.CREATED).body(vendor1);
    }
}
