package com.example.mog_0423;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class merchantInteraction extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //TODO: need to implement this class for a selling activity as well
    ImageView merchantAvatar;
    TextView totalToPurchase;
    TextView playerGold;
    int totalPurchase;
    int priceXqty;
    Commodity commodity = new Commodity("","",0,0);
    ArrayList<Commodity> cityStockArrayList = commodity.getAmethystCityCommodityArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_trading);




        /*merchantInteractionBinding = androidx.databinding.DataBinderMapperImpl.inflate(getLayoutInflater());
        setContentView(merchantInteractionBinding.getRoot());*/
        /*activityMerchantInteractionBinding =
                activityMerchantInteractionBinding.inflate(getLayoutInflater());
        setContentView(activityMerchantInteractionBinding.getRoot());
        allocateActivityTitle("Trade Time!");*/
        /*activityBinding = DataBindingUtil.inflate(getLayoutInflater());
        setContentView(activityBinding.getRoot());
        allocateActivityTitle("Trade Time!");*/





        RecyclerView recyclerView = findViewById(R.id.tradingRecyclerView);

        setUpScreenAttachments();

        merchantStockRecyclerViewAdapter stockAdapter = new merchantStockRecyclerViewAdapter(this,
                cityStockArrayList);
        recyclerView.setAdapter(stockAdapter);;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void PurchasingAdd() {

    }

    private void setUpScreenAttachments() {
        //TODO: finish setting up method after connecting RecyclerView portion to the screen_trading
        //getMerchantStock();
        merchantAvatar = findViewById(R.id.merchantAvatar);
        merchantAvatar.setImageResource(R.drawable.icons8_merchant_f);
        totalToPurchase = findViewById(R.id.textviewTotal);
        playerGold = findViewById(R.id.textviewTotalYourGold);

    }

    private void completeTransaction() {
        /*playerBuying =
                merchantPickerItem1.getValue() + merchantPickerItem2.getValue() + merchantPickerItem3.getValue();
        playerSelling =
                playerPickerItem1.getValue() + playerPickerItem2.getValue() + playerPickerItem3.getValue();*/

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int qty = (int) parent.getSelectedItem();

        /*priceXqty = selectedItem.commodityPrice * qty;
        totalPurchase += priceXqty;*/
        totalToPurchase.setText(totalPurchase);
        totalToPurchase.refreshDrawableState();
        //parent.getItemAtPosition(position);
    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        parent.getItemIdAtPosition(0);
    }

}
