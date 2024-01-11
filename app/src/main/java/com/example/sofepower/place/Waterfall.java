package com.example.sofepower.place;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.sofepower.R;

public class Waterfall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterfall);
        TextView textView = findViewById(R.id.textviewerawan);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewhaewnarok);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewhuaymae);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkohluang);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkrungching);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewmandaeng);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewmeaya);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewphatad);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewtadton);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewthilosu);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}