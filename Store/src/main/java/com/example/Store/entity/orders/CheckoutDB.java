package com.example.Store.entity.orders;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_checkout")
public class CheckoutDB {
    @Id
    private String id;
    private String first_name;
    private String last_name;
    private String address1;
    private String address2;
    private String phonenumber;
    private String email;
    private Date created_at;
    private Date updated_at;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tb_order_id", referencedColumnName = "id")
    private  OrderDB order;
}
