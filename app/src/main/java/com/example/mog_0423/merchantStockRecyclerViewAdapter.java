package com.example.mog_0423;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class merchantStockRecyclerViewAdapter extends RecyclerView.Adapter<merchantStockRecyclerViewAdapter.MyViewHolder> {
    Context context;
    ArrayList<Commodity> merchantStockArrayList;

    public merchantStockRecyclerViewAdapter(Context context,ArrayList<Commodity> merchantStockArrayList){
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
            //selectionSpinner = itemView.findViewById()
        }
    }
}
