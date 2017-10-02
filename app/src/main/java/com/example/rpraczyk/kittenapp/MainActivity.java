package com.example.rpraczyk.kittenapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    final int SCARED_KITTEN_ID = R.drawable.scared_kitten;
    final int LOVELY_KITTEN_ID = R.drawable.lovely_kitten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button kittenButt = findViewById(R.id.kitten_button);
        final ImageView kittenImg = findViewById(R.id.kitten_image);


        kittenButt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (kittenImg.getDrawable().getConstantState() == ContextCompat.getDrawable(getBaseContext(), LOVELY_KITTEN_ID).getConstantState()) {
                    kittenImg.setImageResource(SCARED_KITTEN_ID);
                    kittenButt.setText(R.string.kitten_button_calm_down);
                } else {
                    kittenImg.setImageResource(LOVELY_KITTEN_ID);
                    kittenButt.setText(R.string.kitten_button_text);
                }
            }
        });

        kittenImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Dlaczego lepiej MainActivity.this niz getApplicationContext.
                Intent intent = new Intent(MainActivity.this, LifeCycleActivity.class);
                //intent.putExtra();
                startActivity(intent);
            }
        });

    }
}
