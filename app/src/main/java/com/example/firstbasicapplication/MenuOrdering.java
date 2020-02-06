package com.example.firstbasicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MenuOrdering extends AppCompatActivity {

    CheckBox cb1,cb2,cb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ordering);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
    }

    public void Order(View view)
    {
        int total=0;
        StringBuilder msg=new StringBuilder();
        msg.append("Selected Items");
        if(cb1.isChecked())
        {
            total=total+150;
            msg.append("\n Sandwich: Rs 150");

        }
        if(cb2.isChecked())
        {
            total=total+150;
            msg.append("\n FrenchFries: Rs150");
        }
        if(cb3.isChecked())
        {
            total=total+300;
            msg.append("\n Pizza: Rs 300");
        }
        msg.append("\n Total="+ total);
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
