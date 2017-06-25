package com.example.android.newstudent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Insurance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance);
    }
    public void HInsurance(View v){
        Uri webpage = Uri.parse("http://www.bcbsil.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void VInsurance(View v){
        Uri webpage = Uri.parse("http://www.illinoisvehicle.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void VIInsurance(View v){
        Uri webpage = Uri.parse("https://www.ehealthinsurance.com/vision-insurance");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void DInsurance(View v){
        Uri webpage = Uri.parse("https://www.ehealthinsurance.com/dental-insurance");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void PInsurance(View v){
        Uri webpage = Uri.parse("http://www.healthypawspetinsurance.com/locations/IL/" +
                "illinois-pet-insurance.aspx");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
