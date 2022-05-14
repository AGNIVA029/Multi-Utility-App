package com.example.multiutilityandmulticonvertorwithcalculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {

    EditText kilometerEditText;
    EditText meterEditText;
    EditText centimeterEditText;
    EditText footEditText;
    EditText inchesEditText;
    EditText micronEditText;
    EditText milesEditText;

    public void reset(View view){

        kilometerEditText.setText("");
        micronEditText.setText("");
        centimeterEditText.setText("");
        milesEditText.setText("");
        footEditText.setText("");
        meterEditText.setText("");
        inchesEditText.setText("");
    }
    public void convert(View view){

        if(!kilometerEditText.getText().toString().equals("")){

            float kilometers = Float.parseFloat(kilometerEditText.getText().toString());
            meterEditText.setText(String.valueOf(kilometers*1000)+" g");
            centimeterEditText.setText(String.valueOf(kilometers*1000000)+" mg");
            milesEditText.setText(String.valueOf(kilometers*2.204)+" p");
            footEditText.setText(String.valueOf(kilometers*35.274)+ " o");
            inchesEditText.setText(String.valueOf(kilometers*0.157)+" s");
            micronEditText.setText(String.valueOf(kilometers*1000000000)+" meug");
        }
        else if(!meterEditText.getText().toString().equals("")){

            float meters = Float.parseFloat(meterEditText.getText().toString());
            kilometerEditText.setText(String.valueOf(meters/1000)+" kg");
            centimeterEditText.setText(String.valueOf(meters*1000)+" mg");
            milesEditText.setText(String.valueOf(meters*0.0022)+" p");
            footEditText.setText(String.valueOf(meters*0.035)+ " o");
            inchesEditText.setText(String.valueOf(meters*0.00015)+" s");
            micronEditText.setText(String.valueOf(meters*1000000)+" meug");
        }
        else if (!centimeterEditText.getText().toString().equals("")){

            float centimeters = Float.parseFloat(centimeterEditText.getText().toString());
            meterEditText.setText(String.valueOf(centimeters/1000)+" g");
            kilometerEditText.setText(String.valueOf(centimeters/1000000)+" kg");
            milesEditText.setText(String.valueOf(centimeters*(2.204/1000000))+" p");
            footEditText.setText(String.valueOf(centimeters*(3.527/100000))+ " o");
            inchesEditText.setText(String.valueOf(centimeters*(1.574/10000000))+" s");
            micronEditText.setText(String.valueOf(centimeters*1000)+" meug");
        }
        else if(!milesEditText.getText().toString().equals("")){

            float miles = Float.parseFloat(milesEditText.getText().toString());
            meterEditText.setText(String.valueOf(miles*453.592)+" g");
            centimeterEditText.setText(String.valueOf(miles*453592)+" mg");
            kilometerEditText.setText(String.valueOf(miles*0.453)+" kg");
            footEditText.setText(String.valueOf(miles*16)+ " o");
            inchesEditText.setText(String.valueOf(miles*0.071)+" s");
            micronEditText.setText(String.valueOf(miles*4.536*100000000)+" meug");
        }
        else if(!footEditText.getText().toString().equals("")){

            float foot = Float.parseFloat(footEditText.getText().toString());
            meterEditText.setText(String.valueOf(foot*28.3495)+" g");
            centimeterEditText.setText(String.valueOf(foot*28349.5)+" mg");
            milesEditText.setText(String.valueOf(foot*0.0625)+" p");
            kilometerEditText.setText(String.valueOf(foot*0.028)+ " kg");
            inchesEditText.setText(String.valueOf(foot*0.0044)+" s");
            micronEditText.setText(String.valueOf(foot*2.835*10000000)+" meug");
        }
        else if(!inchesEditText.getText().toString().equals("")){

            float inches = Float.parseFloat(inchesEditText.getText().toString());
            meterEditText.setText(String.valueOf(inches*6350.29)+" g");
            centimeterEditText.setText(String.valueOf(inches*6.35*1000000)+" mg");
            milesEditText.setText(String.valueOf(inches*14)+" p");
            footEditText.setText(String.valueOf(inches*224)+ " o");
            kilometerEditText.setText(String.valueOf(inches*6.350)+" kg");
            micronEditText.setText(String.valueOf(inches*6.35*1000000000)+" meug");
        }
        else if(!micronEditText.getText().toString().equals("")){

            float micrometer = Float.parseFloat(micronEditText.getText().toString());
            meterEditText.setText(String.valueOf(micrometer/1000000)+" g");
            centimeterEditText.setText(String.valueOf(micrometer/1000)+" mg");
            milesEditText.setText(String.valueOf(micrometer*(2.2046/1000000000))+" p");
            footEditText.setText(String.valueOf(micrometer*(3.5274/100000000))+ " o");
            inchesEditText.setText(String.valueOf(micrometer*(1.574/(1000000000*10)))+" s");
            kilometerEditText.setText(String.valueOf(micrometer/1000000000)+" kg");
        }
        else{
            Toast.makeText(MainActivity8.this,"Invalid input type",Toast.LENGTH_LONG).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        kilometerEditText = (EditText)findViewById(R.id.kilometerEditText);
        meterEditText = (EditText)findViewById(R.id.meterEditText);
        centimeterEditText = (EditText)findViewById(R.id.centimeterEditText);
        footEditText = (EditText)findViewById(R.id.footEditText);
        inchesEditText = (EditText)findViewById(R.id.inchesEditText);
        milesEditText = (EditText)findViewById(R.id.milesEditText);
        micronEditText = (EditText)findViewById(R.id.micronEditText);
    }
}