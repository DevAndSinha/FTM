package com.example.ftm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class fruit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
    }
    public void openActivity(View v){
        Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Cart.class);
        startActivity(intent);
    }
}