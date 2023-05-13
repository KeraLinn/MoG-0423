package com.example.mog_0423;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class merchantStockRecyclerViewAdapter extends RecyclerView.Adapter<merchantStockRecyclerViewAdapter.MyViewHolder> {
    Context context;
    ArrayList<Commodity> merchantStockArrayList;

    SpinnerAdapter spinnerAdapter;

    public merchantStockRecyclerViewAdapter(Context context,
                                            ArrayList<Commodity> merchantStockArrayList,
                                            SpinnerAdapter spinnerAdapter){
        this.context = context;
        this.merchantStockArrayList = merchantStockArrayList;
        this.spinnerAdapter = spinnerAdapter;
    }
    
    @NonNull
    @Override
    public merchantStockRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.trade_inventory_row,parent,false);
        spinnerAdapter.getView(Adapter.IGNORE_ITEM_VIEW_TYPE,view,parent);
        return new merchantStockRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull merchantStockRecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(merchantStockArrayList.get(position).getCommodityImage());
        holder.name.setText(merchantStockArrayList.get(position).getCommodityName());
        holder.qtyAvailable.setText(merchantStockArrayList.get(position).getQuantityAvailable());
        holder.price.setText(String.valueOf(merchantStockArrayList.get(position).getCommodityPrice()));
        holder.selectionSpinner.setAdapter((SpinnerAdapter) spinnerAdapter.getItem(position));
    }

    @Override
    public int getItemCount() {
        return merchantStockArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        TextView qtyAvailable;
        TextView price;
        Spinner selectionSpinner;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.commodity_image);
            name = itemView.findViewById(R.id.commodityName);
            qtyAvailable = itemView.findViewById(R.id.qtyNumber);
            price = itemView.findViewById(R.id.commodityPrice);
            selectionSpinner = itemView.findViewById(R.id.qtySpinner);
        }
    }
}
