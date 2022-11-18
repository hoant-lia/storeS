package com.example.Store.data.model.customers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("jsonschema2pojo")
public class Customer {

    @SerializedName(value = "id")
    @Expose
    private String id;

    @SerializedName(value = "email")
    @Expose
    private String email;

    @SerializedName(value = "accepts_marketing")
    @Expose
    private Boolean acceptsMarketing;

    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("orders_count")
    @Expose
    private Integer ordersCount;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("total_spent")
    @Expose
    private String totalSpent;
    @SerializedName("last_order_id")
    @Expose
    private Object lastOrderId;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("verified_email")
    @Expose
    private Boolean verifiedEmail;
    @SerializedName("multipass_identifier")
    @Expose
    private String multipassIdentifier;
    @SerializedName("tax_exempt")
    @Expose
    private Boolean taxExempt;
    @SerializedName("tags")
    @Expose
    private String tags;
    @SerializedName("last_order_name")
    @Expose
    private String lastOrderName;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("addresses")
    @Expose
    private List<Address> addresses = null;
    @SerializedName("accepts_marketing_updated_at")
    @Expose
    private String acceptsMarketingUpdatedAt;
    @SerializedName("marketing_opt_in_level")
    @Expose
    private String marketingOptInLevel;
    @SerializedName("tax_exemptions")
    @Expose
    private List<Object> taxExemptions = null;
    @SerializedName("email_marketing_consent")
    @Expose
    private String emailMarketingConsent;
    @SerializedName("sms_marketing_consent")
    @Expose
    private String smsMarketingConsent;
    @SerializedName("admin_graphql_api_id")
    @Expose
    private String adminGraphqlApiId;
    @SerializedName("default_address")
    @Expose
    private Address defaultAddress;
    public void customerToString(){
        System.out.println("id: "+id);
        System.out.println("Email: "+email);
        System.out.println("ordersCount: "+ordersCount);
        System.out.println("phone:" +phone);
        System.out.println("name:" +firstName+" "+lastName);
        System.out.println("addresses: "+addresses);
        System.out.println("default_addresses: "+defaultAddress);
    }
}
