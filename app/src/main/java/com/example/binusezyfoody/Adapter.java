package com.example.binusezyfoody;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class Adapter extends RecyclerView.Adapter<myviewholder> {


   ArrayList<Model> data;
    Context context;


    public Adapter(ArrayList<Model> data, Context context){
        this.data =data;
        this.context=context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
       View view = inflater.inflate(R.layout.snackdata, parent, false);
       return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        final Model temp = data.get(position);

        holder.names.setText(data.get(position).getName());
        holder.gridImg.setImageResource(data.get(position).getImg());
        holder.prices.setText(data.get(position).getPrice());

        holder.gridImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,OrderFood.class);
                i.putExtra("img", temp.getImg());
                i.putExtra("name", temp.getName());
                i.putExtra("prices", temp.getPrice());
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });

    }


    @Override
    public int getItemCount() {
        return data.size();
    }




}
