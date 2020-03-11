package com.example.firstbasicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ExploreActivity extends AppCompatActivity {
    CheckBox c1,c2,c3;
    EditText e1,e2;
    RadioGroup r1;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
    c1=findViewById(R.id.cb1);
    c2=findViewById(R.id.cb2);
    c3=findViewById(R.id.cb3);
    e1=findViewById(R.id.et1);
    e2=findViewById(R.id.et2);
    r1=findViewById(R.id.rg);
    }

    public void tariff(View view)
    {
        int total=0;
        int x,y,packvalue;
        x=Integer.parseInt(e1.getText().toString());
        y=Integer.parseInt(e2.getText().toString());
        if(c1.isChecked())
        {
            total+=3500;
        }
        if(c2.isChecked())
        {
            total+=8500;
        }
        if(c3.isChecked())
        {
            total+=4500;
        }
        packvalue=x*y*total;
        Toast.makeText(this,packvalue, Toast.LENGTH_LONG).show();
    }
}
