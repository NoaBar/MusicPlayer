package com.noah.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Noa B on 07-Mar-18.
 */

public class DisneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Create an array of songs
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Two worlds", "Tarzan", "Phil Collins",
                R.drawable.tarzan));
        songs.add(new Song("I'll Make a Man out of you", "Mulan", "Donny Osmond",
                R.drawable.mulan));
        songs.add(new Song("He's a trump", "Lady and the Tramp", "Peggy Lee",
                R.drawable.lady_tramp));
        songs.add(new Song("Be prepared", "The Lion King", "Chiwetel Ejiofor",
                R.drawable.lion_king));
        songs.add(new Song("Colors of the wind", "Pocahontas", "Irene Bedard",
                R.drawable.pocahontas));
        songs.add(new Song("Not in nottingham", "Robin Hood", "Roger Miller",
                R.drawable.robin_hood));
        songs.add(new Song("When I see an elephant fly", "Dumbo", "Cliff Edwards, Hall Johnson Choir, Jim Carmichael",
                R.drawable.dumbo));
        songs.add(new Song("The Bells of Notre Dame", "The Hunchback of Notre Dame", "Paul Kandel",
                R.drawable.hunchback));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
