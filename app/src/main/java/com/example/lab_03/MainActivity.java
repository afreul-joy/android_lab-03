package com.example.lab_03;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et1 = (EditText) findViewById(R.id.et1); // for input
        EditText et2 = (EditText) findViewById(R.id.et2);

        Button btn1 = (Button) findViewById(R.id.btn1); // btn
        TextView tv3 = (TextView) findViewById(R.id.tv3); // result

        //event listener
        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                // in android everything takes input as string
                String num1 = et1.getText().toString();
                String num2 = et2.getText().toString(); //5 string

                Integer n1 = Integer.parseInt(num1); // convert string to int
                Integer n2 = Integer.parseInt(num2);

                int result = n1 + n2;  // result

                tv3.setText("Summation "+result); // showing result
            }
        });

    }
}