package com.example.imageview;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageViewActivity extends AppCompatActivity {
    int[] images = new int[] {
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4
    };
    int currentImage = 2;
    private int alpha = 255;



    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        final Button plus = (Button) findViewById(R.id.plus);
        final Button minus = (Button) findViewById(R.id.minus);
        final ImageView image1 = (ImageView) findViewById(R.id.image1);
        final ImageView image2 = (ImageView) findViewById(R.id.image2);
        final Button next = (Button) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image1.setImageResource(images[++currentImage % images.length]);
            }
        });

        View.OnClickListener listener = new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if (v == plus)
                {
                    alpha += 20;
                }
                if (v == minus)
                {
                    alpha -= 20;
                }
                if (alpha >= 255)
                {
                    alpha = 255;
                }
                if (alpha <= 0)
                {
                    alpha = 0;
                }
                image1.setImageAlpha(alpha);
            }
        };

        plus.setOnClickListener(listener);
        minus.setOnClickListener(listener);
        image1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) image1.getDrawable();
                Bitmap bitmap = bitmapDrawable.getBitmap();

                return false;
            }
        });
    }
}
