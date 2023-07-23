package com.example.jupviecpj.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jupviecpj.Activty.VideoFullScreenActivity;
import com.example.jupviecpj.Class.Video;
import com.example.jupviecpj.R;


import java.util.ArrayList;

public class VidYoutubeAdapter extends RecyclerView.Adapter<VidYoutubeAdapter.VideoViewAdapter> {
    ArrayList<Video> videos;
    Context context;



    public class VideoViewAdapter extends RecyclerView.ViewHolder {
        WebView mWebView;
        Button mbtnFullScreen;

        TextView mtvTitleVideo;
        public VideoViewAdapter(@NonNull View itemView) {
            super(itemView);
            mWebView = itemView.findViewById(R.id.video_view);
            mbtnFullScreen = itemView.findViewById(R.id.btnfullscreen);
            mtvTitleVideo = itemView.findViewById(R.id.tvTitleVideo);
            mWebView.setWebViewClient(new WebViewClient());
            mWebView.setWebChromeClient(new WebChromeClient());
            mWebView.getSettings().setJavaScriptEnabled(true);

        }
    }


    public VidYoutubeAdapter(ArrayList<Video> videos, Context context) {
        this.videos = videos;
        this.context = context;
    }

    @NonNull
    @Override
    public VideoViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_video_home,parent,false);
        return new VideoViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewAdapter holder, int position) {

        Video video = videos.get(position);
        holder.mWebView.loadUrl(video.getLink());
        holder.mtvTitleVideo.setText(video.getTitle());
        holder.mbtnFullScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, VideoFullScreenActivity.class);
                i.putExtra("link", video.getLink());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return videos.size();
    }
}
