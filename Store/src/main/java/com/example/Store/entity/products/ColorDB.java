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
@Table(name = "tb_color")
public class ColorDB {
    @Id
    private String id;
    private String title;

    @OneToMany(mappedBy = "color",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<VariantDB> variantDBS = new ArrayList<>();

    public void addVariant(VariantDB variantDB){
        variantDBS.add(variantDB);
        variantDB.setColor(this);
    }
    public void removeVariant(VariantDB variantDB){
        variantDBS.remove(variantDB);
        variantDB.setColor(null);
    }
}
