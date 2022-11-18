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
public class ClientDetails {

    @SerializedName("accept_language")
    @Expose
    private Object acceptLanguage;
    @SerializedName("browser_height")
    @Expose
    private Object browserHeight;
    @SerializedName("browser_ip")
    @Expose
    private Object browserIp;
    @SerializedName("browser_width")
    @Expose
    private Object browserWidth;
    @SerializedName("session_hash")
    @Expose
    private Object sessionHash;
    @SerializedName("user_agent")
    @Expose
    private Object userAgent;
}
