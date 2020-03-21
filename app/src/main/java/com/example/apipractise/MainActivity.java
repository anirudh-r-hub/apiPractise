package com.example.apipractise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);


    }
    public void gotoPage(View view)
    {
        Button b=(Button)view;

        if(b==b1)
        {
            Intent intent=new Intent(getApplicationContext(),recordAudio.class);
            startActivity(intent);
        }

        if(b==b2)
        {
            Intent intent=new Intent(getApplicationContext(),recordVideo.class);
            startActivity(intent);
        }
        if(b==b3)
        {
            Intent intent=new Intent(getApplicationContext(),MapsActivity.class);
            startActivity(intent);
        }


    }
}
