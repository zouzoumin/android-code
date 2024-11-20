package com.example.myapplication;

import java.io.Serializable;

public class Music implements Serializable {
    private String title;
    private String artist;
    private int imageResource;
    private int audioResource;
    private String lyrics;

    public Music(String title, String artist, int imageResource, int audioResource, String lyrics) {
        this.title = title;
        this.artist = artist;
        this.imageResource = imageResource;
        this.audioResource = audioResource;
        this.lyrics = lyrics;
    }

    public String getLyrics() {
        return lyrics;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getAudioResource() {
        return audioResource;
    }
}



