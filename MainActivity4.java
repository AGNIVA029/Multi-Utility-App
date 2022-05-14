package com.example.multiutilityandmulticonvertorwithcalculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    EditText s1;
    EditText s2;
    EditText s3;
    EditText s4;
    EditText s5;
    EditText s6;
    EditText s7;
    EditText s8;

    EditText c1;
    EditText c2;
    EditText c3;
    EditText c4;
    EditText c5;
    EditText c6;
    EditText c7;
    EditText c8;

    TextView grade;
    TextView sgpa;
    TextView res;

    Button cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        s1=findViewById(R.id.editTextTextPersonName15);
        s2=findViewById(R.id.editTextTextPersonName16);
        s3=findViewById(R.id.editTextTextPersonName17);
        s4=findViewById(R.id.editTextTextPersonName18);
        s5=findViewById(R.id.editTextTextPersonName19);
        s6=findViewById(R.id.editTextTextPersonName20);
        s7=findViewById(R.id.editTextTextPersonName21);
        s8=findViewById(R.id.editTextTextPersonName22);

        c1=findViewById(R.id.editTextNumber9);
        c2=findViewById(R.id.editTextNumber10);
        c3=findViewById(R.id.editTextNumber11);
        c4=findViewById(R.id.editTextNumber12);
        c5=findViewById(R.id.editTextNumber13);
        c6=findViewById(R.id.editTextNumber14);
        c7=findViewById(R.id.editTextNumber15);
        c8=findViewById(R.id.editTextNumber16);

        sgpa=findViewById(R.id.textView8);
        grade=findViewById(R.id.textView9);
        res=findViewById(R.id.textView11);

        cal=findViewById(R.id.button);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double g1 = 0.0, g2 = 0.0, g3 = 0.0, g4 = 0.0, g5 = 0.0, g6 = 0.0, g7 = 0.0, g8 = 0.0, d1 = 0.0, d2 = 0.0, d3 = 0.0, d4 = 0.0, d5 = 0.0, d6 = 0.0, d7 = 0.0, d8 = 0.0;
                double z = 0.0;
                if (s1.getText().toString().equals("") || s2.getText().toString().equals("") || s3.getText().toString().equals("") || s4.getText().toString().equals("") || s5.getText().toString().equals("") || s6.getText().toString().equals("") || s7.getText().toString().equals("") || s8.getText().toString().equals(""))
                    g1 = g2 = g3 = g4 = g5 = g6 = g7 = g8 = d1 = d2 = d3 = d4 = d5 = d6 = d7 = d8 = 0.0;
                if (!(s1.getText().toString().equals(""))) {
                    g1 = Double.parseDouble(s1.getText().toString());
                    d1 = Double.parseDouble(c1.getText().toString());
                }
                if (!(s2.getText().toString().equals(""))) {
                    g2 = Double.parseDouble(s2.getText().toString());
                    d2 = Double.parseDouble(c2.getText().toString());
                }
                if (!(s3.getText().toString().equals(""))) {
                    g3 = Double.parseDouble(s3.getText().toString());
                    d3 = Double.parseDouble(c3.getText().toString());
                }
                if (!(s4.getText().toString().equals(""))) {
                    g4 = Double.parseDouble(s4.getText().toString());
                    d4 = Double.parseDouble(c4.getText().toString());
                }
                if (!(s5.getText().toString().equals(""))) {
                    g5 = Double.parseDouble(s5.getText().toString());
                    d5 = Double.parseDouble(c5.getText().toString());
                }
                if (!(s6.getText().toString().equals(""))) {
                    g6 = Double.parseDouble(s6.getText().toString());
                    d6 = Double.parseDouble(c6.getText().toString());
                }
                if (!(s7.getText().toString().equals(""))) {
                    g7 = Double.parseDouble(s7.getText().toString());
                    d7 = Double.parseDouble(c7.getText().toString());
                }
                if (!(s8.getText().toString().equals(""))) {
                    g8 = Double.parseDouble(s8.getText().toString());
                    d8 = Double.parseDouble(c8.getText().toString());
                }
                if (s1.getText().toString().equals("") && s2.getText().toString().equals("") && s3.getText().toString().equals("") && s4.getText().toString().equals("") && s5.getText().toString().equals("") && s6.getText().toString().equals("") && s7.getText().toString().equals("") && s8.getText().toString().equals(""))
                    Toast.makeText(MainActivity4.this, "No fields entered", Toast.LENGTH_LONG).show();
                else {
                    z = (g1 * d1 + g2 * d2 + g3 * d3 + g4 * d4 + g5 * d5 + g6 * d6 + g7 * d7 + g8 * d8) / (d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8);

                    res.setText("Your final C.G.P.A is:" + String.valueOf(String.format("%.2f", z)));
                }
            }
        });

    }
}