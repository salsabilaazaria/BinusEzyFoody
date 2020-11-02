package com.example.binusezyfoody;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myorderviewholder extends RecyclerView.ViewHolder {
    TextView names;
    ImageView gridImg;
    TextView prices;
    TextView quantity;



    public myorderviewholder(@NonNull View itemView) {
        super(itemView);
        names= (TextView)itemView.findViewById(R.id.ordername);
        gridImg = (ImageView)itemView.findViewById(R.id.orderimage);
        prices =(TextView) itemView.findViewById(R.id.orderprice);
        quantity =(TextView) itemView.findViewById(R.id.orderqty);
    }
}


