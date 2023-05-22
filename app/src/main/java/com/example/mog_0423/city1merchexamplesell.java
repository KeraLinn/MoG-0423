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

public class city1merchexamplesell extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //TODO: need to implement this class for a selling activity as well
    ImageView merchantAvatar;
    ImageView item1, item2, item3;
    TextView name1, name2, name3, price1, price2, price3;
    Spinner pick1, pick2, pick3;
    TextView totalToPurchase;
    TextView playerGold;
    Button doneButton;
    int totalPurchase = 0;
    playerClass player = new playerClass();
    int playerPurse = player.getPlayerPurse();
    int itemPrice;
    int priceXqty = 0;
    Commodity commodity = new Commodity("", "", 0, 0);
    ArrayList<Commodity> userStockArrayList = commodity.getRubyaCommodityArrayList();


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
        //TODO: possibly optimize this by putting all the ImageViews and then TextViews into
        // arrays? then use for loop to cycle through the stockList?
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numberqty,
                android.R.layout.simple_spinner_item);
        TextView text = findViewById(R.id.textView9);
        text.setText("What would you like to sell?");
        merchantAvatar = findViewById(R.id.merchantAvatar);
        merchantAvatar.setImageResource(R.drawable.icons8_merchant_m);
        totalToPurchase = findViewById(R.id.textviewTotal);
        totalToPurchase.setText(String.valueOf(totalPurchase));
        totalToPurchase.setText(String.valueOf(0));
        playerGold = findViewById(R.id.textviewTotalYourGold);
        playerGold.setText(String.valueOf(playerPurse));
        playerGold.setVisibility(View.INVISIBLE);
        TextView goldLabel = findViewById(R.id.yourGoldLabel);
        goldLabel.setVisibility(View.INVISIBLE);

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

    private void completeTransaction() {
        playerPurse += totalPurchase;

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Deal!")
                .setMessage("Here's your current gold: " + playerPurse + "\n\nThanks for trading!" +
                        " Come again soon!");
        builder.setPositiveButton("Bye!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                    startActivity(new Intent(city1merchexamplesell.this,
                            gameWon.class));
            }
        });
        builder.show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int qty;
        if (pick1.equals(parent)) {
            qty = (int) Integer.parseInt((String) parent.getItemAtPosition(position));
            itemPrice = userStockArrayList.get(0).commodityPrice;
            priceXqty = qty * itemPrice;
        } else if (pick2.equals(parent)) {
            qty = Integer.parseInt((String) parent.getItemAtPosition(position));
            itemPrice = userStockArrayList.get(1).commodityPrice;
            priceXqty = qty * itemPrice;
        } else if (pick3.equals(parent)) {
            qty = Integer.parseInt((String) parent.getItemAtPosition(position));
            itemPrice = userStockArrayList.get(2).commodityPrice;
            priceXqty = qty * itemPrice;
        }
        totalPurchase += priceXqty;
        totalToPurchase.setText(String.valueOf(totalPurchase));
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        parent.getItemIdAtPosition(0);
    }
}
