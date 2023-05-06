package com.example.mog_0423;

import java.util.Random;

class Merchant {
    String merchantName;
    String merchantLocation;
    int merchantPurse;

    public Merchant(String merchantName, String merchantLocation, int merchantPurse){
        this.merchantName = merchantName;
        this.merchantLocation = merchantLocation;
        this.merchantPurse = merchantPurse;
    }

    public String getMerchantName() {
        return merchantName;
    }
    public String getMerchantLocation() {
        return merchantLocation;
    }
    public int getMerchantPurse() {
        Random random = new Random();
        int max = 750; int min = 500;
        merchantPurse = random.nextInt(max - min + 1) + min;
        return merchantPurse;
    }
}
