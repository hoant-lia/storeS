package com.example.Store.repository.vendors;

import com.example.Store.entity.vendors.TbVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<TbVendor,String > {
    public TbVendor findByName(String name);
}
