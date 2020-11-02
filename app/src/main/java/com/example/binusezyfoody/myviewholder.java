package com.example.binusezyfoody;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder {
    TextView names;
    ImageView gridImg;
    TextView prices;


    public myviewholder(@NonNull View itemView) {
        super(itemView);
        names= itemView.findViewById(R.id.nametextview);
        gridImg = itemView.findViewById(R.id.productimgview);
        prices = itemView.findViewById(R.id.pricetextview);

    }
}


