package com.example.sofepower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        TextView textView = findViewById(R.id.textviewtomyum);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewpadthai);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkrapao);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewsomtum);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkuaking);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkhaosoi);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewpanange);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkhanonjeen);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewfiredchicken);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewfriedrice );
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}