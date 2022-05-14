package com.example.multiutilityandmulticonvertorwithcalculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity7 extends AppCompatActivity {

    public void convertLength(View view){

        Intent intent = new Intent(this,lengthConversionActivity.class);
        startActivity(intent);

    }

    public void convertTemperature(View view){

        Intent intent = new Intent(this,temperatureConversionActivity.class);
        startActivity(intent);

    }

    public void weight(View view){
        Intent intent = new Intent(this,MainActivity8.class);
        startActivity(intent);
    }

    public void time(View view){
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


    }
}