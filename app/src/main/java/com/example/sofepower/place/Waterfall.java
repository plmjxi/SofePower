package com.example.sofepower.place;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sofepower.R;

import java.util.Random;

public class Waterfall extends AppCompatActivity {

    TextView txt;
    Button btn;
    LinearLayout waterfallLayout1, waterfallLayout2, waterfallLayout3, waterfallLayout4, waterfallLayout5, waterfallLayout6, waterfallLayout7, waterfallLayout8, waterfallLayout9, waterfallLayout10;

    String[] thaiWaterfallItems = {
            "Thi Lo Su Waterfall",
            "Mae Ya Waterfall",
            "Huay Mae Khamin Waterfall",
            "Erawan Waterfall",
            "Pha Tad Waterfall",
            "Krung Ching Waterfall",
            "Koh Luang Waterfall",
            "Man Daeng Waterfall",
            "Tad Ton Waterfall",
            "Haew Narok Waterfall"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterfall);

        setLinkMovementMethod(R.id.textviewerawan);
        setLinkMovementMethod(R.id.textviewhaewnarok);
        setLinkMovementMethod(R.id.textviewhuaymae);
        setLinkMovementMethod(R.id.textviewkohluang);
        setLinkMovementMethod(R.id.textviewkrungching);
        setLinkMovementMethod(R.id.textviewmandaeng);
        setLinkMovementMethod(R.id.textviewmeaya);
        setLinkMovementMethod(R.id.textviewphatad);
        setLinkMovementMethod(R.id.textviewtadton);
        setLinkMovementMethod(R.id.textviewthilosu);

        txt = findViewById(R.id.textview04);
        btn = findViewById(R.id.button04);

        waterfallLayout1 = findViewById(R.id.waterfall1);
        waterfallLayout2 = findViewById(R.id.waterfall2);
        waterfallLayout3 = findViewById(R.id.waterfall3);
        waterfallLayout4 = findViewById(R.id.waterfall4);
        waterfallLayout5 = findViewById(R.id.waterfall5);
        waterfallLayout6 = findViewById(R.id.waterfall6);
        waterfallLayout7 = findViewById(R.id.waterfall7);
        waterfallLayout8 = findViewById(R.id.waterfall8);
        waterfallLayout9 = findViewById(R.id.waterfall9);
        waterfallLayout10 = findViewById(R.id.waterfall10);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int index = random.nextInt(thaiWaterfallItems.length);
                String waterfallItem = thaiWaterfallItems[index];
                txt.setText(waterfallItem);
                switchToWaterfallLayout(waterfallItem);
            }
        });
    }

    private void hideAllWaterfallLayout() {
        waterfallLayout1.setVisibility(View.GONE);
        waterfallLayout2.setVisibility(View.GONE);
        waterfallLayout3.setVisibility(View.GONE);
        waterfallLayout4.setVisibility(View.GONE);
        waterfallLayout5.setVisibility(View.GONE);
        waterfallLayout6.setVisibility(View.GONE);
        waterfallLayout7.setVisibility(View.GONE);
        waterfallLayout8.setVisibility(View.GONE);
        waterfallLayout9.setVisibility(View.GONE);
        waterfallLayout10.setVisibility(View.GONE);
    }

    private void switchToWaterfallLayout(String waterfallItem) {
        hideAllWaterfallLayout();

        switch (waterfallItem) {
            case "Thi Lo Su Waterfall":
                waterfallLayout1.setVisibility(View.VISIBLE);
                break;
            case "Mae Ya Waterfall":
                waterfallLayout2.setVisibility(View.VISIBLE);
                break;
            case "Huay Mae Khamin Waterfall":
                waterfallLayout3.setVisibility(View.VISIBLE);
                break;
            case "Erawan Waterfall":
                waterfallLayout4.setVisibility(View.VISIBLE);
                break;
            case "Pha Tad Waterfall":
                waterfallLayout5.setVisibility(View.VISIBLE);
                break;
            case "Krung Ching Waterfall":
                waterfallLayout6.setVisibility(View.VISIBLE);
                break;
            case "Koh Luang Waterfall":
                waterfallLayout7.setVisibility(View.VISIBLE);
                break;
            case "Man Daeng Waterfall":
                waterfallLayout8.setVisibility(View.VISIBLE);
                break;
            case "Tad Ton Waterfall":
                waterfallLayout9.setVisibility(View.VISIBLE);
                break;
            case "Haew Narok Waterfall":
                waterfallLayout10.setVisibility(View.VISIBLE);
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
