package com.example.Store.entity.customers;

import com.example.Store.entity.orders.CheckoutDB;
import com.example.Store.entity.orders.OrderDB;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_customer")
public class CustomerDB{
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String first_name;
    private String last_name;
    private String address1;
    private String address2;
    private String phonenumber;
    private String email;
    private Date created_at;
    private Date updated_at;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_country_id")
    private CountryDB country;

//    @OneToMany(mappedBy = "customerDB",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true)
//    private List<OrderDB> orderDBS = new ArrayList<>();


    public void show(){
        System.out.println(id + " - "+first_name+" - "+last_name + " - "+address1+ " - "+address2 + " - "+phonenumber+ " - "+email + " - "+created_at+ " - "+updated_at);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerDB )) return false;
        return id != null && id.equals(((CustomerDB) o).getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public void addOrder(OrderDB orderDB){
//        orderDBS.add(orderDB);
//        orderDB.setCustomerDB(this);
    }
    public void removeOrder(OrderDB orderDB){
//        orderDBS.remove(orderDB);
//        orderDB.setCustomerDB(null);
    }

}