// LyricsAdapter.java
package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LyricsAdapter extends RecyclerView.Adapter<LyricsAdapter.LyricsViewHolder> {

    private List<String> lyricsLines;

    public LyricsAdapter(List<String> lyricsLines) {
        this.lyricsLines = lyricsLines;
    }

    @NonNull
    @Override
    public LyricsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lyric, parent, false);
        return new LyricsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LyricsViewHolder holder, int position) {
        holder.lyricsTextView.setText(lyricsLines.get(position));
    }

    @Override
    public int getItemCount() {
        return lyricsLines.size();
    }

    static class LyricsViewHolder extends RecyclerView.ViewHolder {
        TextView lyricsTextView;

        LyricsViewHolder(View itemView) {
            super(itemView);
            lyricsTextView = itemView.findViewById(R.id.lyricsTextView);
        }
    }
}
