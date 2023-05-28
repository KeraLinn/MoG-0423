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

public class merchantInteractionUserSellsRubya2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView merchantAvatar;
    ImageView item1, item2, item3;
    TextView name1, name2, name3, price1, price2, price3;
    Spinner pick1, pick2, pick3;
    TextView totalToPurchase;
    TextView playerGold;
    Button doneButton;
    int totalPurchase = 0;
    playerClass player = new playerClass();
    int playerPurse;
    int itemPrice;
    int priceXqty1, priceXqty2, priceXqty3;
    Commodity commodity = new Commodity("", "", 0, 0,0);
    ArrayList<Commodity> userStockArrayList = commodity.getStartingInventoryArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_trading);

        setUpScreenAttachments();

        doneButton.setOnClickListener(v -> {
            completeTransaction();

        });
    }

    private void setUpScreenAttachments() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numberqty,
                android.R.layout.simple_spinner_item);
        TextView text = findViewById(R.id.textView9);
        text.setText("What would you like to sell?");
        merchantAvatar = findViewById(R.id.merchantAvatar);
        merchantAvatar.setImageResource(R.drawable.icons8_avatar_64_m_blackhat);
        totalToPurchase = findViewById(R.id.textviewTotal);
        totalToPurchase.setText(String.valueOf(totalPurchase));
        totalToPurchase.setText(String.valueOf(0));
        playerPurse = player.getPlayerPurse();
        playerGold = findViewById(R.id.textviewTotalYourGold);
        playerGold.setText(String.valueOf(playerPurse));

        doneButton = findViewById(R.id.completeTrade);

        item1 = findViewById(R.id.commodity_image5);
        item1.setImageResource(userStockArrayList.get(0).getCommodityImage());
        item2 = findViewById(R.id.commodity_image6);
        item2.setImageResource(userStockArrayList.get(1).getCommodityImage());
        item3 = findViewById(R.id.commodity_image7);
        item3.setImageResource(userStockArrayList.get(2).getCommodityImage());
        name1 = findViewById(R.id.commodityName5);
        name1.setText(userStockArrayList.get(0).getCommodityName());
        name2 = findViewById(R.id.commodityName6);
        name2.setText(userStockArrayList.get(1).getCommodityName());
        name3 = findViewById(R.id.commodityName7);
        name3.setText(userStockArrayList.get(2).getCommodityName());

        price1 = findViewById(R.id.commodityPrice5);
        price1.setText(String.valueOf(userStockArrayList.get(0).getCommodityPrice()));
        price2 = findViewById(R.id.commodityPrice6);
        price2.setText(String.valueOf(userStockArrayList.get(1).getCommodityPrice()));
        price3 = findViewById(R.id.commodityPrice7);
        price3.setText(String.valueOf(userStockArrayList.get(2).getCommodityPrice()));

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
            itemPrice = userStockArrayList.get(0).commodityPrice;
            priceXqty1 = qty * itemPrice;
        } else if (pick2.equals(parent)) {
            qty = Integer.parseInt((String) parent.getItemAtPosition(position));
            itemPrice = userStockArrayList.get(1).commodityPrice;
            priceXqty2 = qty * itemPrice;
        } else if (pick3.equals(parent)) {
            qty = Integer.parseInt((String) parent.getItemAtPosition(position));
            itemPrice = userStockArrayList.get(2).commodityPrice;
            priceXqty3 = qty * itemPrice;
        }
        totalPurchase = priceXqty1 + priceXqty2 + priceXqty3;
        totalToPurchase.setText(String.valueOf(totalPurchase));
    }

    private void completeTransaction() {
        playerPurse += totalPurchase;
        player.setPlayerPurse(playerPurse);
        if (playerPurse >= 1000){
            startActivity(new Intent(merchantInteractionUserSellsRubya2.this, gameOver.class));
        }
        playerGold.setText(String.valueOf(playerPurse));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Deal!")
                .setMessage("You're selling: " + totalPurchase + "\nWhich " +
                        "brings your total Gold to: " + playerPurse + "\n\nThanks for trading!" +
                        " Come again soon!");
        builder.setPositiveButton("Bye!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(merchantInteractionUserSellsRubya2.this, cityTravel.class));
            }
        });
        builder.show();
    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        parent.getItemIdAtPosition(0);
    }
}
