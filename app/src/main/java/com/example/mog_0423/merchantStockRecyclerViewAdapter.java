package com.example.mog_0423;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class merchantStockRecyclerViewAdapter extends RecyclerView.Adapter<merchantStockRecyclerViewAdapter.MyViewHolder> {
    Context context;
    ArrayList<Commodity> merchantStockArrayList;

    public merchantStockRecyclerViewAdapter(Context context,
                                            ArrayList<Commodity> merchantStockArrayList){
        this.context = context;
        this.merchantStockArrayList = merchantStockArrayList;
    }

    @NonNull
    @Override
    public merchantStockRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.trade_inventory_row,parent,false);
        return new merchantStockRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull merchantStockRecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(merchantStockArrayList.get(position).getCommodityImage());
        holder.name.setText(merchantStockArrayList.get(position).getCommodityName());
        holder.qtyAvailable.setText("10");
        holder.price.setText(String.valueOf(merchantStockArrayList.get(position).getCommodityPrice()));
        holder.selectionSpinner.setAdapter(new ArrayAdapter<>(context,
                android.R.layout.simple_spinner_dropdown_item));
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
        public Spinner selectionSpinner;
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
