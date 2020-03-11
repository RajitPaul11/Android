package com.example.firstbasicapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MediaPlayerActivity extends AppCompatActivity {


    ListView lv1;
    MediaPlayer mp;
    String[] songs={"Track1","Track2","Track3"};
    int ID[]={R.raw.sameoldsonganddance,R.raw.seasonofwither,R.raw.pandorasbox};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);
        lv1=findViewById(R.id.lv1);
        mp = new MediaPlayer();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,songs);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                playsong(position);
            }
        });
    }
    public void playsong(int songIndex)
    {
        mp.reset();
        mp=MediaPlayer.create(this,ID[songIndex]);
        mp.start();
    }

    public void onDestroy()
    {
        super.onDestroy();
        mp.release();
    }
}
