package com.example.rpraczyk.kittenapp;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button kittenBut = findViewById(R.id.kitten_button);
        final ImageView kittenImg = findViewById(R.id.kitten_image);

        kittenBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kittenImg.setImageResource(R.drawable.scared_kitten);
            }
        });

    }
}
