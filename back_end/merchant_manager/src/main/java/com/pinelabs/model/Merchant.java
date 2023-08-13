package com.pinelabs.model;

import jakarta.persistence.*;

import org.springframework.context.annotation.ComponentScan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@ComponentScan(basePackages = "com.pinelabs.model")

@Entity
@Table(name = "merchant")
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "merchant_id")
    private Integer merchantId;

    @Column(name = "merchant_name")
    private String merchantName;

    @Column(name = "merchant_email")
    private String merchantEmail;

    @Column(name = "merchant_mobile")
    private String merchantMobile;

    @Column(name = "merchant_business_category")
    private String merchantBusinessCategory;


   

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantMobile() {
        return merchantMobile;
    }

    public void setMerchantMobile(String merchantMobile) {
        this.merchantMobile = merchantMobile;
    }

    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail;
    }

    public String getMerchantBusinessCategory() {
        return merchantBusinessCategory;
    }

    public void setMerchantBusinessCategory(String merchantBusinessCategory) {
        this.merchantBusinessCategory = merchantBusinessCategory;
    }
}
