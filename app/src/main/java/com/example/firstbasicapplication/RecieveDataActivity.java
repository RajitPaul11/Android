package com.example.firstbasicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class RecieveDataActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_data);
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView2);
        t3=findViewById(R.id.textView3);
        t4=findViewById(R.id.textView4);

    Intent jk=getIntent();
    String name=jk.getStringExtra("student_name");
    int rollno=jk.getIntExtra("Roll_no",0 );
    double fees=jk.getDoubleExtra("fees_paid",0.0d);
    float cgpa=jk.getFloatExtra("cgpa",0.0f);
    boolean status=jk.getBooleanExtra("status",false);

    t1.setText("Name: "+name +"\nRoll no: "+ rollno+"\nFee: "+ fees
                    +"\nCGPA : " + cgpa+"\nStatus: "+status);

    Bundle b=jk.getBundleExtra("bundle");
    String s=b.getString("name");
    int roll_no=b.getInt("rollno");
    Float cggpa=b.getFloat("cgpa");
    Double fee_paid=b.getDouble("fee_paid");
    t2.setText("Name : "+s +"\n Roll no : "+ roll_no + "\nCGPA : "+ cggpa +
            "\nFee Paid : "+ fee_paid );

    String str="The values are";
    int arr1[]=jk.getIntArrayExtra("array");
    for(int i=0;i< arr1.length;i++)
        {
            str=str+" "+arr1[i];
        }

    t3.setText(str);

        String str1="The values are:";
        ArrayList <Integer> al=jk.getIntegerArrayListExtra("arraylist");
        for(int x: al)
        {
            str1=str1+" "+x+"\t";
        }

    t4.setText(str1);
    }
}
