package com.example.mog_0423;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Commodity {
    String commodityName;
    String commodityLocation;
    int commodityPrice;
    int commodityImage;
    int qtyAvail = 10;

    Map<String,String> mapCommodityLocation = new HashMap<>();
    Map<String, Integer> mapCommodityDrawables = new HashMap<>();
    ArrayList<Commodity> opalancyCommodityArrayList = new ArrayList<>();
    ArrayList<Commodity> rubyaCommodityArrayList = new ArrayList<>();
    ArrayList<Commodity> sapphiraCommodityArrayList = new ArrayList<>();
    ArrayList<Commodity> emeraldisCommodityArrayList = new ArrayList<>();
    ArrayList<Commodity> diamondariaCommodityArrayList = new ArrayList<>();
    ArrayList<Commodity> tourmalinaCommodityArrayList = new ArrayList<>();
    ArrayList<Commodity> jadeEmpireCommodityArrayList = new ArrayList<>();
    ArrayList<Commodity> onyxCoastCommodityArrayList = new ArrayList<>();
    ArrayList<Commodity> agatiaCommodityArrayList = new ArrayList<>();
    ArrayList<Commodity> amethystCityCommodityArrayList = new ArrayList<>();
    ArrayList<Commodity> startingInventoryArrayList = new ArrayList<>();

    public Commodity(String commodityName, String commodityLocation, int commodityPrice,
                     int commodityImage, int qtyAvail) {
        this.commodityName = commodityName;
        this.commodityLocation = commodityLocation;
        this.commodityPrice = commodityPrice;
        this.commodityImage = commodityImage;
        this.qtyAvail = qtyAvail;
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

    public void setQtyAvail(int qtyAvail) {
        this.qtyAvail = qtyAvail;
    }
    public int getQuantityAvailable() { return qtyAvail;  }

    public ArrayList<Commodity> getStartingInventoryArrayList() {
        startingInventoryArrayList.add(new Commodity("Mango","Opalancy",getCommodityPrice(),
                R.drawable.icons8_mango_100,getQuantityAvailable()));
        startingInventoryArrayList.add(new Commodity("Potato","Agatia",getCommodityPrice(),
                R.drawable.icons8_potato_100,getQuantityAvailable()));
        startingInventoryArrayList.add(new Commodity("Orange","Opalancy",getCommodityPrice(),
                R.drawable.icons8_orange_100,getQuantityAvailable()));
        return startingInventoryArrayList;
    }

    public ArrayList<Commodity> getOpalancyCommodityArrayList() {
        opalancyCommodityArrayList.add(new Commodity("Apples","Opalancy", getCommodityPrice(),
                R.drawable.icons8_apples_plate_100,getQuantityAvailable()));
        opalancyCommodityArrayList.add(new Commodity("Mango","Opalancy",getCommodityPrice(),
                R.drawable.icons8_mango_100,getQuantityAvailable()));
        opalancyCommodityArrayList.add(new Commodity("Dragonfruit","Opalancy",getCommodityPrice(),
                R.drawable.icons8_dragon_fruit_100,getQuantityAvailable()));
        opalancyCommodityArrayList.add(new Commodity("Orange","Opalancy",getCommodityPrice(),
                R.drawable.icons8_orange_100,getQuantityAvailable()));
        opalancyCommodityArrayList.add(new Commodity("Coconut","Opalancy",getCommodityPrice(),
                R.drawable.icons8_coconut_100,getQuantityAvailable()));
        return opalancyCommodityArrayList;
    }
    public ArrayList<Commodity> getRubyaCommodityArrayList() {
        rubyaCommodityArrayList.add(new Commodity("Blueberries","Rubya",getCommodityPrice(),
                R.drawable.icons8_blueberry_100,getQuantityAvailable()));
        rubyaCommodityArrayList.add(new Commodity("Strawberry","Rubya",getCommodityPrice(),
                R.drawable.icons8_strawberry_100,getQuantityAvailable()));
        rubyaCommodityArrayList.add(new Commodity("Cherry","Rubya",getCommodityPrice(),
                R.drawable.icons8_cherry_100,getQuantityAvailable()));
        rubyaCommodityArrayList.add(new Commodity("Raspberry","Rubya", getCommodityPrice(),
                R.drawable.icons8_raspberry_100,getQuantityAvailable()));
        rubyaCommodityArrayList.add(new Commodity("Oats","Rubya",getCommodityPrice(),
                R.drawable.icons8_rolled_oats_100,getQuantityAvailable()));
        rubyaCommodityArrayList.add(new Commodity("Asparagus","Rubya",getCommodityPrice(),
                R.drawable.icons8_asparagus_100,getQuantityAvailable()));
        return rubyaCommodityArrayList;
    }
    public ArrayList<Commodity> getAgatiaCommodityArrayList() {
        agatiaCommodityArrayList.add(new Commodity("Tomato","Agatia", getCommodityPrice(),
                R.drawable.icons8_tomato_100,getQuantityAvailable()));
        agatiaCommodityArrayList.add(new Commodity("Pumpkin","Agatia",getCommodityPrice(),
                R.drawable.icons8_pumpkin_100,getQuantityAvailable()));
        agatiaCommodityArrayList.add(new Commodity("Squash","Agatia",getCommodityPrice(),
                R.drawable.icons8_squash_100,getQuantityAvailable()));
        agatiaCommodityArrayList.add(new Commodity("White Beans","Agatia",getCommodityPrice(),
                R.drawable.icons8_white_beans_100,getQuantityAvailable()));
        agatiaCommodityArrayList.add(new Commodity("Potato","Agatia",getCommodityPrice(),
                R.drawable.icons8_potato_100,getQuantityAvailable()));
        return agatiaCommodityArrayList;
    }
    public ArrayList<Commodity> getAmethystCityCommodityArrayList() {
        amethystCityCommodityArrayList.add(new Commodity("Pomegranate","Amethyst City",
                getCommodityPrice(),
                R.drawable.icons8_pomegranate_100,getQuantityAvailable()));
        amethystCityCommodityArrayList.add(new Commodity("Plum","Amethyst City",getCommodityPrice(),
                R.drawable.icons8_plum_100,getQuantityAvailable()));
        amethystCityCommodityArrayList.add(new Commodity("Pear","Amethyst City",getCommodityPrice(),
                R.drawable.icons8_pear_100,getQuantityAvailable()));
        amethystCityCommodityArrayList.add(new Commodity("Pineapple","Amethyst City",getCommodityPrice(),
                R.drawable.icons8_pineapple_100,getQuantityAvailable()));
        amethystCityCommodityArrayList.add(new Commodity("Banana","Amethyst City",getCommodityPrice(),
                R.drawable.icons8_banana_100,getQuantityAvailable()));
        return amethystCityCommodityArrayList;
    }
    public ArrayList<Commodity> getOnyxCoastCommodityArrayList() {
        onyxCoastCommodityArrayList.add(new Commodity("Eggplant","Onyx Coast", getCommodityPrice(),
                R.drawable.icons8_eggplant_100,getQuantityAvailable()));
        onyxCoastCommodityArrayList.add(new Commodity("Cashews","Onyx Coast",getCommodityPrice(),
                R.drawable.icons8_cashew_100,getQuantityAvailable()));
        onyxCoastCommodityArrayList.add(new Commodity("Peanuts","Onyx Coast",getCommodityPrice(),
                R.drawable.icons8_peanuts_100,getQuantityAvailable()));
        onyxCoastCommodityArrayList.add(new Commodity("Hazelnut","Onyx Coast",getCommodityPrice(),
                R.drawable.icons8_hazelnut_100,getQuantityAvailable()));
        onyxCoastCommodityArrayList.add(new Commodity("Pecan","Onyx Coast",getCommodityPrice(),
                R.drawable.icons8_pecan_100,getQuantityAvailable()));
        return onyxCoastCommodityArrayList;
    }
    public ArrayList<Commodity> getJadeEmpireCommodityArrayList() {
        jadeEmpireCommodityArrayList.add(new Commodity("Corn","Jade Empire", getCommodityPrice(),
                R.drawable.icons8_corn_100,getQuantityAvailable()));
        jadeEmpireCommodityArrayList.add(new Commodity("Flax","Jade Empire",getCommodityPrice(),
                R.drawable.icons8_flax_seeds_100,getQuantityAvailable()));
        jadeEmpireCommodityArrayList.add(new Commodity("Lentils","Jade Empire",getCommodityPrice(),
                R.drawable.icons8_lentil_100,getQuantityAvailable()));
        jadeEmpireCommodityArrayList.add(new Commodity("Lettuce","Jade Empire",getCommodityPrice(),
                R.drawable.icons8_lettuce_100,getQuantityAvailable()));
        jadeEmpireCommodityArrayList.add(new Commodity("Bok Choy","Jade Empire",getCommodityPrice(),
                R.drawable.icons8_bok_choy_100,getQuantityAvailable()));
        return jadeEmpireCommodityArrayList;
    }
    public ArrayList<Commodity> getDiamondariaCommodityArrayList() {
        diamondariaCommodityArrayList.add(new Commodity("Broccoli","Diamnondaria", getCommodityPrice(),
                R.drawable.icons8_broccoli_100,getQuantityAvailable()));
        diamondariaCommodityArrayList.add(new Commodity("Cauliflower","Diamnondaria",
                getCommodityPrice(),
                R.drawable.icons8_cauliflower_100,getQuantityAvailable()));
        diamondariaCommodityArrayList.add(new Commodity("Artichoke","Diamnondaria",
                getCommodityPrice(),
                R.drawable.icons8_artichoke_100,getQuantityAvailable()));
        diamondariaCommodityArrayList.add(new Commodity("Cabbage","Diamnondaria",getCommodityPrice(),
                R.drawable.icons8_cabbage_100,getQuantityAvailable()));
        diamondariaCommodityArrayList.add(new Commodity("Purple Cabbage","Diamnondaria",
                getCommodityPrice(),
                R.drawable.icons8_purple_cabbage_96,getQuantityAvailable()));
        return diamondariaCommodityArrayList;
    }
    public ArrayList<Commodity> getEmeraldisCommodityArrayList() {
        emeraldisCommodityArrayList.add(new Commodity("Beet","Emeraldis", getCommodityPrice(),
                R.drawable.icons8_beet_100,getQuantityAvailable()));
        emeraldisCommodityArrayList.add(new Commodity("Mushroom","Emeraldis",getCommodityPrice(),
                R.drawable.icons8_mushroom_100,getQuantityAvailable()));
        emeraldisCommodityArrayList.add(new Commodity("Garlic","Emeraldis",getCommodityPrice(),
                R.drawable.icons8_garlic_100,getQuantityAvailable()));
        emeraldisCommodityArrayList.add(new Commodity("Carrots","Emeraldis",getCommodityPrice(),
                R.drawable.basket_of_carrots,getQuantityAvailable()));
        emeraldisCommodityArrayList.add(new Commodity("Radish","Emeraldis",getCommodityPrice(),
                R.drawable.icons8_radish_100,getQuantityAvailable()));
        return emeraldisCommodityArrayList;
    }
    public ArrayList<Commodity> getSapphiraCommodityArrayList() {
        sapphiraCommodityArrayList.add(new Commodity("Onion","Sapphira", getCommodityPrice(),
                R.drawable.icons8_onion_100,getQuantityAvailable()));
        sapphiraCommodityArrayList.add(new Commodity("Grapes","Sapphira",getCommodityPrice(),
                R.drawable.icons8_grapes_100,getQuantityAvailable()));
        sapphiraCommodityArrayList.add(new Commodity("Peas","Sapphira",getCommodityPrice(),
                R.drawable.icons8_peas_100,getQuantityAvailable()));
        sapphiraCommodityArrayList.add(new Commodity("Leek","Sapphira",getCommodityPrice(),
                R.drawable.icons8_leek_100,getQuantityAvailable()));
        sapphiraCommodityArrayList.add(new Commodity("Celery","Sapphira",getCommodityPrice(),
                R.drawable.icons8_celery_100,getQuantityAvailable()));
        return sapphiraCommodityArrayList;
    }
    public ArrayList<Commodity> getTourmalinaCommodityArrayList() {
        tourmalinaCommodityArrayList.add(new Commodity("Apricot","Tourmalina", getCommodityPrice(),
                R.drawable.icons8_apricot_100,getQuantityAvailable()));
        tourmalinaCommodityArrayList.add(new Commodity("Olive","Tourmalina",getCommodityPrice(),
                R.drawable.icons8_olive_100,getQuantityAvailable()));
        tourmalinaCommodityArrayList.add(new Commodity("Peach","Tourmalina",getCommodityPrice(),
                R.drawable.icons8_peach_100,getQuantityAvailable()));
        tourmalinaCommodityArrayList.add(new Commodity("Zucchini","Tourmalina",getCommodityPrice(),
                R.drawable.icons8_zucchini_100,getQuantityAvailable()));
        tourmalinaCommodityArrayList.add(new Commodity("Bell Pepper","Tourmalina",getCommodityPrice(),
                R.drawable.icons8_bell_pepper_100,getQuantityAvailable()));
        return tourmalinaCommodityArrayList;
    }

    public Map<String,String> getMapCommodityLocation(){
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
    public Map<String,Integer> getMapCommodityImages(){
        mapCommodityDrawables.put("Apples",R.drawable.icons8_apples_plate_100);
        mapCommodityDrawables.put("Mango",R.drawable.icons8_mango_100);
        mapCommodityDrawables.put("Dragonfruit",R.drawable.icons8_dragon_fruit_100);
        mapCommodityDrawables.put("Orange",R.drawable.icons8_orange_100);
        mapCommodityDrawables.put("Coconut",R.drawable.icons8_coconut_100);
        mapCommodityDrawables.put("Raspberry",R.drawable.icons8_raspberry_100);
        mapCommodityDrawables.put("Strawberry",R.drawable.icons8_strawberry_100);
        mapCommodityDrawables.put("Cherry",R.drawable.icons8_cherry_100);
        mapCommodityDrawables.put("Blueberries",R.drawable.icons8_blueberry_100);
        mapCommodityDrawables.put("Oats",R.drawable.icons8_rolled_oats_100);
        mapCommodityDrawables.put("Asparagus",R.drawable.icons8_asparagus_100);
        mapCommodityDrawables.put("Apricot",R.drawable.icons8_apricot_100);
        mapCommodityDrawables.put("Olive",R.drawable.icons8_olive_100);
        mapCommodityDrawables.put("Peach",R.drawable.icons8_peach_100);
        mapCommodityDrawables.put("Zucchini",R.drawable.icons8_zucchini_100);
        mapCommodityDrawables.put("Bell Pepper",R.drawable.icons8_bell_pepper_100);
        mapCommodityDrawables.put("Onion",R.drawable.icons8_onion_100);
        mapCommodityDrawables.put("Grapes",R.drawable.icons8_grapes_100);
        mapCommodityDrawables.put("Peas",R.drawable.icons8_peas_100);
        mapCommodityDrawables.put("Leek",R.drawable.icons8_leek_100);
        mapCommodityDrawables.put("Celery",R.drawable.icons8_celery_100);
        mapCommodityDrawables.put("Beet",R.drawable.icons8_beet_100);
        mapCommodityDrawables.put("Mushroom",R.drawable.icons8_mushroom_100);
        mapCommodityDrawables.put("Garlic",R.drawable.icons8_garlic_100);
        mapCommodityDrawables.put("Carrots",R.drawable.basket_of_carrots);
        mapCommodityDrawables.put("Radish",R.drawable.icons8_radish_100);
        mapCommodityDrawables.put("Broccoli",R.drawable.icons8_broccoli_100);
        mapCommodityDrawables.put("Cauliflower",R.drawable.icons8_cauliflower_100);
        mapCommodityDrawables.put("Artichoke",R.drawable.icons8_artichoke_100);
        mapCommodityDrawables.put("Cabbage",R.drawable.icons8_cabbage_100);
        mapCommodityDrawables.put("Purple Cabbage",R.drawable.icons8_purple_cabbage_96);
        mapCommodityDrawables.put("Corn",R.drawable.icons8_corn_100);
        mapCommodityDrawables.put("Flax",R.drawable.icons8_flax_seeds_100);
        mapCommodityDrawables.put("Lentils",R.drawable.icons8_lentil_100);
        mapCommodityDrawables.put("Lettuce",R.drawable.icons8_lettuce_100);
        mapCommodityDrawables.put("Bok Choy",R.drawable.icons8_bok_choy_100);
        mapCommodityDrawables.put("Eggplant",R.drawable.icons8_eggplant_100);
        mapCommodityDrawables.put("Cashews",R.drawable.icons8_cashew_100);
        mapCommodityDrawables.put("Peanuts",R.drawable.icons8_peanuts_100);
        mapCommodityDrawables.put("Hazelnuts",R.drawable.icons8_hazelnut_100);
        mapCommodityDrawables.put("Pecans",R.drawable.icons8_pecan_100);
        mapCommodityDrawables.put("Pomegranate",R.drawable.icons8_pomegranate_100);
        mapCommodityDrawables.put("Plum",R.drawable.icons8_plum_100);
        mapCommodityDrawables.put("Pear",R.drawable.icons8_pear_100);
        mapCommodityDrawables.put("Pineapple",R.drawable.icons8_pineapple_100);
        mapCommodityDrawables.put("Banana",R.drawable.icons8_banana_100);
        mapCommodityDrawables.put("Tomato",R.drawable.icons8_tomato_100);
        mapCommodityDrawables.put("Pumpkin",R.drawable.icons8_pumpkin_100);
        mapCommodityDrawables.put("Squash",R.drawable.icons8_squash_100);
        mapCommodityDrawables.put("White Beans",R.drawable.icons8_white_beans_100);
        mapCommodityDrawables.put("Potato",R.drawable.icons8_potato_100);
        return mapCommodityDrawables;
    }

}
