package com.example.mog_0423;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Merchant {
    Collection<Merchant> merchantCollection;
    String merchantFirstName;
    String merchantLastName;
    String merchantLocation;
    int merchantPurse;

    public Merchant(String merchantFirstName, String merchantLastName, String merchantLocation,
                    int merchantPurse){
        this.merchantFirstName = merchantFirstName;
        this.merchantLastName = merchantLastName;
        this.merchantLocation = merchantLocation;
        this.merchantPurse = merchantPurse;
    }


    public int getMerchantPurse() {
        Random random = new Random();
        int max = 750; int min = 500;
        merchantPurse = random.nextInt(max - min + 1) + min;
        return merchantPurse;
    }


    public void getAllMerchants(){
        merchantCollection.add(new Merchant("Zakiya","Melendez","Sapphira", getMerchantPurse()));
        merchantCollection.add(new Merchant("Kareem","Roman","Rubya", getMerchantPurse()));
        merchantCollection.add(new Merchant("Maja","Hansen","Rubya", getMerchantPurse()));
        merchantCollection.add(new Merchant("Oisin","David","Tourmalina", getMerchantPurse()));
        merchantCollection.add(new Merchant("Jan","Herrera","Emeraldis", getMerchantPurse()));
        merchantCollection.add(new Merchant("Uzair","Orozco","Emeraldis", getMerchantPurse()));
        merchantCollection.add(new Merchant("Milena","Morhen","Diamondaria", getMerchantPurse()));
        merchantCollection.add(new Merchant("Khalil","Parrish","Jade Empire", getMerchantPurse()));
        merchantCollection.add(new Merchant("Vera","Robles","Jade Empire", getMerchantPurse()));
        merchantCollection.add(new Merchant("Regan","Bowers","Onyx Coast", getMerchantPurse()));
        merchantCollection.add(new Merchant("Serrano","Khan","Onyx Coast", getMerchantPurse()));
        merchantCollection.add(new Merchant("Aryan","Duke","Opalancy", getMerchantPurse()));
        merchantCollection.add(new Merchant("Chaya","Luna","Opalancy", getMerchantPurse()));
        merchantCollection.add(new Merchant("Zuzanna","Estel","Amethyst City",
                getMerchantPurse()));
        merchantCollection.add(new Merchant("Rowan","Fischer","Agatia", getMerchantPurse()));
    }

}
