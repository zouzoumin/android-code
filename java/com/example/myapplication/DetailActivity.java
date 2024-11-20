package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.media.MediaPlayer;
import java.util.Arrays;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView titleView;
    private TextView artistView;
    private Button playPauseButton;
    private RecyclerView lyricsRecyclerView;
    private MediaPlayer mediaPlayer;
    private boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.imageViewDetail);
        titleView = findViewById(R.id.titleViewDetail);
        artistView = findViewById(R.id.artistViewDetail);
        playPauseButton = findViewById(R.id.playPauseButton);
        lyricsRecyclerView = findViewById(R.id.lyricsRecyclerView);

        // Get the music item from intent
        Music music = (Music) getIntent().getSerializableExtra("music");
        if (music != null) {
            imageView.setImageResource(music.getImageResource());
            titleView.setText(music.getTitle());
            artistView.setText(music.getArtist());

            // Split lyrics into lines and set up the RecyclerView
            List<String> lyricsLines = Arrays.asList(music.getLyrics().split("\n"));
            LyricsAdapter adapter = new LyricsAdapter(lyricsLines);
            lyricsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            lyricsRecyclerView.setAdapter(adapter);

            // Initialize the MediaPlayer with the audio resource
            mediaPlayer = MediaPlayer.create(this, music.getAudioResource());
        }

        // Set up play/pause button click listener
        playPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying) {
                    pauseMusic();
                } else {
                    playMusic();
                }
                isPlaying = !isPlaying;
            }
        });
    }

    private void playMusic() {
        if (mediaPlayer != null) {
            mediaPlayer.start();
            playPauseButton.setText("Pause");
        }
    }

    private void pauseMusic() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            playPauseButton.setText("Play");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
