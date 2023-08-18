package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView answer;
    TextView calculate;
    EditText number1;
    EditText number2;
    EditText operator;

    int num1;
    int num2;
    String opr;
    int ans;
    boolean temp = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer = findViewById(R.id.answer);
        calculate = findViewById(R.id.calculate);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        operator = findViewById(R.id.operator);



        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                opr = operator.getText().toString();

                System.out.println(num1);
                System.out.println(num2);
                System.out.println(opr);
                System.out.println((opr.equals("+")));

                if (opr.equals("+")){
                    ans = num1 + num2;
                    temp = true;
                }
                else if (opr.equals("-")){
                    ans = num1 - num2;
                    temp = true;
                }
                else if (opr.equals("*")){
                    ans = num1 * num2;
                    temp = true;
                }
                else if (opr.equals("/")){
                    ans = num1 / num2;
                    temp = true;
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid Operator", Toast.LENGTH_SHORT).show();
                }

                if (temp){

                    answer.setText("Answer is: "+ans);
                    answer.setVisibility(View.VISIBLE);

                }

            }
        });

    }
}