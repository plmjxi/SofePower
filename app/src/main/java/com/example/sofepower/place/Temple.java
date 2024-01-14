package com.example.sofepower.place;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sofepower.R;

import java.util.Random;

public class Temple extends AppCompatActivity {

    TextView txt;
    Button btn;
    LinearLayout templeLayout1, templeLayout2, templeLayout3, templeLayout4, templeLayout5, templeLayout6, templeLayout7, templeLayout8, templeLayout9, templeLayout10;

    String[] thaiTempleItems = {
            "Emerald Buddha Temple",
            "the Temple of Dawn",
            "the Temple of the Reclining Buddha",
            "Wat Maniwong",
            "White Temple",
            "Wat Chaiwatthanaram",
            "Temple of the Holy, Splendid Omniscient",
            "Wat Phrathat Doi Suthep",
            "Temple of the Golden Mount Bangkok",
            "Temple of Dignity"
    };


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple);

        setLinkMovementMethod(R.id.textviewwatphrakaew);
        setLinkMovementMethod(R.id.textviewwatarun);
        setLinkMovementMethod(R.id.textviewwatpho);
        setLinkMovementMethod(R.id.textviewwatmaniwong);
        setLinkMovementMethod(R.id.textviewwatrongkhun);
        setLinkMovementMethod(R.id.textviewwatchaiwatthanaram);
        setLinkMovementMethod(R.id.textviewwatphrasi);
        setLinkMovementMethod(R.id.textviewwatphradoi);
        setLinkMovementMethod(R.id.textviewwatphukahothong);
        setLinkMovementMethod(R.id.textviewwatsothon);

        txt = findViewById(R.id.textview06);
        btn = findViewById(R.id.button06);

        templeLayout1 = findViewById(R.id.temple1);
        templeLayout2 = findViewById(R.id.temple2);
        templeLayout3 = findViewById(R.id.temple3);
        templeLayout4 = findViewById(R.id.temple4);
        templeLayout5 = findViewById(R.id.temple5);
        templeLayout6 = findViewById(R.id.temple6);
        templeLayout7 = findViewById(R.id.temple7);
        templeLayout8 = findViewById(R.id.temple8);
        templeLayout9 = findViewById(R.id.temple9);
        templeLayout10 = findViewById(R.id.temple10);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int index = random.nextInt(thaiTempleItems.length);
                String templeItem = thaiTempleItems[index];
                txt.setText(templeItem);
                switchToTempleLayout(templeItem);
            }
        });
    }
    private void hideAllTempleLayout() {
        templeLayout1.setVisibility(View.GONE);
        templeLayout2.setVisibility(View.GONE);
        templeLayout3.setVisibility(View.GONE);
        templeLayout4.setVisibility(View.GONE);
        templeLayout5.setVisibility(View.GONE);
        templeLayout6.setVisibility(View.GONE);
        templeLayout7.setVisibility(View.GONE);
        templeLayout8.setVisibility(View.GONE);
        templeLayout9.setVisibility(View.GONE);
        templeLayout10.setVisibility(View.GONE);
    }

    private void switchToTempleLayout(String templeItem) {
        hideAllTempleLayout();

        switch (templeItem) {
            case "Emerald Buddha Temple":
                templeLayout1.setVisibility(View.VISIBLE);
                break;
            case "the Temple of Dawn":
                templeLayout2.setVisibility(View.VISIBLE);
                break;
            case "the Temple of the Reclining Buddha":
                templeLayout3.setVisibility(View.VISIBLE);
                break;
            case "Wat Maniwong":
                templeLayout4.setVisibility(View.VISIBLE);
                break;
            case "White Temple":
                templeLayout5.setVisibility(View.VISIBLE);
                break;
            case "Wat Chaiwatthanaram":
                templeLayout6.setVisibility(View.VISIBLE);
                break;
            case "Temple of the Holy, Splendid Omniscient":
                templeLayout7.setVisibility(View.VISIBLE);
                break;
            case "Wat Phrathat Doi Suthep":
                templeLayout8.setVisibility(View.VISIBLE);
                break;
            case "Temple of the Golden Mount Bangkok":
                templeLayout9.setVisibility(View.VISIBLE);
                break;
            case "Temple of Dignity":
                templeLayout10.setVisibility(View.VISIBLE);
                break;
            default:
                break;
        }
    }

    private void setLinkMovementMethod(int textViewResourceId) {
        TextView textView = findViewById(textViewResourceId);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
