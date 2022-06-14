package com.example.ftm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SignUpStep1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_step1);
    }
    public void openActivity3(View v){
        Toast.makeText(this, "Sign Up", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, SignUpStep2.class);
        startActivity(intent);
    }
}