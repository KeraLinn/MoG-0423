package com.example.mog_0423;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CommodityRecyclerViewAdapter  extends RecyclerView.Adapter<CommodityRecyclerViewAdapter.MyViewHolder> {
    Context context;
    ArrayList<Commodity> commodityArrayList;

    public CommodityRecyclerViewAdapter(Context context, ArrayList<Commodity> commodityArrayList) {
        this.context = context;
        this.commodityArrayList = commodityArrayList;
    }

    @NonNull
    @Override
    public CommodityRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.commodity_recyclerview, parent, false);
        return new CommodityRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(commodityArrayList.get(position).getCommodityName());
        holder.location.setText(commodityArrayList.get(position).getCommodityLocation());
        holder.price.setText(commodityArrayList.get(position).getCommodityPrice());
        holder.imageView.setImageResource(commodityArrayList.get(position).getCommodityImage());
    }

    @Override
    public int getItemCount() {
        return commodityArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        TextView location;
        TextView price;
        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.commodity_image);
            name = itemView.findViewById(R.id.commodityName);
            location = itemView.findViewById(R.id.commodityLocation);
            price = itemView.findViewById(R.id.commodityPrice);
        }
    }
}
