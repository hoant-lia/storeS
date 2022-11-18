package com.example.Store.entity.customers;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_country")
public class CountryDB {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String country;
    private String city;
    private Date created_at;
    private Date updated_at;

    @OneToMany(mappedBy = "country",
                cascade = CascadeType.ALL,
                orphanRemoval = true)
    private List<CustomerDB> customerDBS = new ArrayList<>();

    public void show(){
        System.out.println("Country: "+id+", "+city+", "+country+", "+created_at+", "+updated_at);
    }
    public void addCustomer(CustomerDB customerDB){
        customerDBS.add(customerDB);
        customerDB.setCountry(this);
    }
    public void removeCustomer(CustomerDB customerDB){
        customerDBS.remove(customerDB);
        customerDB.setCountry(null);
    }
}
