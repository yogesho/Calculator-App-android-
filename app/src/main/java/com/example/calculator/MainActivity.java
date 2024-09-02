package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editFirst=findViewById(R.id.edtTextOne);
        EditText editSecond=findViewById(R.id.edtTextTwo);
        Button button=findViewById(R.id.btnAdd);
        TextView textView=findViewById(R.id.textview);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=editFirst.getText().toString();
                String num2=editSecond.getText().toString();


                // check input is not empty
                if(!num1.isEmpty() && !num2.isEmpty()){
                    int number1=Integer.parseInt(num1);
                    int number2=Integer.parseInt(num2);

                    // perform addition
                    int sum=number1+number2;


                    textView.setText("Result :"+sum);
                }else{
                    textView.setText("Please enter both the numbers");
                }
            }
        });
    }
}