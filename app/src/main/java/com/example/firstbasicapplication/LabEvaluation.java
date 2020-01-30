package com.example.firstbasicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LabEvaluation extends AppCompatActivity {
    TextView txtv1;
    EditText ext1,ext2,ext3,ext4,ext5;
    int n1,n2,n3,n4,n5,grade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_evaluation);
        txtv1=findViewById(R.id.txtv1);
        ext1=findViewById(R.id.ext2);
        ext2=findViewById(R.id.ext3);
        ext3=findViewById(R.id.ext4);
        ext4=findViewById(R.id.ext5);
        ext5=findViewById(R.id.ext6);

        Intent i=getIntent();
       String s= i.getStringExtra("Name");
        txtv1.setText("      "+s);
    }
    void get()
    {
        n1=Integer.parseInt(ext1.getText().toString());
        n2=Integer.parseInt(ext2.getText().toString());
        n3=Integer.parseInt(ext3.getText().toString());
        n4=Integer.parseInt(ext4.getText().toString());
        n5=Integer.parseInt(ext5.getText().toString());

    }

    public void Grade(View view)
    {
        get();
        grade=(n1+n2+n3+n4+n5)/5;
        if(grade>=81 && grade<=100)
        {
           Toast.makeText(this,"DISTINCTION",Toast.LENGTH_LONG).show();
        }
        else if(grade>= 71 && grade<=80)
        {
            Toast.makeText(this,"FIRST CLASS",Toast.LENGTH_LONG).show();
        }
        else if(grade>=61 && grade<=70)
        {
            Toast.makeText(this,"SECOND CLASS",Toast.LENGTH_LONG).show();
        }
        else if(grade>=41 && grade<=60)
        {
            Toast.makeText(this,"THIRD CLASS",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,"FAIL",Toast.LENGTH_LONG).show();
        }
    }
}
