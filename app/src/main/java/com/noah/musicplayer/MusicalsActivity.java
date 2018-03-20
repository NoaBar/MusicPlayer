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
        songs.add(new Song("I have confidence", "The Sound of Music (movie)", "Julie Andrews",
                R.drawable.sound_of_music, "Maria","1965"));
        songs.add(new Song("Santa Fe", "Rent (movie)", "Jesse L. Martin",
                R.drawable.rent, "Tom Collins","2005"));
        songs.add(new Song("The Wizard and I", "Wicked", "Idina Menzel",
                R.drawable.wicked, "Elphaba","2003"));
        songs.add(new Song("No Good Deed", "Wicked", "Idina Menzel",
                R.drawable.wicked, "Elphaba","2003"));
        songs.add(new Song("I Got Life", "Hair (movie)", "Treat Williams",
                R.drawable.hair, "George Berger","1979"));
        songs.add(new Song("Maria", "West Side Story (movie)", "Jimmy Bryant",
                R.drawable.west_side_story, "Tony Wyzek","1961"));
        songs.add(new Song("On My Own", "Les Miserables (The 25th Anniversary)", "Samantha Barks",
                R.drawable.les_mis, "Éponine","2010"));
        songs.add(new Song("Cell Block Tango", "Chicago (movie)", "Catherine Zeta-Jones and more.",
                R.drawable.chicago, "Cell Block Girls","2002"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
