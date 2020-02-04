package com.example.firstbasicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Webview extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        wv=findViewById(R.id.wb1);
    }

    public void Search(View view)
    {
        wv.loadUrl("https://www.w3schools.com");
    }
}
