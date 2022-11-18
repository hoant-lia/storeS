package com.example.Store.entity.orders;

import com.example.Store.entity.products.VariantDB;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_order_product")
public class OrderProductDB {
    @Id
    private String id;
    private int quantity;
    private Long tax;
    @Column(name = "_status")
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_order_id")
    private OrderDB order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_variant_id")
    private VariantDB variant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_order_vendor_id")
    private OrderVendorDB orderVendorDB;
}
