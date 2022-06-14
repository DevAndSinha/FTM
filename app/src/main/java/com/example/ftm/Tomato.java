package com.example.ftm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Tomato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomato);
    }
    public void openActivity(View v){
        Toast.makeText(this, "cart", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Cart2.class);
        startActivity(intent);
    }
}