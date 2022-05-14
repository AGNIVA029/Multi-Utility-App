package com.example.multiutilityandmulticonvertorwithcalculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity3 extends AppCompatActivity {
    EditText g1;
    EditText g2;
    EditText g3;
    EditText g4;
    EditText g5;
    EditText g6;
    EditText g7;

    EditText sub1;
    EditText sub2;
    EditText sub3;
    EditText sub4;
    EditText sub5;
    EditText sub6;
    EditText sub7;

    EditText c1;
    EditText c2;
    EditText c3;
    EditText c4;
    EditText c5;
    EditText c6;
    EditText c7;

    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        sub1=findViewById(R.id.editTextTextPersonName);
        sub2=findViewById(R.id.editTextTextPersonName2);
        sub3=findViewById(R.id.editTextTextPersonName3);
        sub4=findViewById(R.id.editTextTextPersonName4);
        sub5=findViewById(R.id.editTextTextPersonName5);
        sub6=findViewById(R.id.editTextTextPersonName6);
        sub7=findViewById(R.id.editTextTextPersonName7);

        c1=findViewById(R.id.editTextNumber);
        c2=findViewById(R.id.editTextNumber2);
        c3=findViewById(R.id.editTextNumber3);
        c4=findViewById(R.id.editTextNumber4);
        c5=findViewById(R.id.editTextNumber5);
        c6=findViewById(R.id.editTextNumber6);
        c7=findViewById(R.id.editTextNumber7);

        g2=findViewById(R.id.editTextTextPersonName9);
        g3=findViewById(R.id.editTextTextPersonName10);
        g4=findViewById(R.id.editTextTextPersonName11);
        g5=findViewById(R.id.editTextTextPersonName12);
        g6=findViewById(R.id.editTextTextPersonName13);
        g7=findViewById(R.id.editTextTextPersonName14);
        g1=findViewById(R.id.editTextTextPersonName8);

        TextView subject=findViewById(R.id.textView4);
        TextView credits=findViewById(R.id.textView5);
        TextView grade=findViewById(R.id.textView6);
        res=findViewById(R.id.textView7);

        Button cal=findViewById(R.id.button4);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double cr1 = 0.0,cr2=0.0,cr3=0.0,cr4=0.0,cr5=0.0,cr6=0.0,cr7=0.0;
                double m1 =0.0,m2=0.0,m3=0.0,m4=0.0,m5=0.0,m6=0.0,m7=0.0;

                if(sub1.getText().toString().equals("")||sub2.getText().toString().equals("")||sub3.getText().toString().equals("")||sub4.getText().toString().equals("")||sub5.getText().toString().equals("")||sub6.getText().toString().equals("")||sub7.getText().toString().equals("")){
                    m1=m2=m3=m4=m5=m6=m7=cr1=cr2=cr3=cr4=cr5=cr6=cr7=0.0;
                }
                if(!(sub1.getText().toString().equals(""))) {
                    cr1=Double.parseDouble(c1.getText().toString());
                    if (g1.getText().toString().equals("S"))
                        m1 = cr1 * 10.0;
                    if (g1.getText().toString().equals("A"))
                        m1 = cr1 * 9.0;
                    if (g1.getText().toString().equals("B"))
                        m1 = cr1 * 8.0;
                    if (g1.getText().toString().equals("C"))
                        m1 = cr1 * 7.0;
                    if (g1.getText().toString().equals("D"))
                        m1 = cr1 * 6.0;
                    if (g1.getText().toString().equals("E"))
                        m1 = cr1 * 5.0;
                    if (g1.getText().toString().equals("F"))
                        m1 = cr1 * 4.0;
                    if (g1.getText().toString().equals("G"))
                        m1 = cr1 * 3.0;
                    if (g1.getText().toString().equals("H"))
                        m1 = cr1 * 2.0;
                    if (g1.getText().toString().equals("I"))
                        m1 = cr1*1.0;
                }
                if(!(sub2.getText().toString().equals(""))){
                    cr2=Double.parseDouble(c2.getText().toString());
                    if(g2.getText().toString().equals("S"))
                        m2=cr2*10.0;
                    if(g2.getText().toString().equals("A"))
                        m2=cr2*9.0;
                    if(g2.getText().toString().equals("B"))
                        m2=cr2*8.0;
                    if(g2.getText().toString().equals("C"))
                        m2=cr2*7.0;
                    if(g2.getText().toString().equals("D"))
                        m2=cr2*6.0;
                    if(g2.getText().toString().equals("E"))
                        m2=cr2*5.0;
                    if(g2.getText().toString().equals("F"))
                        m2=cr2*4.0;
                    if(g2.getText().toString().equals("G"))
                        m2=cr2*3.0;
                    if(g2.getText().toString().equals("H"))
                        m2=cr2*2.0;
                    if(g2.getText().toString().equals("I"))
                        m2=cr2*1.0;
                }
                if(!(sub3.getText().toString().equals(""))){
                    cr3=Double.parseDouble(c3.getText().toString());
                    if(g3.getText().toString().equals("S"))
                        m3=cr3*10.0;
                    if(g3.getText().toString().equals("A"))
                        m3=cr3*9.0;
                    if(g3.getText().toString().equals("B"))
                        m3=cr3*8.0;
                    if(g3.getText().toString().equals("C"))
                        m3=cr3*7.0;
                    if(g3.getText().toString().equals("D"))
                        m3=cr3*6.0;
                    if(g3.getText().toString().equals("E"))
                        m3=cr3*5.0;
                    if(g3.getText().toString().equals("F"))
                        m3=cr3*4.0;
                    if(g3.getText().toString().equals("G"))
                        m3=cr3*3.0;
                    if(g3.getText().toString().equals("H"))
                        m3=cr3*2.0;
                    if(g3.getText().toString().equals("I"))
                        m3=cr3*1.0;
                }
                if(!(sub4.getText().toString().equals(""))){
                    cr4=Double.parseDouble(c4.getText().toString());
                    if(g4.getText().toString().equals("S"))
                        m4=cr4*10.0;
                    if(g4.getText().toString().equals("A"))
                        m4=cr4*9.0;
                    if(g4.getText().toString().equals("B"))
                        m4=cr4*8.0;
                    if(g4.getText().toString().equals("C"))
                        m4=cr4*7.0;
                    if(g4.getText().toString().equals("D"))
                        m4=cr4*6.0;
                    if(g4.getText().toString().equals("E"))
                        m4=cr4*5.0;
                    if(g4.getText().toString().equals("F"))
                        m4=cr4*4.0;
                    if(g4.getText().toString().equals("G"))
                        m4=cr4*3.0;
                    if(g4.getText().toString().equals("H"))
                        m4=cr4*2.0;
                    if(g4.getText().toString().equals("I"))
                        m4=cr4*1.0;
                }
                if(!(sub5.getText().toString().equals(""))){
                    cr5=Double.parseDouble(c5.getText().toString());
                    if(g5.getText().toString().equals("S"))
                        m5=cr5*10.0;
                    if(g5.getText().toString().equals("A"))
                        m5=cr5*9.0;
                    if(g5.getText().toString().equals("B"))
                        m5=cr5*8.0;
                    if(g5.getText().toString().equals("C"))
                        m5=cr5*7.0;
                    if(g5.getText().toString().equals("D"))
                        m5=cr5*6.0;
                    if(g5.getText().toString().equals("E"))
                        m5=cr5*5.0;
                    if(g5.getText().toString().equals("F"))
                        m5=cr5*4.0;
                    if(g5.getText().toString().equals("G"))
                        m5=cr5*3.0;
                    if(g5.getText().toString().equals("H"))
                        m5=cr5*2.0;
                    if(g5.getText().toString().equals("I"))
                        m5=cr5*1.0;
                }
                if(!(sub6.getText().toString().equals(""))){
                    cr6=Double.parseDouble(c6.getText().toString());
                    if(g6.getText().toString().equals("S"))
                        m6=cr6*10.0;
                    if(g6.getText().toString().equals("A"))
                        m6=cr6*9.0;
                    if(g6.getText().toString().equals("B"))
                        m6=cr6*8.0;
                    if(g6.getText().toString().equals("C"))
                        m6=cr6*7.0;
                    if(g6.getText().toString().equals("D"))
                        m6=cr6*6.0;
                    if(g6.getText().toString().equals("E"))
                        m6=cr6*5.0;
                    if(g6.getText().toString().equals("F"))
                        m6=cr6*4.0;
                    if(g6.getText().toString().equals("G"))
                        m6=cr6*3.0;
                    if(g6.getText().toString().equals("H"))
                        m6=cr6*2.0;
                    if(g6.getText().toString().equals("I"))
                        m6=cr6*1.0;
                }
                if(!(sub7.getText().toString().equals(""))){
                    cr7=Double.parseDouble(c7.getText().toString());
                    if(g7.getText().toString().equals("S"))
                        m7=cr7*10.0;
                    if(g7.getText().toString().equals("A"))
                        m7=cr7*9.0;
                    if(g7.getText().toString().equals("B"))
                        m7=cr7*8.0;
                    if(g7.getText().toString().equals("C"))
                        m7=cr7*7.0;
                    if(g7.getText().toString().equals("D"))
                        m7=cr7*6.0;
                    if(g7.getText().toString().equals("E"))
                        m7=cr7*5.0;
                    if(g7.getText().toString().equals("F"))
                        m7=cr7*4.0;
                    if(g7.getText().toString().equals("G"))
                        m7=cr7*3.0;
                    if(g7.getText().toString().equals("H"))
                        m7=cr7*2.0;
                    if(g7.getText().toString().equals("I"))
                        m7=cr7*1.0;
                }
                if(g1.getText().toString().equals("") && g2.getText().toString().equals("") && g3.getText().toString().equals("") && g4.getText().toString().equals("") && g5.getText().toString().equals("") && g6.getText().toString().equals("") && g7.getText().toString().equals(""))
                    Toast.makeText(MainActivity3.this,"No fields entered",Toast.LENGTH_LONG).show();
                else {

                    double r = (m1 + m2 + m3 + m4 + m5 + m6 + m7) / (cr1 + cr2 + cr3 + cr4 + cr5 + cr6 + cr7);

                    res.setText("Your final G.P.A is :" + String.valueOf(String.format("%.2f", r)));
                }
            }
        });
    }
}