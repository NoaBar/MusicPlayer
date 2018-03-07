package com.noah.musicplayer;

import android.graphics.drawable.Drawable;

/**
 * Created by Noa B on 07-Mar-18.
 */

public class Song {
    /**
     * Name of the song
     */
    private String mNameOfSong;

    /**
     * Name of album/movie/musical
     */
    private String mAlbum;

    /**
     * Name of artist
     */
    private String mArtist;

    /**
     * Drawable resource ID
   */
    private int mImage;

    /**
     * Constructor
     * Create a new Song object.
     * @param nameOfSong is the name of the song
     * @param album  is the name of album/movie/musical
     * @param artist  is the name of the artist
     * @param image is the image of the album
     */
    public Song(String nameOfSong, String album, String artist, int image){
        mNameOfSong= nameOfSong;
        mAlbum= album;
        mArtist= artist;
        mImage= image;

    }

    /**Getters
     */

    public String getNameOfSong(){
        return mNameOfSong;
    }

    public String getAlbum(){
        return mAlbum;
    }

    public String getArtist(){
        return mArtist;
    }

    public int getImage(){ return mImage;}
}
