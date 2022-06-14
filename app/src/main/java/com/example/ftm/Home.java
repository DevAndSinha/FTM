package com.example.ftm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void openActivity(View v){
        Intent intent = new Intent(this,Search.class);
        startActivity(intent);
    }
    public void openActivity2(View v){
        Intent intent = new Intent(this,Veg.class);
        startActivity(intent);
    }
    public void openActivity11(View v){
        Intent intent = new Intent(this,fruit.class);
        startActivity(intent);
    }
    public void openActivity3(View v){
        Intent intent = new Intent(this,pulses.class);
        startActivity(intent);
    }
    public void openActivity4(View v){
        Intent intent = new Intent(this,grains.class);
        startActivity(intent);
    }
}