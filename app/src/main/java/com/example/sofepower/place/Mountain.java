package com.example.sofepower.place;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.sofepower.R;

public class Mountain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain);
        TextView textView = findViewById(R.id.textviewdoichang);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewdoiinthanon);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewdoilangkaluang);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewdoiluangchaing);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewdoiphahompok);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewdoiphukha);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewkhoaluang);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewmogoju);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewmonjong);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView = findViewById(R.id.textviewphusoidao);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}