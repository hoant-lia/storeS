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
public class PaymentTerms {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("due_in_days")
    @Expose
    private Integer dueInDays;
    @SerializedName("payment_schedules")
    @Expose
    private List<PaymentSchedule> paymentSchedules = null;
    @SerializedName("payment_terms_name")
    @Expose
    private String paymentTermsName;
    @SerializedName("payment_terms_type")
    @Expose
    private String paymentTermsType;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
}
