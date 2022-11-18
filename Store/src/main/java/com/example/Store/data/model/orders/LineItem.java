package com.example.Store.data.model.orders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Generated("jsonschema2pojo")
public class LineItem {

    @SerializedName("id")
    @Expose
    private String  id;
    @SerializedName("admin_graphql_api_id")
    @Expose
    private String adminGraphqlApiId;
    @SerializedName("fulfillable_quantity")
    @Expose
    private Integer fulfillableQuantity;
    @SerializedName("fulfillment_service")
    @Expose
    private String fulfillmentService;
    @SerializedName("fulfillment_status")
    @Expose
    private Object fulfillmentStatus;
    @SerializedName("gift_card")
    @Expose
    private Boolean giftCard;
    @SerializedName("grams")
    @Expose
    private Integer grams;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("price_set")
    @Expose
    private PriceSet priceSet;
    @SerializedName("product_exists")
    @Expose
    private Boolean productExists;
    @SerializedName("product_id")
    @Expose
    private Long productId;
    @SerializedName("properties")
    @Expose
    private List<Object> properties = null;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("requires_shipping")
    @Expose
    private Boolean requiresShipping;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("taxable")
    @Expose
    private Boolean taxable;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("total_discount")
    @Expose
    private String totalDiscount;
    @SerializedName("total_discount_set")
    @Expose
    private PriceSet totalDiscountSet;
    @SerializedName("variant_id")
    @Expose
    private String variantId;
    @SerializedName("variant_inventory_management")
    @Expose
    private String variantInventoryManagement;
    @SerializedName("variant_title")
    @Expose
    private String variantTitle;
    @SerializedName("vendor")
    @Expose
    private String vendor;
    @SerializedName("tax_lines")
    @Expose
    private List<TaxLine> taxLines = null;
    @SerializedName("duties")
    @Expose
    private List<Object> duties = null;
    @SerializedName("discount_allocations")
    @Expose
    private List<Object> discountAllocations = null;
}
