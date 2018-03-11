package com.noah.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Noa B on 07-Mar-18.
 */

public class SongAdapter extends ArrayAdapter<Song>{

    Activity activity;

    public SongAdapter (Activity activity, ArrayList<Song>songs){
        super(activity,0,songs);
        this.activity = activity;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listSongsView = convertView;
        if (listSongsView==null){
            listSongsView= LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item,parent,false);
        }

        final Song currentSong = getItem(position);

        TextView nameOfSong = (TextView) listSongsView.findViewById(R.id.name_song);
        nameOfSong.setText(currentSong.getNameOfSong());

        TextView album = (TextView) listSongsView.findViewById(R.id.album);
        album.setText(currentSong.getAlbum());

        TextView artist = (TextView) listSongsView.findViewById(R.id.artist);
        artist.setText(currentSong.getArtist());

        ImageView image = (ImageView) listSongsView.findViewById(R.id.image);
        image.setImageResource(currentSong.getImage());


        ImageButton info = (ImageButton) listSongsView.findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent songDetailsIntent = new Intent (activity, SongDetailsActivity.class);
                songDetailsIntent.putExtra("song",currentSong);
                activity.startActivity(songDetailsIntent);
            }
        });

        return listSongsView;
    }
}
