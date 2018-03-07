package com.noah.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by Noa B on 07-Mar-18.
 */

public class MusicalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Create an array of words
        ArrayList<Word> songs = new ArrayList<Word>();
        songs.add(new Word("Red", "weṭeṭṭi"));
        songs.add(new Word("Green", "chokokki"));
        songs.add(new Word("Brown", "ṭakaakki"));
        songs.add(new Word("Gray", "ṭopoppi"));
        songs.add(new Word("Black", "kululli"));
        songs.add(new Word("White", "kelelli"));
        songs.add(new Word("dusty yellow", "ṭopiisә"));
        songs.add(new Word("mustard yellow", "chiwiiṭә"));
}
