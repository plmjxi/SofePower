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

public class Island extends AppCompatActivity {

    TextView txt;
    Button btn;
    LinearLayout islandLayout1, islandLayout2, islandLayout3, islandLayout4, islandLayout5, islandLayout6, islandLayout7, islandLayout8, islandLayout9, islandLayout10;

    String[] thaiIslandItems = {
            "Koh Larn",
            "Koh Phi Phi",
            "Koh Tao",
            "Koh Samui",
            "Koh Chang",
            "Koh Similan",
            "Koh Lanta",
            "Koh Lepi",
            "Koh Samet",
            "Koh Kood"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_island);

        setLinkMovementMethod(R.id.textviewkohlarn);
        setLinkMovementMethod(R.id.textviewkohphiphi);
        setLinkMovementMethod(R.id.textviewkohtao);
        setLinkMovementMethod(R.id.textviewkohsamui);
        setLinkMovementMethod(R.id.textviewkohchang);
        setLinkMovementMethod(R.id.textviewkohsimilan);
        setLinkMovementMethod(R.id.textviewkohlanta);
        setLinkMovementMethod(R.id.textviewkohlipe);
        setLinkMovementMethod(R.id.textviewkohsamet);
        setLinkMovementMethod(R.id.textviewkohkood);

        txt = findViewById(R.id.textview03);
        btn = findViewById(R.id.button03);

        islandLayout1 = findViewById(R.id.island1);
        islandLayout2 = findViewById(R.id.island2);
        islandLayout3 = findViewById(R.id.island3);
        islandLayout4 = findViewById(R.id.island4);
        islandLayout5 = findViewById(R.id.island5);
        islandLayout6 = findViewById(R.id.island6);
        islandLayout7 = findViewById(R.id.island7);
        islandLayout8 = findViewById(R.id.island8);
        islandLayout9 = findViewById(R.id.island9);
        islandLayout10 = findViewById(R.id.island10);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int index = random.nextInt(thaiIslandItems.length);
                String islandItem = thaiIslandItems[index];
                txt.setText(islandItem);
                switchToIslandLayout(islandItem);
            }
        });
    }
    private void hideAllIslandLayout() {
        islandLayout1.setVisibility(View.GONE);
        islandLayout2.setVisibility(View.GONE);
        islandLayout3.setVisibility(View.GONE);
        islandLayout4.setVisibility(View.GONE);
        islandLayout5.setVisibility(View.GONE);
        islandLayout6.setVisibility(View.GONE);
        islandLayout7.setVisibility(View.GONE);
        islandLayout8.setVisibility(View.GONE);
        islandLayout9.setVisibility(View.GONE);
        islandLayout10.setVisibility(View.GONE);
    }

    private void switchToIslandLayout(String islandItem) {
        hideAllIslandLayout();

        switch (islandItem) {
            case "Koh Larn":
                islandLayout1.setVisibility(View.VISIBLE);
                break;
            case "Koh Phi Phi":
                islandLayout2.setVisibility(View.VISIBLE);
                break;
            case "Koh Tao":
                islandLayout3.setVisibility(View.VISIBLE);
                break;
            case "Koh Samui":
                islandLayout4.setVisibility(View.VISIBLE);
                break;
            case "Koh Chang":
                islandLayout5.setVisibility(View.VISIBLE);
                break;
            case "Koh Similan":
                islandLayout6.setVisibility(View.VISIBLE);
                break;
            case "Koh Lanta":
                islandLayout7.setVisibility(View.VISIBLE);
                break;
            case "Koh Lepi":
                islandLayout8.setVisibility(View.VISIBLE);
                break;
            case "Koh Samet":
                islandLayout9.setVisibility(View.VISIBLE);
                break;
            case "Koh Kood":
                islandLayout10.setVisibility(View.VISIBLE);
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

