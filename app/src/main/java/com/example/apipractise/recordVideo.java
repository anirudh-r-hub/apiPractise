package com.example.apipractise;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class recordVideo extends AppCompatActivity {
    private static int video_request=101;
    private Uri videoUri=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_video);
    }

    public void captureVideo(View view)
    {
        Intent videoIntent=new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        if(videoIntent.resolveActivity(getPackageManager())!=null)
        {
            startActivityForResult(videoIntent,video_request);

        }



    }

    public void playVideo(View view) {
        Intent playIntent=new Intent(this,VideoPlayActivity.class);
        playIntent.putExtra("videoUri",videoUri.toString());
        startActivity(playIntent);



    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if(requestCode==video_request && resultCode==RESULT_OK)
        {
            videoUri=data.getData();
        }
    }
}
