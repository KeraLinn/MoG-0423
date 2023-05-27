package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class startingInventory extends AppCompatActivity {
    ImageView item1, item2, item3;
    TextView name1, name2, name3;
    TextView qty1, qty2, qty3;
    TextView price1, price2, price3;
    Button letsGoButton;
    Intent intent;
    Random rand = new Random();
    int randomNum, max = 10, min = 1;
    Commodity commodity = new Commodity("","",0,0);
    ArrayList<Commodity> starterInventory = commodity.getStartingInventoryArrayList();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventory_dialog);

        item1 = findViewById(R.id.commodity_image);
        item1.setImageResource(starterInventory.get(0).getCommodityImage());
        name1 = findViewById(R.id.commodityName);
        name1.setText(starterInventory.get(0).getCommodityName());
        qty1 = findViewById(R.id.commodityQty);
        qty1.setText("10");
        price1 = findViewById(R.id.commodityPrice);
        price1.setText(String.valueOf(starterInventory.get(0).getCommodityPrice()));

        item2 = findViewById(R.id.commodity_image1);
        item2.setImageResource(starterInventory.get(1).getCommodityImage());
        name2 = findViewById(R.id.commodityName1);
        name2.setText(starterInventory.get(1).getCommodityName());
        qty2 = findViewById(R.id.commodityQty1);
        qty2.setText("10");
        price2 = findViewById(R.id.commodityPrice1);
        price2.setText(String.valueOf(starterInventory.get(1).getCommodityPrice()));

        item3 = findViewById(R.id.commodity_image2);
        item3.setImageResource(starterInventory.get(2).getCommodityImage());
        name3 = findViewById(R.id.commodityName2);
        name3.setText(starterInventory.get(2).getCommodityName());
        qty3 = findViewById(R.id.commodityQty2);
        qty3.setText("10");
        price3 = findViewById(R.id.commodityPrice2);
        price3.setText(String.valueOf(starterInventory.get(2).getCommodityPrice()));

        getFirstCity();
        letsGoButton = findViewById(R.id.letsgoButton);
        letsGoButton.setOnClickListener((View v) -> startActivity(intent));
    }
    private void getFirstCity() {
        intent = new Intent();
        randomNum = rand.nextInt(max - min + 1) + min;
        switch (randomNum) {
            case 1:
                intent.setClass(startingInventory.this, cityArrival2MerchantsRubya.class);
                break;
            case 2:
                intent.setClass(startingInventory.this, cityArrival1MerchantTourmalina.class);
                break;
            case 3:
                intent.setClass(startingInventory.this, cityArrival1MerchantSapphira.class);
                break;
            case 4:
                intent.setClass(startingInventory.this, cityArrival2MerchantsEmeraldis.class);
                break;
            case 5:
                intent.setClass(startingInventory.this, cityArrival1MerchantDiamondaria.class);
                break;
            case 6:
                intent.setClass(startingInventory.this, cityArrival2MerchantsJadeEmpire.class);
                break;
            case 7:
                intent.setClass(startingInventory.this, cityArrival2MerchantsOnyxCoast.class);
                break;
            case 8:
                intent.setClass(startingInventory.this, cityArrival2MerchantsOpalancy.class);
                break;
            case 9:
                intent.setClass(startingInventory.this, cityArrival1MerchantAmethystCity.class);
                break;
            case 10:
                intent.setClass(startingInventory.this, cityArrival1MerchantAgatia.class);
                break;
        }
    }
}
