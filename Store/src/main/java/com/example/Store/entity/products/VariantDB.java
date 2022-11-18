package com.example.Store.entity.products;

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
@Table(name = "tb_variant")
public class VariantDB {
    @Id
    private String id;

    private double price;
    private double compare_at_price;
    private double weight;
    private String weight_unit;
    private Long quantity;
    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_material_id")
    private MaterialDB material;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_size_id")
    private SizeDB size;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_color_id")
    private ColorDB color;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_style_id")
    private StyleDB style;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_product_id")
    private ProductDB product;
}
