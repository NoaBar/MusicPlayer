package com.noah.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongDetailsActivity extends AppCompatActivity {


    TextView name;
    TextView album;
    TextView artist;
    TextView character;
    TextView year;
    ImageView coverImage;
    Song song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);

        // Retrieve data from MainActivity on listview item click
        Intent songDetailsIntent = getIntent();
        // Get the listview item click position
        song = (Song) songDetailsIntent.getSerializableExtra("song");

        // Locate the TextViews in singleitemview.xml
        coverImage = (ImageView) findViewById(R.id.image);
        name = (TextView) findViewById(R.id.name_song);
        album = (TextView) findViewById(R.id.album);
        artist = (TextView) findViewById(R.id.artist);
        character = (TextView) findViewById(R.id.character);
        year = (TextView) findViewById(R.id.year);


        // Load the text into the TextViews followed by the position
        name.setText(song.getNameOfSong());
        album.setText(song.getAlbum());
        artist.setText(song.getArtist());
        character.setText(song.getCharacter());
        year.setText(song.getYear());
        coverImage.setImageResource(song.getImage());


    }
}
