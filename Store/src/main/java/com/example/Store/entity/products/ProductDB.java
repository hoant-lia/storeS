package com.example.Store.entity.products;

import com.example.Store.entity.vendors.TbVendor;
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
@Table(name = "tb_product")
public class ProductDB {
    @Id
    private String id;

    private String title;
    @Column(name = "_type")
    private String type;
    @Column(name = "_description")
    private String description;
    @Column(name = "_status")
    private String status;
    private Date created_at;
    private Date updated_at;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_vendor_id")
    private TbVendor vendor;

    @OneToMany(mappedBy = "product",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<ImageDB> imageDBS = new ArrayList<>();
    @OneToMany(mappedBy = "product",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<VariantDB> variantDBS = new ArrayList<>();

    public void addVariant(VariantDB variantDB){
        variantDBS.add(variantDB);
        variantDB.setProduct(this);
    }
    public void removeVariant(VariantDB variantDB) {
        variantDBS.remove(variantDB);
        variantDB.setProduct(null);
    }

    public void addImage(ImageDB imageDB){
        imageDBS.add(imageDB);
        imageDB.setProduct(this);
    }
    public void removeImage(ImageDB imageDB) {
        imageDBS.remove(imageDB);
        imageDB.setProduct(null);
    }

}
