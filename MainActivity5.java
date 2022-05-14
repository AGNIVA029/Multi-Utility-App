package com.example.multiutilityandmulticonvertorwithcalculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    EditText kilometerEditText;
    EditText meterEditText;
    EditText centimeterEditText;
    EditText footEditText;
    EditText inchesEditText;

    public void reset(View view){

        kilometerEditText.setText("");

        centimeterEditText.setText("");

        footEditText.setText("");
        meterEditText.setText("");
        inchesEditText.setText("");
    }
    public void convert(View view) {

        if (!kilometerEditText.getText().toString().equals("")) {

            float kilometers = Float.parseFloat(kilometerEditText.getText().toString());
            meterEditText.setText(String.valueOf(kilometers/60) + " m");
            centimeterEditText.setText(String.valueOf(kilometers/3600) + " hr");

            footEditText.setText(String.valueOf(kilometers/86400) + " d");
            inchesEditText.setText(String.valueOf(kilometers/604800) + " w");

        } else if (!meterEditText.getText().toString().equals("")) {

            float meters = Float.parseFloat(meterEditText.getText().toString());
            kilometerEditText.setText(String.valueOf(meters*60) + " s");
            centimeterEditText.setText(String.valueOf(meters / 60) + " hr");

            footEditText.setText(String.valueOf(meters /1440) + " d");
            inchesEditText.setText(String.valueOf(meters /10080) + " w");

        } else if (!centimeterEditText.getText().toString().equals("")) {

            float centimeters = Float.parseFloat(centimeterEditText.getText().toString());
            meterEditText.setText(String.valueOf(centimeters*60) + " m");
            kilometerEditText.setText(String.valueOf(centimeters *3600) + " s");

            footEditText.setText(String.valueOf(centimeters /24) + " d");
            inchesEditText.setText(String.valueOf(centimeters /168) + " w");

        } else if (!footEditText.getText().toString().equals("")) {

            float foot = Float.parseFloat(footEditText.getText().toString());
            meterEditText.setText(String.valueOf(foot * 1440) + " m");
            centimeterEditText.setText(String.valueOf(foot * 24) + " hr");

            kilometerEditText.setText(String.valueOf(foot * 86400) + " s");
            inchesEditText.setText(String.valueOf(foot /7) + " w");

        } else if (!inchesEditText.getText().toString().equals("")) {

            float inches = Float.parseFloat(inchesEditText.getText().toString());
            meterEditText.setText(String.valueOf(inches * 10080) + " m");
            centimeterEditText.setText(String.valueOf(inches * 168) + " hr");

            footEditText.setText(String.valueOf(inches * 7) + " d");
            kilometerEditText.setText(String.valueOf(inches * 604800) + " s");

        }
        else{
            Toast.makeText(MainActivity5.this,"Invalid input type",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        kilometerEditText = (EditText)findViewById(R.id.kilometerEditText);
        meterEditText = (EditText)findViewById(R.id.meterEditText);
        centimeterEditText = (EditText)findViewById(R.id.centimeterEditText);
        footEditText = (EditText)findViewById(R.id.footEditText);
        inchesEditText = (EditText)findViewById(R.id.inchesEditText);
    }
}