package com.example.firstbasicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    EditText number1,number2;
    TextView result;
    int n1,n2,result1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        number1=findViewById(R.id.et1);
        number2=findViewById(R.id.et2);
        result=findViewById(R.id.tv1);
    }
    void get()
    {
        n1=Integer.parseInt(number1.getText().toString());
        n2=Integer.parseInt(number2.getText().toString());
    }

    public void add(View view)
    {
        get();
        result1=n1+n2;
        result.setText("The result of addition is "+ result1);
    }

    public void subtract(View view)
    {
        get();
        if(n1>n2) {
            result1 = n1 - n2;
            result.setText("The result of subtraction is " + result1);
        }
        else
        {
            result1= n2-n1;
            result.setText("The result of subtraction is" + result1);
        }
        }

    public void multiplication(View view)
    {
        get();
       if(n1==0 || n2==0)
       {
           Toast.makeText(this,"Zero result",Toast.LENGTH_LONG).show();
       }
       else {
           result1 = n1 * n2;
           result.setText("The result of Mulipilacation is " + result1);
       }
       }

    public void divison(View view)
    {
        get();
        if(n2==0 || n1<n2)
        {
            Toast.makeText(this,"not divisible",Toast.LENGTH_LONG).show();
        }
        else
        {
            result1 = n1 / n2;
            result.setText("The result of divison is " + result1);
        }
    }
}
