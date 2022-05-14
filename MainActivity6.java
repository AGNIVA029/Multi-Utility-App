package com.example.multiutilityandmulticonvertorwithcalculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;

    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;

    Button b1;
    Button b2;
    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        t1=findViewById(R.id.textView10);
        t2=findViewById(R.id.textView12);
        t3=findViewById(R.id.textView13);
        t4=findViewById(R.id.textView15);
        t5=findViewById(R.id.textView14);

        e1=findViewById(R.id.editTextTextPersonName23);
        e2=findViewById(R.id.editTextTextPersonName24);
        e3=findViewById(R.id.editTextTextPersonName25);
        e4=findViewById(R.id.editTextTextPersonName26);

        b1=findViewById(R.id.button10);
        b2=findViewById(R.id.button9);
        b3=findViewById(R.id.button5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d1=0.0,d2=0.0,d3=0.0,d4=0.0,s=0.0;
                if(!(e1.getText().toString().equals("")) && !(e2.getText().toString().equals("")) && !(e3.getText().toString().equals("")) && !(e4.getText().toString().equals(""))){
                    d1=Double.parseDouble(e1.getText().toString());
                    d2=Double.parseDouble(e2.getText().toString());
                    d3=Double.parseDouble(e3.getText().toString());
                    d4=Double.parseDouble(e4.getText().toString());

                    s=d1*((Math.pow((1+d3/100),(d2/d4))-1)/(d3/100))*(1+(d3/100));
                    t5.setText("Final amount to be received after investment :" + String.valueOf(String.format("%.2f", s)));
                }
                else{
                    Toast.makeText(MainActivity6.this,"Enter adequate fields",Toast.LENGTH_LONG).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d1=0.0,d2=0.0,d3=0.0,s=0.0;
                if(!(e1.getText().toString().equals("")) && !(e2.getText().toString().equals("")) && !(e3.getText().toString().equals(""))){
                    d1=Double.parseDouble(e1.getText().toString());
                    d2=Double.parseDouble(e2.getText().toString());
                    d3=Double.parseDouble(e3.getText().toString());

                    s=(d1*d2)+((d1*d2*(d2+1)/2)/12)*(d3/100);
                    t5.setText("Final amount to be received after investment :" + String.valueOf(String.format("%.2f", s)));
                }
                else{
                    Toast.makeText(MainActivity6.this,"Enter adequate fields",Toast.LENGTH_LONG).show();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d1=0.0,d2=0.0,d3=0.0,s=0.0;
                if(!(e1.getText().toString().equals("")) && !(e2.getText().toString().equals("")) && !(e3.getText().toString().equals(""))){
                    d1=Double.parseDouble(e1.getText().toString());
                    d2=Double.parseDouble(e2.getText().toString());
                    d3=Double.parseDouble(e3.getText().toString());

                    s=d1+d1*((Math.pow((1+d3/100),(d2/12)))-1);
                    t5.setText("Compound interest FD amount received will be :" + String.valueOf(String.format("%.2f", s)));
                }
                else{
                    Toast.makeText(MainActivity6.this,"Enter adequate fields",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}