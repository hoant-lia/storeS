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
public class PaymentSchedule {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("amount")
    @Expose
    private String amount;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("issued_at")
    @Expose
    private String issuedAt;
    @SerializedName("due_at")
    @Expose
    private String dueAt;
    @SerializedName("completed_at")
    @Expose
    private Object completedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
}
