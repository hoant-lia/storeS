package com.example.Store.data.model.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Generated("jsonschema2pojo")
public class Variant {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("product_id")
    @Expose
    private String  productId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("price")
    @Expose
    private Long price;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("inventory_policy")
    @Expose
    private String inventoryPolicy;
    @SerializedName("compare_at_price")
    @Expose
    private Long compareAtPrice;
    @SerializedName("fulfillment_service")
    @Expose
    private String fulfillmentService;
    @SerializedName("inventory_management")
    @Expose
    private String inventoryManagement;
    @SerializedName("option1")
    @Expose
    private String option1;
    @SerializedName("option2")
    @Expose
    private String option2;
    @SerializedName("option3")
    @Expose
    private Object option3;
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;
    @SerializedName("taxable")
    @Expose
    private Boolean taxable;
    @SerializedName("barcode")
    @Expose
    private String barcode;
    @SerializedName("grams")
    @Expose
    private Integer grams;
    @SerializedName("image_id")
    @Expose
    private Object imageId;
    @SerializedName("weight")
    @Expose
    private Double weight;
    @SerializedName("weight_unit")
    @Expose
    private String weightUnit;
    @SerializedName("inventory_item_id")
    @Expose
    private String inventoryItemId;
    @SerializedName("inventory_quantity")
    @Expose
    private Integer inventoryQuantity;
    @SerializedName("old_inventory_quantity")
    @Expose
    private Integer oldInventoryQuantity;
    @SerializedName("requires_shipping")
    @Expose
    private Boolean requiresShipping;
    @SerializedName("admin_graphql_api_id")
    @Expose
    private String adminGraphqlApiId;
}