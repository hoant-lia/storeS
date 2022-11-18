package com.example.Store.entity.vendors;

import com.example.Store.entity.orders.OrderVendorDB;
import com.example.Store.entity.products.ProductDB;
import com.example.Store.entity.users.TbUser;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_vendor")
public class TbVendor {
    @Id
    private String id;

    private String name;
    private Date created_at;
    private Date updated_at;
    @OneToMany(mappedBy = "vendor",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<TbUser> users = new ArrayList<>();

    @OneToMany(mappedBy = "vendor",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<ProductDB> productDBS = new ArrayList<>();
    public TbVendor() {
    }

    @OneToMany(mappedBy = "vendor",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<OrderVendorDB> orderVendorDBS = new ArrayList<>();

    public TbVendor(String id, String name, Date created_at, Date updated_at, List<TbUser> users) {
        this.id = id;
        this.name = name;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.users = users;
    }
    public void addUser(TbUser user){
        users.add(user);
        user.setVendor(this);
    }
    public void removeUSer(TbUser user){
        users.remove(user);
        user.setVendor(null);
    }

    public void addOrderVendor(OrderVendorDB orderVendorDB){
        orderVendorDBS.add(orderVendorDB);
        orderVendorDB.setVendor(this);
    }

    public void removeOrderVendor(OrderVendorDB orderVendorDB){
        orderVendorDBS.remove(orderVendorDB);
        orderVendorDB.setVendor(null);
    }
    public void addProduct(ProductDB productDB){
        productDBS.add(productDB);
        productDB.setVendor(this);
    }
    public void removeProduct(ProductDB productDB){
        productDBS.remove(productDB);
        productDB.setVendor(null);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }



    public void setUsers(List<TbUser> users) {
        this.users = users;
    }
    public void show(){
        System.out.println("Vendor: "+id+", "+name);
    }
}
