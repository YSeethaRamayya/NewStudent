package com.example.android.newstudent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CostofLiving extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costof_living);
    }
    public void APTF(View v){
        Uri webpage = Uri.parse("http://www.apartmentfinder.com/Illinois/Springfield-Apartments");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        intent.setData(Uri.parse("geo:39.7608423,-89.6845234"));
//        Uri webpage = Uri.parse("http://www.apartmentfinder.com/Illinois/Springfield-Apartments");
//        intent.putExtra(Intent.EXTRA_ORIGINATING_URI, webpage);
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        }
    }
}
