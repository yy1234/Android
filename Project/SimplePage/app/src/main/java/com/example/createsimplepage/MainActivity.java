package com.example.createsimplepage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Printer;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    int[] images = new int[] {
            R.drawable.java,
            R.drawable.swift,
    };
    int currentImg = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout main = (LinearLayout)findViewById(R.id.root);
        final ImageView imageView = new ImageView(this);
        main.addView(imageView);
        imageView.setImageResource(images[0]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(images[++currentImg % images.length]);
            }
        });
    }


}



