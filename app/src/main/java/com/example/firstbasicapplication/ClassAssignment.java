package com.example.firstbasicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ClassAssignment extends AppCompatActivity {

    EditText number3,number4,number5,number6,number7;
    TextView result3;
    int x1,x2,x3,x4,x5,r1;
    double r2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_assignment);


        number3=findViewById(R.id.e1);
        number4=findViewById(R.id.e2);
        number5=findViewById(R.id.e3);
        number6=findViewById(R.id.e4);
        number7=findViewById(R.id.e5);
        result3=findViewById(R.id.t1);

    }

    public void total(View view)
    {
        x1=Integer.parseInt(number3.getText().toString());
        x2=Integer.parseInt(number4.getText().toString());
        x3=Integer.parseInt(number5.getText().toString());
        r1=x1+x2+x3;
        result3.setText("The total number of coins are"+r1);
    }

    public void calculate(View view)
    {
        x4=Integer.parseInt(number6.getText().toString());
        x5=Integer.parseInt(number7.getText().toString());
        r2=Math.hypot(x4,x5);
        Toast.makeText(this, "The hypotenuse is :"+ r2,Toast.LENGTH_LONG).show();
    }

}
