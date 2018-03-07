package com.noah.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;
/**
 * Created by Noa B on 07-Mar-18.
 */

public class MusicalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Create an array of songs
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("I have confidence", "Sounds of Music", "Julie Andrews",
                R.drawable.sound_of_music));
        songs.add(new Song("Santa Fe", "Rent", "Jesse L. Martin",
                R.drawable.rent));
        songs.add(new Song("The Wizard and I", "Wicked", "Idina Menzel",
                R.drawable.wicked));
        songs.add(new Song("No Good Deed", "Wicked", "Idina Menzel",
                R.drawable.wicked));
        songs.add(new Song("I Got Life", "Hair", "Treat Williams",
                R.drawable.hair));
        songs.add(new Song("Maria", "West Side Story", "Jimmy Bryant",
                R.drawable.west_side_story));
        songs.add(new Song("On My Own", "Les Miserables", "Samantha Barks",
                R.drawable.les_mis));
        songs.add(new Song("Cell Block Tango", "Chicago", "Cell Block Girls",
                R.drawable.chicago));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
