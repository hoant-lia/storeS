package com.example.Store.entity.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_size")
public class SizeDB {
    @Id
    private String id;
    private String title;

    @OneToMany(mappedBy = "size",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<VariantDB> variantDBS = new ArrayList<>();
    public void addVariant(VariantDB variantDB){
        variantDBS.add(variantDB);
        variantDB.setSize(this);
    }
    public void removeVariant(VariantDB variantDB) {
        variantDBS.remove(variantDB);
        variantDB.setSize(null);
    }
}
