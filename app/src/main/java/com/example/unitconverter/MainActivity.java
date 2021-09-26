package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import android.widget.Button;

import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    private TextView textView2;
    private TextView textView1;
    private EditText editTextNumber;

    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView2=findViewById(R.id.textView2);
        textView1=findViewById(R.id.textView1);
        editTextNumber=findViewById(R.id.editTextNumber);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Thnxx for using the app!", Toast.LENGTH_SHORT).show();
                string s=editTextNumber.getText().toString();
                int kg=Integer.parseInt(s);
                double pound=2.2*kg;
                textView2.setText("converted value of this kg value in pounds  is     "+pound);
            }
            /*public void calculate(View view){

                String s=editTextNumber.getText().toString();
                int kg=Integer.parseInt(s);
                double pound=2.205*kg;
                textView2.setText("converted value of this kg value is"+pound);
            }*/
        });
    }

}