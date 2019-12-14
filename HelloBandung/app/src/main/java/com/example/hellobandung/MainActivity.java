package com.example.hellobandung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button btn1 = (Button) findViewById(R.id.btn1);

        // Set a click listener on that View
        btn1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);

                // Start the new activity
                startActivity(aboutIntent);
            }
        });
        Button btn2 = (Button) findViewById(R.id.btn2);

        // Set a click listener on that View
        btn2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent kulinerIntent = new Intent(MainActivity.this, KulinerActivity.class);

                // Start the new activity
                startActivity(kulinerIntent);
            }
        });
       Button btn3 = (Button) findViewById(R.id.btn3);

        // Set a click listener on that View
        btn3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent googlemapsapiIntent = new Intent(MainActivity.this, MapsActivity.class);

                // Start the new activity
                startActivity(googlemapsapiIntent);
            }
        });
        Button btn4 = (Button) findViewById(R.id.btn4);

        // Set a click listener on that View
        btn4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent wisataIntent = new Intent(MainActivity.this, WisataActivity.class);

                // Start the new activity
                startActivity(wisataIntent);
            }
        });

       Button btn5 = (Button) findViewById(R.id.btn5);

        // Set a click listener on that View
        btn5.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent bahasaIntent = new Intent(MainActivity.this, BahasaActivity.class);

                // Start the new activity
                startActivity(bahasaIntent);
            }
        });

        Button btn6 = (Button) findViewById(R.id.btn6);

        // Set a click listener on that View
        btn6.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent tanyaIntent = new Intent(MainActivity.this, TanyaActivity.class);

                // Start the new activity
                startActivity(tanyaIntent);
            }
        });

    }
}
