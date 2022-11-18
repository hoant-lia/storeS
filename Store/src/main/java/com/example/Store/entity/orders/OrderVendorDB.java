package com.example.Store.entity.orders;

import com.example.Store.entity.vendors.TbVendor;
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
@Table(name = "tb_order_vendor")
public class OrderVendorDB {
    @Id
    private String id;

    private String content;

    @Column(name = "_status")
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_vendor_id")
    private TbVendor vendor;
}
