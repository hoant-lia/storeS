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
public class TaxLine {

    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("rate")
    @Expose
    private Double rate;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("price_set")
    @Expose
    private PriceSet priceSet;
    @SerializedName("channel_liable")
    @Expose
    private Boolean channelLiable;
}
