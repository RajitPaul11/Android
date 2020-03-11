package com.example.firstbasicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb,r1;
    CheckBox c1,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        rg=findViewById(R.id.R1);
        c1=findViewById(R.id.cb1);
        c2=findViewById(R.id.cb2);
        c3=findViewById(R.id.cb3);
        c4=findViewById(R.id.cb4);
        r1=findViewById(R.id.rb1);
    }

    public void submit(View view)
    {
        int id=(rg.getCheckedRadioButtonId());
        rb=findViewById(id);
        Toast.makeText(this, "Option Selected"+rb.getText(), Toast.LENGTH_SHORT).show();
        int total=0;
        if(c1.isChecked() && c2.isChecked())
        {
            total += 50;
        }
        if(r1.isChecked())
        {
            total += 50;
        }
        Toast.makeText(this,"Marks obtained:"+total, Toast.LENGTH_LONG).show();
    }
}
