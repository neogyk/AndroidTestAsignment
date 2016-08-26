package com.example.ipodmokov.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

import android.content.res.Configuration;
public class MainActivity extends AppCompatActivity {
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.imageView1);
        image.setImageResource(R.drawable.logo);
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            image.setPivotX(image.getWidth()/2);
            image.setPivotY(image.getHeight() / 2);
            image.setRotation((float) 45.0);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            image.setPivotX(image.getWidth()/2);
            image.setPivotY(image.getHeight() / 2);
            image.setRotation(0);
        }
    }
}
