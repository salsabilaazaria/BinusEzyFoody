package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button snackbutton;
    private Button drinkbutton;
    private Button foodbutton;
    private ImageButton myorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodbutton = (Button) findViewById(R.id.foodbutton);
        snackbutton = (Button) findViewById(R.id.snackbutton);
        drinkbutton = (Button) findViewById(R.id.drinkbutton);
        myorder= (ImageButton)findViewById(R.id.historybutton);
        myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotomyorder();
            }
        });
        foodbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2(1);
            }
        });
        drinkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2(2);
            }
        });
        snackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2(3);
            }
        });



    }
    public void openActivity2(int value) {
        Intent intent = new Intent(this, ChooseFood.class);
        intent.putExtra("key", value );
        startActivity(intent);
    }

    public void gotomyorder(){
        Intent i = new Intent(this,MyOrderActivity.class);
        startActivity(i);
    }
}