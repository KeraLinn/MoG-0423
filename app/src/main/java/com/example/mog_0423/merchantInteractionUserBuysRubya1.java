package com.example.mog_0423;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class merchantInteractionUserBuysRubya1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView merchantAvatar;
    ImageView item1, item2, item3;
    TextView name1, name2, name3, price1, price2, price3;
    Spinner pick1, pick2, pick3;
    TextView totalToPurchase;
    TextView playerGold;
    Button doneButton;
    int totalPurchase = 0;
    int playerPurse;
    int itemPrice;
    int priceXqty1, priceXqty2, priceXqty3;
    playerClass player = new playerClass();
    Commodity commodity = new Commodity("","",0,0,0);
    ArrayList<Commodity> cityStockArrayList = commodity.getRubyaCommodityArrayList();
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_trading);
        adapter = ArrayAdapter.createFromResource(this,R.array.numberqty,
                android.R.layout.simple_spinner_item);

        setUpScreenAttachments();
        doneButton.setOnClickListener(v -> {
            completeBuy();
        });
    }

    private void setUpScreenAttachments() {
        //TODO: optimize
        merchantAvatar = findViewById(R.id.merchantAvatar);
        merchantAvatar.setImageResource(R.drawable.icons8_merchant_f);
        totalToPurchase = findViewById(R.id.textviewTotal);
        totalToPurchase.setText(String.valueOf(totalPurchase));
        playerPurse = player.getPlayerPurse();
        playerGold = findViewById(R.id.textviewTotalYourGold);
        playerGold.setText(String.valueOf(playerPurse));
        doneButton = findViewById(R.id.completeTrade);

        item1 = findViewById(R.id.commodity_image5);
        item1.setImageResource(cityStockArrayList.get(0).getCommodityImage());
        item2 = findViewById(R.id.commodity_image6);
        item2.setImageResource(cityStockArrayList.get(1).getCommodityImage());
        item3 = findViewById(R.id.commodity_image7);
        item3.setImageResource(cityStockArrayList.get(2).getCommodityImage());
        name1 = findViewById(R.id.commodityName5);
        name1.setText(cityStockArrayList.get(0).getCommodityName());
        name2 = findViewById(R.id.commodityName6);
        name2.setText(cityStockArrayList.get(1).getCommodityName());
        name3 = findViewById(R.id.commodityName7);
        name3.setText(cityStockArrayList.get(2).getCommodityName());

        price1 = findViewById(R.id.commodityPrice5);
        price1.setText(String.valueOf(cityStockArrayList.get(0).getCommodityPrice()));
        price2 = findViewById(R.id.commodityPrice6);
        price2.setText(String.valueOf(cityStockArrayList.get(1).getCommodityPrice()));
        price3 = findViewById(R.id.commodityPrice7);
        price3.setText(String.valueOf(cityStockArrayList.get(2).getCommodityPrice()));

        pick1 = findViewById(R.id.spinner);
        pick1.setAdapter(adapter);
        pick1.setOnItemSelectedListener(this);
        pick2 = findViewById(R.id.spinner3);
        pick2.setAdapter(adapter);
        pick2.setOnItemSelectedListener(this);
        pick3 = findViewById(R.id.spinner2);
        pick3.setAdapter(adapter);
        pick3.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int qty = (int) Integer.parseInt((String) parent.getItemAtPosition(position));
        if (pick1.equals(parent)) {
            itemPrice = cityStockArrayList.get(0).commodityPrice;
            priceXqty1 = qty * itemPrice;
        } else if (pick2.equals(parent)) {
            itemPrice = cityStockArrayList.get(1).commodityPrice;
            priceXqty2 = qty * itemPrice;
        } else if (pick3.equals(parent)) {
            itemPrice = cityStockArrayList.get(2).commodityPrice;
            priceXqty3 = qty * itemPrice;
        }
            totalPurchase = priceXqty1 + priceXqty2 + priceXqty3;
            totalToPurchase.setText(String.valueOf(totalPurchase));
    }

    private void completeBuy() {
        playerPurse -= totalPurchase;
        player.setPlayerPurse(playerPurse);
        if (playerPurse <= 0){
            startActivity(new Intent(merchantInteractionUserBuysRubya1.this, gameOver.class));
        }
        playerGold.setText(String.valueOf(playerPurse));

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Let's make a deal!")
                .setMessage("Here's your total: " + playerPurse + "\n\nWould you like to sell me " +
                        "something?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(merchantInteractionUserBuysRubya1.this,
                        merchantInteractionUserSellsRubya1.class));
            }
        });
        builder.setNegativeButton("No thanks", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                builder.setMessage("Thanks for trading! Come again soon!");
                startActivity(new Intent(merchantInteractionUserBuysRubya1.this,
                        merchantInteractionUserBuysRubya2.class));
            }
        });
        builder.show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        parent.getItemIdAtPosition(0);
    }



}
