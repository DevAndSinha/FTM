package com.example.ftm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private RadioButton mConsumer, mProducer;
    private RadioGroup rbGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        rbGroup = findViewById(R.id.rbGroup);
        mConsumer = findViewById(R.id.radioButton3);
        mProducer = findViewById(R.id.radioButton2);
    }
    public void openActivity(View v){
        if(mProducer.isChecked()) {
            Toast.makeText(this, "login successful", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "login successful", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, ConsumerHome.class);
            startActivity(intent);
        }

    }
}