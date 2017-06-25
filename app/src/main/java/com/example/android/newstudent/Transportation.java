package com.example.android.newstudent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Transportation extends AppCompatActivity {
    boolean backbuttonclicked=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation);}
//        Button Back = (Button) findViewById(R.id.button);
//        assert Back != null;
//        Back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent I = new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(I);
//            }
//        });
         public void Buses(View v){
        Uri webpage = Uri.parse("http://www.smtd.org");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void RentalCars(View v){
        Uri webpage = Uri.parse("https://www.hertz.com/rentacar/reservation/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void Cycle(View v){
        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:39.7493353,-89.6847465"));
        startActivity(intent);
    }
    }





