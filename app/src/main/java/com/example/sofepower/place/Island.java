package com.example.sofepower.place;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.sofepower.R;

public class Island extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_island);
        TextView textView = findViewById(R.id.textviewkohlarn);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkohphiphi);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkohtao);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkohsamui);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkohchang);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkohsimilan);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkohlanta);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkohlipe);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkohsamet);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkohkood);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}