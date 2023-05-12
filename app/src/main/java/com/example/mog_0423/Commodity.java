package com.example.mog_0423;

import java.util.ArrayList;
import java.util.Collection;

class Commodity {
    Collection<Commodity> commodityCollection;
    ArrayList<Commodity> commodityArray = new ArrayList<>();
    String commodityName;
    String commodityLocation;
    int commodityPrice;
    int commodityImage;

    public void Collection(Collection<Commodity> commodityCollection) {
        this.commodityCollection = commodityCollection;
    }

    public Commodity(String commodityName, String commodityLocation, int commodityPrice,
                      int commodityImage) {
        this.commodityName = commodityName;
        this.commodityLocation = commodityLocation;
        this.commodityPrice = commodityPrice;
        this.commodityImage = commodityImage;
    }
    public Commodity(int i) {
        for(int z =0; z < commodityArray.size(); z++){

        }
        commodityArray.add(i, new Commodity("Apples", "Rubya", 10,
                R.drawable.icons8_apples_plate_100));
        commodityArray.add(i, new Commodity("Apricots", "Tourmalina", 8,
                R.drawable.icons8_apricot_100));
        commodityArray.add(i, new Commodity("Asparagus", "Agatia", 6,
                R.drawable.icons8_asparagus_100));
        commodityArray.add(i, new Commodity("Banana", "Onyx Coast", 4,
                R.drawable.icons8_banana_100));
        commodityArray.add(i, new Commodity("Blueberries", "Sapphira", 7,
                R.drawable.icons8_blueberry_100));

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
