package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import java.util.ArrayList;

public class PayOrder extends AppCompatActivity {
    private Button backtomain;
    RecyclerView recyclerView;
    myOrderAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_order);

        backtomain=(Button)findViewById(R.id.doneorder);
        backtomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotomain();
            }
        });


        recyclerView= (RecyclerView)findViewById(R.id.recyclervieowrder);
        adapter = new myOrderAdapter(orderdatalist(),2);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(adapter);
    }


    public void gotomain(){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }


    public ArrayList<Model> orderdatalist(){
        ArrayList<Model> holder = new ArrayList<>();

        Model obj1 = new Model();
        obj1.setName("Grilled Salmon Salad");
        obj1.setImg(R.drawable.salmonsalad);
        obj1.setPrice("Rp.95.000");
        obj1.setQty(1);
        holder.add(obj1);

        Model obj2 = new Model();
        obj2.setName("Pink Lemonade");
        obj2.setImg(R.drawable.pinklemonade);
        obj2.setPrice("Rp.20.000");
        obj2.setQty(3);
        holder.add(obj2);

        return holder;

    }
}