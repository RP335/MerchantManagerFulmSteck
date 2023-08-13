package com.pinelabs.dto;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.pinelabs.dto")

public class MerchantDTO {

    private Integer merchantId;
    private String merchantName;
    private String merchantMobile;
    private String merchantEmail;
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
