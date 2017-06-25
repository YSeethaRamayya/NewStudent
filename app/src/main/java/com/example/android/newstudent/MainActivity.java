package com.example.android.newstudent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    boolean Transportbuttonisclicked=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Transport = (Button)findViewById(R.id.transport);
        Button Acad = (Button) findViewById(R.id.Academics);
        Button Insurance = (Button)findViewById(R.id.Insurance);
        Button Travel = (Button)findViewById(R.id.Travelling);
        final Button CostofLiving = (Button)findViewById(R.id.COL);
        Transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(getApplicationContext(), Transportation.class);
                startActivity(I);

            }
        });
        Acad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B = new Intent(getApplicationContext(),Academics.class);
                startActivity(B);
            }
        });
        Insurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent K = new Intent(getApplicationContext(),Insurance.class);
                startActivity(K);
            }
        });
        Travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T = new Intent(getApplicationContext(),Travelling.class);
                startActivity(T);
            }
        });
        CostofLiving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent C= new Intent(getApplicationContext(),CostofLiving.class);
                startActivity(C);
            }
        });

            }

    }
//
//    public void Transport(View v){
//        if(Transportbuttonisclicked){
//        setContentView(R.layout.activity_transportation);
//        }
//    }

