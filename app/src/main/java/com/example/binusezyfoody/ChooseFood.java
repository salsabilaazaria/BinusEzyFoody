package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;
import android.widget.Button;

public class ChooseFood extends AppCompatActivity {

    Adapter adapter;
    private ImageButton myorder;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_food);

        recyclerView= (RecyclerView)findViewById(R.id.recyclerviewmenu);

//        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
////        recyclerView.setLayoutManager(layoutManager);

        myorder= (ImageButton)findViewById(R.id.historybutton);
        myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotomyorder();
            }
        });

        int value = (int) getIntent().getExtras().get("key");

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

        if(value == 1) {
            adapter = new Adapter(fooddatalist(), getApplicationContext());
        }
        if(value == 2) {
            adapter = new Adapter(drinkdatalist(), getApplicationContext());
        }
        if(value == 3) {
            adapter = new Adapter(snackdatalist(), getApplicationContext());
        }
        recyclerView.setAdapter(adapter);


    }

    public void gotomyorder(){
        Intent i = new Intent(this,MyOrderActivity.class);
        startActivity(i);
    }

    public ArrayList<Model> fooddatalist(){
        ArrayList<Model> holder = new ArrayList<>();

        Model obj1 = new Model();
        obj1.setName("Grilled Salmon Salad");
        obj1.setImg(R.drawable.salmonsalad);
        obj1.setPrice("Rp.95.000");
        holder.add(obj1);

        Model obj2 = new Model();
        obj2.setName("Chicken Sandwhich");
        obj2.setImg(R.drawable.sandwich);
        obj2.setPrice("Rp.45.000");
        holder.add(obj2);

        return holder;

    }


    public ArrayList<Model> drinkdatalist(){
        ArrayList<Model> holder = new ArrayList<>();

        Model obj1 = new Model();
        obj1.setName("Avocado Juice");
        obj1.setImg(R.drawable.avocado);
        obj1.setPrice("30.000");
        holder.add(obj1);


        Model obj2 = new Model();
        obj2.setName("Tropical Juice");
        obj2.setImg(R.drawable.mixblend);
        obj2.setPrice("30.000");
        holder.add(obj2);


        Model obj3 = new Model();
        obj3.setName("PowerBooster Smoothies");
        obj3.setImg(R.drawable.peanutbutter);
        obj3.setPrice("45.000");
        holder.add(obj3);


        Model obj4 = new Model();
        obj4.setName("Pink Lemonade");
        obj4.setImg(R.drawable.pinklemonade);
        obj4.setPrice("30.000");

        holder.add(obj4);

        Model obj5 = new Model();
        obj5.setName("Orange Juice");
        obj5.setImg(R.drawable.orange);
        obj5.setPrice("30.000");
        holder.add(obj5);


        return holder;

    }

    public ArrayList<Model> snackdatalist(){
        ArrayList<Model> holder = new ArrayList<>();

        Model obj1 = new Model();
        obj1.setName("Granola");
        obj1.setImg(R.drawable.granola);
        obj1.setPrice("Rp.35.000");
        holder.add(obj1);


        Model obj2 = new Model();
        obj2.setName("Chips");
        obj2.setImg(R.drawable.chips);
        obj2.setPrice("Rp.20.000");
        holder.add(obj2);

        return holder;

    }




}