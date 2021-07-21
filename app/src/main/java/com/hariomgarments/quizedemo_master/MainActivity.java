package com.hariomgarments.quizedemo_master;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView play = findViewById(R.id.cardview1);
        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, PlayActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });

        CardView howTo = findViewById(R.id.cardview2);
        // Set a click listener on that View
        howTo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent howToIntent = new Intent(MainActivity.this, HowTo.class);
                // Start the new activity
                startActivity(howToIntent);
            }
        });
    }
}