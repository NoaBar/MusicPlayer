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
     * Name of character
     */
    private String mCharacter;

    /**
     * Year of production
     */
    private String mYear;


    /**
     * Constructor
     * Create a new Song object.
     * @param nameOfSong is the name of the song
     * @param album  is the name of album/movie/musical
     * @param artist  is the name of the artist
     * @param image is the image of the album
     * @param character is the Name of character
     * @param year is the Year of production
     */
    public Song(String nameOfSong, String album, String artist,
                int image, String character, String year){
        mNameOfSong= nameOfSong;
        mAlbum= album;
        mArtist= artist;
        mImage= image;
        mCharacter= character;
        mYear= year;
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

    public String getCharacter(){
        return mCharacter;
    }

    public String getYear(){
        return mYear;
    }
}
