package com.example.firstbasicapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edt1;
    EditText s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s=findViewById(R.id.edt1);
    }

    public void show_toast(View view)
    {
        Toast.makeText(this,"First Toast App",Toast.LENGTH_SHORT).show();
    }

    public void show_calculator_activity(View view)
    {
        Intent it=new Intent(this,CalculatorActivity.class);
        startActivity(it);
    }

    public void show_Class_Assignment(View view)
    {
        Intent ij=new Intent(this,ClassAssignment.class);
        startActivity(ij);
    }

    public void send_data(View view)
    {
        Intent jk=new Intent(this,RecieveDataActivity.class);
        //Storing data through Intent
        jk.putExtra("Student_name","John");
        jk.putExtra("Roll_no",10);
        jk.putExtra("Fees_paid",40000.00d);
        jk.putExtra("CGPA",9.6f);
        jk.putExtra("Status",true);
        //Storing data through Bundle
        Bundle b=new Bundle();
        b.putString("name","John");
        b.putInt("rollno",10);
        b.putFloat("cgpa",9.7f);
        b.putDouble("fee_paid",40000.00d);
        jk.putExtra("bundle",b);

        //Pass Array
        int arr1[]={100,200,300};
        jk.putExtra("array",arr1);

        //Pass ArrayList
        ArrayList al =new ArrayList <Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        jk.putExtra("arraylist",al);
        startActivity(jk);

    }


    public void Lab1(View view)
    {
        String str=s.getText().toString();
        Intent i=new Intent(this,LabEvaluation.class);
        i.putExtra("Name",str);
        startActivity(i);
    }

    public void SearchWeb(View view)
    {
        Intent it=new Intent(this,Webview.class);
        startActivity(it);
    }

    public void Restaurant(View view)
    {
        Intent it=new Intent(this,MenuOrdering.class);
        startActivity(it);
    }

    public void SharedPref(View view)
    {
        Intent it=new Intent(this,SharedPrefDemo.class);
        startActivity(it);
    }

    public void tour(View view)
    {
        Intent t=new Intent(this,ExploreActivity.class);
        startActivity(t);
    }

    public void minquiz(View view)
    {
        Intent it=new Intent(this,Quiz.class);
        startActivity(it);
    }

    public void List(View view)
    {
        Intent it=new Intent(this,MediaPlayerActivity.class);
        startActivity(it);
    }

    public void custom(View view)
    {
        Intent it=new Intent(this,StudentlistActivity.class);
        startActivity(it);
    }
}
