package com.example.mog_0423;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Commodity {
    String commodityName;
    String commodityLocation;
    int commodityPrice;
    int commodityImage;
    int qtyAvail;
    Map<String,String> mapCommodityLocation = new HashMap<>();

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
        Random random = new Random();
        int max = 30; int min = 5;
        commodityPrice = random.nextInt(max - min + 1) + min;
        return commodityPrice;
    }
    public int getCommodityImage() {
        return commodityImage;
    }

    public int getQuantityAvailable() {
        return qtyAvail;
    }

    public Map<String,String> getMapCommodityLocation(){
        mapCommodityLocation.put("Apples","Opalancy");
        mapCommodityLocation.put("Mango","Opalancy");
        mapCommodityLocation.put("Dragonfruit","Opalancy");
        mapCommodityLocation.put("Orange","Opalancy");
        mapCommodityLocation.put("Coconut","Opalancy");
        mapCommodityLocation.put("Raspberry","Rubya");
        mapCommodityLocation.put("Strawberry","Rubya");
        mapCommodityLocation.put("Cherry","Rubya");
        mapCommodityLocation.put("Blueberries","Rubya");
        mapCommodityLocation.put("Oats","Rubya");
        mapCommodityLocation.put("Asparagus","Rubya");
        mapCommodityLocation.put("Apricot","Tourmalina");
        mapCommodityLocation.put("Olive","Tourmalina");
        mapCommodityLocation.put("Peach","Tourmalina");
        mapCommodityLocation.put("Zucchini","Tourmalina");
        mapCommodityLocation.put("Bell Pepper","Tourmalina");
        mapCommodityLocation.put("Onion","Sapphira");
        mapCommodityLocation.put("Grapes","Sapphira");
        mapCommodityLocation.put("Peas","Sapphira");
        mapCommodityLocation.put("Leek","Sapphira");
        mapCommodityLocation.put("Celery","Sapphira");
        mapCommodityLocation.put("Beet","Emeraldis");
        mapCommodityLocation.put("Mushroom","Emeraldis");
        mapCommodityLocation.put("Garlic","Emeraldis");
        mapCommodityLocation.put("Carrots","Emeraldis");
        mapCommodityLocation.put("Radish","Emeraldis");
        mapCommodityLocation.put("Broccoli","Diamondaria");
        mapCommodityLocation.put("Cauliflower","Diamondaria");
        mapCommodityLocation.put("Artichoke","Diamondaria");
        mapCommodityLocation.put("Cabbage","Diamondaria");
        mapCommodityLocation.put("Purple Cabbage","Diamondaria");
        mapCommodityLocation.put("Corn","Jade Empire");
        mapCommodityLocation.put("Flax","Jade Empire");
        mapCommodityLocation.put("Lentils","Jade Empire");
        mapCommodityLocation.put("Lettuce","Jade Empire");
        mapCommodityLocation.put("Bok Choy","Jade Empire");
        mapCommodityLocation.put("Eggplant","Onyx Coast");
        mapCommodityLocation.put("Cashews","Onyx Coast");
        mapCommodityLocation.put("Peanuts","Onyx Coast");
        mapCommodityLocation.put("Hazelnuts","Onyx Coast");
        mapCommodityLocation.put("Pecans","Onyx Coast");
        mapCommodityLocation.put("Pomegranate","Amethyst City");
        mapCommodityLocation.put("Plum","Amethyst City");
        mapCommodityLocation.put("Pear","Amethyst City");
        mapCommodityLocation.put("Pineapple","Amethyst City");
        mapCommodityLocation.put("Banana","Amethyst City");
        mapCommodityLocation.put("Tomato","Agatia");
        mapCommodityLocation.put("Pumpkin","Agatia");
        mapCommodityLocation.put("Squash","Agatia");
        mapCommodityLocation.put("White Beans","Agatia");
        mapCommodityLocation.put("Potato","Agatia");
        return mapCommodityLocation;
    }


}
