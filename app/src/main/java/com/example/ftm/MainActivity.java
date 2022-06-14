package com.example.ftm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity2(View v){
        Toast.makeText(this, "Sign Up", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, SignUpStep1.class);
        startActivity(intent);
    }
    public void openActivity(View v){
        Toast.makeText(this, "login", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }
}