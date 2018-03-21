package com.noah.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.noah.musicplayer.R.id.home_from_details;

public class SongDetailsActivity extends AppCompatActivity implements View.OnClickListener{


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

        Button home = (Button) findViewById(home_from_details);
        home.setOnClickListener(this);

        Button musicals = (Button) findViewById(R.id.musicals_from_details);
        musicals.setOnClickListener(this);

        Button disney = (Button) findViewById(R.id.disney_from_details);
        disney.setOnClickListener(this);


        Intent songDetailsIntent = getIntent();
        // Get the listview item click position
        song = (Song) songDetailsIntent.getSerializableExtra("song");

        // Locate the TextViews in activity_song_details.xml
        coverImage = (ImageView) findViewById(R.id.image);
        name = (TextView) findViewById(R.id.name_song);
        album = (TextView) findViewById(R.id.album);
        artist = (TextView) findViewById(R.id.artist);
        character = (TextView) findViewById(R.id.character);
        year = (TextView) findViewById(R.id.year);


        // Load the text into the TextViews followed by the song selected
        name.setText(song.getNameOfSong());
        album.setText(song.getAlbum());
        artist.setText(song.getArtist());
        character.setText(song.getCharacter());
        year.setText(song.getYear());
        coverImage.setImageResource(song.getImage());

    }

//Buttons to get to MainActivity/DisneyActivity/MusicalsActivity

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.home_from_details:
                Intent mainIntent = new Intent(SongDetailsActivity.this, MainActivity.class);
                SongDetailsActivity.this.startActivity(mainIntent);
                break;
            case R.id.musicals_from_details:
                Intent musicalsIntent = new Intent(SongDetailsActivity.this, MusicalsActivity.class);
                SongDetailsActivity.this.startActivity(musicalsIntent);
                break;
            case R.id.disney_from_details:
                Intent disneyIntent = new Intent(SongDetailsActivity.this, DisneyActivity.class);
                SongDetailsActivity.this.startActivity(disneyIntent);
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up button
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
