package com.example.Store.data.model.products;

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
public class Product {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("body_html")
    @Expose
    private String bodyHtml;
    @SerializedName("vendor")
    @Expose
    private String vendor;
    @SerializedName("product_type")
    @Expose
    private String productType;
    @SerializedName("created_at")
    @Expose
    private Date createdAt;
    @SerializedName("handle")
    @Expose
    private String handle;
    @SerializedName("updated_at")
    @Expose
    private Date updatedAt;
    @SerializedName("published_at")
    @Expose
    private Object publishedAt;
    @SerializedName("template_suffix")
    @Expose
    private String templateSuffix;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("published_scope")
    @Expose
    private String publishedScope;
    @SerializedName("tags")
    @Expose
    private String tags;
    @SerializedName("admin_graphql_api_id")
    @Expose
    private String adminGraphqlApiId;
    @SerializedName("variants")
    @Expose
    private List<Variant> variants = null;
    @SerializedName("options")
    @Expose
    private List<Option> options = null;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("image")
    @Expose
    private Image image;
}
