package com.example.Store.entity.orders;

import com.example.Store.entity.customers.CustomerDB;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_order")
public class OrderDB {
    @Id
    private String id;

    @Column(name = "_name")
    private String name;
    private  double total_price;
    private String currency_code;
    private double total_discounts;
    private double total_tax;
    @Column(name = "_status")
    private String status;
    private Date created_at;
    private Date updated_at;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_customer_id")
    private CustomerDB customerDB;

    @OneToOne(mappedBy = "order")
    private CheckoutDB checkoutDB;

    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "order",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<OrderProductDB> orderProductDBS = new ArrayList<>();

    public void addOrderProduct(OrderProductDB orderProductDB){
        orderProductDBS.add(orderProductDB);
        orderProductDB.setOrder(this);
    }
    public void removeOrderProduct(OrderProductDB orderProductDB){
        orderProductDBS.remove(orderProductDB);
        orderProductDB.setOrder(null);
    }

}
