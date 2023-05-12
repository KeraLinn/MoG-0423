package com.example.mog_0423;

class Commodity {
    String commodityName;
    String commodityLocation;
    int commodityPrice;
    int commodityImage;

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
}
