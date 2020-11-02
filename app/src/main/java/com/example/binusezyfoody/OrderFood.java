package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class OrderFood extends AppCompatActivity {

    ImageView image;
    TextView name;
    TextView qty;
    private Button tambah;
    private Button kurang;
    private ImageButton myorder;
    private Button ordermore;
    int jumlah=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_food);

        image=(ImageView)findViewById(R.id.photoproduct);
        name=(TextView)findViewById(R.id.productname);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        ordermore = (Button)findViewById(R.id.ordermore);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increment();
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrement();
            }
        });
        ordermore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        image.setImageResource(getIntent().getIntExtra("img",0));
        name.setText(getIntent().getStringExtra("name"));

        myorder= (ImageButton)findViewById(R.id.historybutton);
        myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotomyorder();
            }
        });

        qty = (TextView)findViewById(R.id.quantity);
        qty.setText(String.valueOf(jumlah));
    }

    public void gotomyorder(){
        Intent i = new Intent(this,MyOrderActivity.class);
        startActivity(i);
    }



    public void increment(){

        qty = (TextView)findViewById(R.id.quantity);
        jumlah+=1;
        qty.setText(String.valueOf(jumlah));

    }

    public void decrement(){

        qty = (TextView)findViewById(R.id.quantity);
        if(jumlah!=0){
            jumlah -= 1;

        }
        qty.setText(String.valueOf(jumlah));



    }
}