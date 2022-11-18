package com.example.Store.data.services.vendors;

import com.example.Store.entity.vendors.TbVendor;
import com.example.Store.service.vendors.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorServiceData {

    private VendorService vendorService;
//    public TbVendor addVendor(TbVendor tbVendor){
//        TbVendor vendor = new TbVendor();
//        if(vendorService.findByName(tbVendor.getName())==null) {
//            vendor.setName(tbVendor.getName());
//            vendor.setCreated_at(tbVendor.getCreated_at());
//            vendor.setUpdated_at(tbVendor.getUpdated_at());
////            String id_vendor = randomId;
////            vendor.setId(id_vendor);
//            vendor.show();
//            vendorService.add(vendor);
//            System.out.println("add vendor done");
//        }
//    }


}
