package com.example.Store.data.model.orders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.Date;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Generated("jsonschema2pojo")
public class Order {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("admin_graphql_api_id")
    @Expose
    private String adminGraphqlApiId;
    @SerializedName("app_id")
    @Expose
    private Integer appId;
    @SerializedName("browser_ip")
    @Expose
    private Object browserIp;
    @SerializedName("buyer_accepts_marketing")
    @Expose
    private Boolean buyerAcceptsMarketing;
    @SerializedName("cancel_reason")
    @Expose
    private Object cancelReason;
    @SerializedName("cancelled_at")
    @Expose
    private Object cancelledAt;
    @SerializedName("cart_token")
    @Expose
    private Object cartToken;
    @SerializedName("checkout_id")
    @Expose
    private Long checkoutId;
    @SerializedName("checkout_token")
    @Expose
    private String checkoutToken;
    @SerializedName("client_details")
    @Expose
    private ClientDetails clientDetails;
    @SerializedName("closed_at")
    @Expose
    private Object closedAt;
    @SerializedName("confirmed")
    @Expose
    private Boolean confirmed;
    @SerializedName("contact_email")
    @Expose
    private Object contactEmail;
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("current_subtotal_price")
    @Expose
    private String currentSubtotalPrice;
    @SerializedName("current_subtotal_price_set")
    @Expose
    private PriceSet currentSubtotalPriceSet;
    @SerializedName("current_total_discounts")
    @Expose
    private String currentTotalDiscounts;
    @SerializedName("current_total_discounts_set")
    @Expose
    private PriceSet currentTotalDiscountsSet;
    @SerializedName("current_total_duties_set")
    @Expose
    private Object currentTotalDutiesSet;
    @SerializedName("current_total_price")
    @Expose
    private String currentTotalPrice;
    @SerializedName("current_total_price_set")
    @Expose
    private PriceSet currentTotalPriceSet;
    @SerializedName("current_total_tax")
    @Expose
    private String currentTotalTax;
    @SerializedName("current_total_tax_set")
    @Expose
    private PriceSet currentTotalTaxSet;
    @SerializedName("customer_locale")
    @Expose
    private Object customerLocale;
    @SerializedName("device_id")
    @Expose
    private Object deviceId;
    @SerializedName("discount_codes")
    @Expose
    private List<Object> discountCodes = null;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("estimated_taxes")
    @Expose
    private Boolean estimatedTaxes;
    @SerializedName("financial_status")
    @Expose
    private String financialStatus;
    @SerializedName("fulfillment_status")
    @Expose
    private Object fulfillmentStatus;
    @SerializedName("gateway")
    @Expose
    private String gateway;
    @SerializedName("landing_site")
    @Expose
    private Object landingSite;
    @SerializedName("landing_site_ref")
    @Expose
    private Object landingSiteRef;
    @SerializedName("location_id")
    @Expose
    private Long locationId;
    @SerializedName("merchant_of_record_app_id")
    @Expose
    private Object merchantOfRecordAppId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("note")
    @Expose
    private Object note;
    @SerializedName("note_attributes")
    @Expose
    private List<Object> noteAttributes = null;
    @SerializedName("number")
    @Expose
    private Integer number;
    @SerializedName("order_number")
    @Expose
    private Integer orderNumber;
    @SerializedName("order_status_url")
    @Expose
    private String orderStatusUrl;
    @SerializedName("original_total_duties_set")
    @Expose
    private Object originalTotalDutiesSet;
    @SerializedName("payment_gateway_names")
    @Expose
    private List<String> paymentGatewayNames = null;
    @SerializedName("phone")
    @Expose
    private Object phone;
    @SerializedName("presentment_currency")
    @Expose
    private String presentmentCurrency;
    @SerializedName("processed_at")
    @Expose
    private String processedAt;
    @SerializedName("processing_method")
    @Expose
    private String processingMethod;
    @SerializedName("reference")
    @Expose
    private Object reference;
    @SerializedName("referring_site")
    @Expose
    private Object referringSite;
    @SerializedName("source_identifier")
    @Expose
    private Object sourceIdentifier;
    @SerializedName("source_name")
    @Expose
    private String sourceName;
    @SerializedName("source_url")
    @Expose
    private Object sourceUrl;
    @SerializedName("subtotal_price")
    @Expose
    private String subtotalPrice;
    @SerializedName("subtotal_price_set")
    @Expose
    private PriceSet subtotalPriceSet;
    @SerializedName("tags")
    @Expose
    private String tags;
    @SerializedName("tax_lines")
    @Expose
    private List<TaxLine> taxLines = null;
    @SerializedName("taxes_included")
    @Expose
    private Boolean taxesIncluded;
    @SerializedName("test")
    @Expose
    private Boolean test;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("total_discounts")
    @Expose
    private String totalDiscounts;
    @SerializedName("total_discounts_set")
    @Expose
    private PriceSet totalDiscountsSet;
    @SerializedName("total_line_items_price")
    @Expose
    private String totalLineItemsPrice;
    @SerializedName("total_line_items_price_set")
    @Expose
    private PriceSet totalLineItemsPriceSet;
    @SerializedName("total_outstanding")
    @Expose
    private String totalOutstanding;
    @SerializedName("total_price")
    @Expose
    private String totalPrice;
    @SerializedName("total_price_set")
    @Expose
    private PriceSet totalPriceSet;
    @SerializedName("total_shipping_price_set")
    @Expose
    private PriceSet totalShippingPriceSet;
    @SerializedName("total_tax")
    @Expose
    private String totalTax;
    @SerializedName("total_tax_set")
    @Expose
    private PriceSet totalTaxSet;
    @SerializedName("total_tip_received")
    @Expose
    private String totalTipReceived;
    @SerializedName("total_weight")
    @Expose
    private Integer totalWeight;
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;
    @SerializedName("user_id")
    @Expose
    private Long userId;
    @SerializedName("discount_applications")
    @Expose
    private List<Object> discountApplications = null;
    @SerializedName("fulfillments")
    @Expose
    private List<Object> fulfillments = null;
    @SerializedName("line_items")
    @Expose
    private List<LineItem> lineItems = null;
    @SerializedName("payment_terms")
    @Expose
    private PaymentTerms paymentTerms;
    @SerializedName("refunds")
    @Expose
    private List<Object> refunds = null;
    @SerializedName("shipping_lines")
    @Expose
    private List<Object> shippingLines = null;
}
