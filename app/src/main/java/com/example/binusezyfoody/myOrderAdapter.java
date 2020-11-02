package com.example.binusezyfoody;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myOrderAdapter extends RecyclerView.Adapter<myorderviewholder> {
    ArrayList<Model> data;
    private static int TYPE_MYORDER= 1;
    private static int TYPE_FINISH= 2;
    int value;

    public myOrderAdapter(ArrayList<Model> data, int value){
        this.data =data;
        this.value=value;

    }
    @Override
    public int getItemViewType(int position) {
        if (value ==1) {
            return TYPE_MYORDER;

        } else {
            return TYPE_FINISH;
        }
    }

    @NonNull
    @Override
    public myorderviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view;
        if (viewType == TYPE_MYORDER) { // for call layout
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orderdata, parent, false);
            return new myorderviewholder(view);

        } else { // for email layout
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.finishorderdata, parent, false);
            return new myorderviewholder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull myorderviewholder holder, int position) {


        holder.names.setText(data.get(position).getName());
        holder.gridImg.setImageResource(data.get(position).getImg());
        holder.prices.setText(data.get(position).getPrice());
        holder.quantity.setText(String.valueOf(  data.get(position).getQty()));



    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
