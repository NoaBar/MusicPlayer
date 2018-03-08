package com.noah.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView musicals = (TextView) findViewById(R.id.musicals);
        musicals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicalsIntent = new Intent(MainActivity.this, MusicalsActivity.class);
                startActivity(musicalsIntent);
            }
        });

        TextView disney = (TextView) findViewById(R.id.disney);
        disney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent disneyIntent = new Intent(MainActivity.this, DisneyActivity.class);
                startActivity(disneyIntent);
            }
        });
    }
}
