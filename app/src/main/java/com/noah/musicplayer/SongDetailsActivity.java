package com.noah.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Noa B on 08-Mar-18.
 */


public class SongDetailsActivity extends AppCompatActivity {

    Song song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.song_details);

        song = (Song) getIntent().getSerializableExtra("song");
    }
}