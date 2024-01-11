package com.example.sofepower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sofepower.place.Island;
import com.example.sofepower.place.Mountain;
import com.example.sofepower.place.Temple;
import com.example.sofepower.place.Waterfall;

public class Place extends AppCompatActivity {

    private Button place1;
    private Button place2;
    private Button place3;
    private Button place4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        place1 = findViewById(R.id.place01);
        place2 = findViewById(R.id.place02);
        place3 = findViewById(R.id.place03);
        place4 = findViewById(R.id.place04);

        place1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Place.this, Temple.class);
                startActivity(intent);
            }
        });

        place2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Place.this, Island.class);
                startActivity(intent);
            }
        });

        place3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Place.this, Waterfall.class);
                startActivity(intent);
            }
        });

        place4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Place.this, Mountain.class);
                startActivity(intent);
            }
        });
    }
}