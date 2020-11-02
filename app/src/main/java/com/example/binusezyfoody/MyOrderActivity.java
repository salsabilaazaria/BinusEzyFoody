package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import java.util.ArrayList;

public class MyOrderActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    myOrderAdapter adapter;
    private Button paynow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        recyclerView= (RecyclerView)findViewById(R.id.recyclervieowrder);
        adapter = new myOrderAdapter(orderdatalist(),1);

        paynow = (Button)findViewById(R.id.paynow);
        paynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishorder(1);
            }
        });


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(adapter);
    }

    public void finishorder(int value){
        Intent i = new Intent(this,PayOrder.class);
        i.putExtra("key", value);
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