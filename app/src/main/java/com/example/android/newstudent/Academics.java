package com.example.android.newstudent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Academics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);

    }

    public void CS(View v) {
        Uri webpage = Uri.parse("http://csc.uis.edu/#Home");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void MIS(View v){
        Uri webpaage = Uri.parse("http://mis.uis.edu/");
        Intent intent=new Intent(Intent.ACTION_VIEW,webpaage);
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }
    public void Udacity(View v){
        Uri webpaage = Uri.parse("https://www.udacity.com/");
        Intent intent=new Intent(Intent.ACTION_VIEW,webpaage);
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }
    public void Udemy(View v){
        Uri webpaage = Uri.parse("https://www.udemy.com/");
        Intent intent=new Intent(Intent.ACTION_VIEW,webpaage);
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }


    }

