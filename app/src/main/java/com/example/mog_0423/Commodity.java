package com.example.mog_0423;

import java.util.HashMap;
import java.util.Map;

class Commodity {
    String commodityName;
    String commodityLocation;
    int commodityPrice;
    int commodityImage;
    int qtyAvail;
    Map<Commodity,String> map1;
    Map<Integer, Map<Commodity,String>> map2;

    public Commodity(String commodityName, String commodityLocation, int commodityPrice,
                      int commodityImage) {
        this.commodityName = commodityName;
        this.commodityLocation = commodityLocation;
        this.commodityPrice = commodityPrice;
        this.commodityImage = commodityImage;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public String getCommodityLocation() {
        return commodityLocation;
    }

    public int getCommodityPrice() {
        return commodityPrice;
    }

    public int getCommodityImage() {
        return commodityImage;
    }

    public int getQuantityAvailable() {
        return qtyAvail;
    }

    public Map setUpMap1(){
        map1.put(new Commodity("Apples","Opalancy", getCommodityPrice(),
                R.drawable.icons8_apples_plate_100),getCommodityLocation());

        return map1;
    }


}
