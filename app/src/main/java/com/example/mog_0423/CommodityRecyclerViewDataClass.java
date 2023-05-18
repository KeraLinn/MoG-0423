package com.example.mog_0423;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Map;

public class CommodityRecyclerViewDataClass extends AppCompatActivity {

    Commodity commodity = new Commodity("","",0,0);

    ArrayList<Commodity> commodityList = new ArrayList<>();
    int[] commodityImages = {R.drawable.icons8_apples_plate_100,R.drawable.icons8_apricot_100,
            R.drawable.icons8_artichoke_100,R.drawable.icons8_asparagus_100,
            R.drawable.icons8_banana_100,R.drawable.icons8_beet_100,
            R.drawable.icons8_bell_pepper_100,
            R.drawable.icons8_blueberry_100, R.drawable.icons8_bok_choy_100,
            R.drawable.icons8_broccoli_100,R.drawable.icons8_cabbage_100,
            R.drawable.basket_of_carrots,R.drawable.icons8_cashew_100,
            R.drawable.icons8_cauliflower_100,R.drawable.icons8_celery_100,
            R.drawable.icons8_cherry_100,R.drawable.icons8_coconut_100,R.drawable.icons8_corn_100
            ,R.drawable.icons8_dragon_fruit_100,R.drawable.icons8_eggplant_100,
            R.drawable.icons8_flax_seeds_100,R.drawable.icons8_garlic_100,
            R.drawable.icons8_grapes_100,R.drawable.icons8_hazelnut_100,
            R.drawable.icons8_leek_100,R.drawable.icons8_lentil_100,R.drawable.icons8_lettuce_100
            ,R.drawable.icons8_mango_100,R.drawable.icons8_mushroom_100,
            R.drawable.icons8_rolled_oats_100,
            R.drawable.icons8_olive_100,R.drawable.icons8_onion_100,R.drawable.icons8_orange_100
        , R.drawable.icons8_peach_100,R.drawable.icons8_peanuts_100,R.drawable.icons8_pear_100,
                R.drawable.icons8_peas_100,R.drawable.icons8_pecan_100,
                R.drawable.icons8_pineapple_100,R.drawable.icons8_plum_100,
            R.drawable.icons8_pomegranate_100,
                R.drawable.icons8_potato_100,R.drawable.icons8_pumpkin_100,
            R.drawable.icons8_purple_cabbage_96,
                R.drawable.icons8_radish_100,R.drawable.icons8_raspberry_100,
                R.drawable.icons8_squash_100,R.drawable.icons8_strawberry_100,
                R.drawable.icons8_tomato_100,R.drawable.icons8_white_beans_100,
            R.drawable.icons8_zucchini_100};

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commodity_recyclerview);

        RecyclerView recyclerView = findViewById(R.id.commodityRecyclerView);

        setUpCommodityList();

        CommodityRecyclerViewAdapter adapter = new CommodityRecyclerViewAdapter(this,
                commodityList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void setUpCommodityList() {
        String[] commodityListNames =
                getResources().getStringArray(R.array.commodity_names_list);
        Map<String,String> myMap = commodity.getMapCommodityLocation();
        int[] priceArray = {25, 12, 17, 27, 29, 8, 16, 13, 27, 21, 15, 26, 15, 9, 10, 27, 18,
            19, 15, 28, 11, 29, 10, 12, 21, 29, 30, 29, 14, 27, 8, 11, 29, 10, 12, 21, 29, 30, 29
                , 14, 19, 15, 28, 11, 29, 10, 12, 21, 29, 30, 16};
        for (int i = 0; i < commodityListNames.length; i++){
            commodityList.add(new Commodity(commodityListNames[i],
                    myMap.get(commodityListNames[i]),
                    priceArray[i],commodityImages[i]));
        }
        /*for(int i = 0; i < 5; i++){
            commodity = commodity.agatiaCommodityVector.get(i);
            commodityList.add(i,commodity.agatiaCommodityVector.get(i));
        }*/
        //TODO: RecyclerView needs some aesthetic work - add space between the rows, adjust the
        // font. If decided to keep location on recyclerview row, may need to adjust the font size.
        //TODO: attach the price and coin to the right side of the row so that they line up nicely.

    }

}
