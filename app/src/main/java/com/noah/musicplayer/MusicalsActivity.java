package com.noah.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.AdapterView.OnItemClickListener;
/**
 * Created by Noa B on 07-Mar-18.
 */

public class MusicalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Create an array of songs
        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("I have confidence", "Sounds of Music", "Julie Andrews",
                R.drawable.sound_of_music, "character","1999"));
        songs.add(new Song("Santa Fe", "Rent", "Jesse L. Martin",
                R.drawable.rent, "character","1999"));
        songs.add(new Song("The Wizard and I", "Wicked", "Idina Menzel",
                R.drawable.wicked, "character","1999"));
        songs.add(new Song("No Good Deed", "Wicked", "Idina Menzel",
                R.drawable.wicked, "character","1999"));
        songs.add(new Song("I Got Life", "Hair", "Treat Williams",
                R.drawable.hair, "character","1999"));
        songs.add(new Song("Maria", "West Side Story", "Jimmy Bryant",
                R.drawable.west_side_story, "character","1999"));
        songs.add(new Song("On My Own", "Les Miserables", "Samantha Barks",
                R.drawable.les_mis, "character","1999"));
        songs.add(new Song("Cell Block Tango", "Chicago", "Cell Block Girls",
                R.drawable.chicago, "character","1999"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
