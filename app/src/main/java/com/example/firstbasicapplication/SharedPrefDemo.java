package com.example.firstbasicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class SharedPrefDemo extends AppCompatActivity {

    EditText et1,et2;
    CheckBox c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref_demo);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        c1=findViewById(R.id.Cb1);
    }

    public void Save(View view)
    {
        if(c1.isChecked())
        {
            SharedPreferences sharedpref= PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor=sharedpref.edit();
            String username=et1.getText().toString();
            String password=et2.getText().toString();
            editor.putString("username",username);
            editor.putString("password",password);
            editor.commit();
        }
        else
        {
            Toast.makeText(this,"User has not opted to save data",Toast.LENGTH_LONG).show();
        }
    }

    public void Read(View view)
    {
        SharedPreferences sharedpref= PreferenceManager.getDefaultSharedPreferences(this);
        String name=sharedpref.getString("username","NoData");
        String passkey=sharedpref.getString("password","NoKey");
        et1.setText(name);
        et2.setText(passkey);
    }

    public void Clear(View view)
    {
        SharedPreferences sharedpref= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor=sharedpref.edit();
        editor.clear();
    }
}
