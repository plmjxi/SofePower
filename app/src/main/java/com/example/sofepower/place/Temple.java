package com.example.sofepower.place;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.sofepower.R;

public class Temple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple);
        TextView textView = findViewById(R.id.textviewwatphrakaew);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewwatarun);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewwatpho);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewwatmaniwong);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewwatrongkhun);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewwatchaiwatthanaram);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewwatphrasi);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewwatphradoi);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewwatphukahothong);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewwatsothon);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}