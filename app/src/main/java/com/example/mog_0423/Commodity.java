package com.example.mog_0423;

import java.lang.reflect.Array;
import java.util.Collection;

class Commodity {
    Collection<Commodity> commodityCollection;
    Commodity[] commodityArray;
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
    //Commodity[] commodityArray = new Commodity[]{R.drawable.basket_of_carrots}

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


    public void getAllCommodities(){
        commodityCollection.add(new Commodity("Apples","Rubya",10,
                R.drawable.icons8_apples_plate_100));
        commodityCollection.add(new Commodity("Apricots","Tourmalina",8,
                R.drawable.icons8_apricot_100));
        commodityCollection.add(new Commodity("Asparagus","Agatia",6,
                R.drawable.icons8_asparagus_100));
        commodityCollection.add(new Commodity("Banana","Onyx Coast",4,
                R.drawable.icons8_banana_100));
        commodityCollection.add(new Commodity("Blueberries","Sapphira",7,
                R.drawable.icons8_blueberry_100));
    }
}
