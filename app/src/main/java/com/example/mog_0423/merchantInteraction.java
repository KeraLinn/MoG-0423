package com.example.mog_0423;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.chip.Chip;

import java.util.ArrayList;

public class merchantInteraction extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //MerchantInteractionBinding merchantInteractionBinding;
   // ViewDataBinding viewDataBinding = new Activity
        ViewDataBinding binding;

    //TODO: need to implement this class for a selling activity as well

    Commodity commodity = new Commodity("","",0,0);
    ArrayList<Commodity> commodityArrayList = new ArrayList<>();
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

    private void setUpScreenAttachments() {
        //TODO: finish setting up method after connecting RecyclerView portion to the screen_trading
        //getMerchantStock();



        for (int i = 0; i < 5; i++){
            Chip chippy = new Chip(this);
            chippy.setChipIconResource(cityStockArrayList.get(i).commodityImage);
            commodityArrayList.add(i,cityStockArrayList.get(i));
        }

    }

    private void completeTransaction() {
        /*playerBuying =
                merchantPickerItem1.getValue() + merchantPickerItem2.getValue() + merchantPickerItem3.getValue();
        playerSelling =
                playerPickerItem1.getValue() + playerPickerItem2.getValue() + playerPickerItem3.getValue();*/

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        parent.getItemAtPosition(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        parent.getItemIdAtPosition(0);
    }

}
