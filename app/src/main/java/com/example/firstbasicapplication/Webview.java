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
       wv.loadUrl("https://www.pluralsight.com/");
        //wv.loadUrl("file:///android_asset/Hot Cocoa Recipe.html");
        String data="<html><body><h1>This is my first Webpage</h1></body></html>";
        // wv.loadData(data,"text/html","UTF-8");
    }
}
