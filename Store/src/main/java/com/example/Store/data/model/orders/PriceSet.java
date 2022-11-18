package com.example.Store.data.model.orders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.processing.Generated;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Generated("jsonschema2pojo")
public class PriceSet {

    @SerializedName("shop_money")
    @Expose
    private ShopMoney shopMoney;
    @SerializedName("presentment_money")
    @Expose
    private PresentmentMoney presentmentMoney;
}
