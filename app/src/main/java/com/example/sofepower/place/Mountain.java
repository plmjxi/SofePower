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

public class Mountain extends AppCompatActivity {

    TextView txt;
    Button btn;
    LinearLayout mountainLayout1, mountainLayout2, mountainLayout3, mountainLayout4, mountainLayout5, mountainLayout6, mountainLayout7, mountainLayout8, mountainLayout9, mountainLayout10;

    String[] thaiMountainItems = {
            "Doi Inthanon",
            "Doi Pha Hom Pok",
            "Doi Luang Chiang Dao",
            "Phu Soi Dao",
            "Doi Langka Luang",
            "Doi Phu Kha",
            "Doi Chang",
            "Mogoju Mountain",
            "Doi Mon Jong",
            "Khao Luang National Park"
    };

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain);

        setLinkMovementMethod(R.id.textviewdoichang);
        setLinkMovementMethod(R.id.textviewdoiinthanon);
        setLinkMovementMethod(R.id.textviewdoilangkaluang);
        setLinkMovementMethod(R.id.textviewdoiluangchaing);
        setLinkMovementMethod(R.id.textviewdoiphahompok);
        setLinkMovementMethod(R.id.textviewdoiphukha);
        setLinkMovementMethod(R.id.textviewkhoaluang);
        setLinkMovementMethod(R.id.textviewmogoju);
        setLinkMovementMethod(R.id.textviewmonjong);
        setLinkMovementMethod(R.id.textviewphusoidao);

        txt = findViewById(R.id.textview05);
        btn = findViewById(R.id.button05);

        mountainLayout1 = findViewById(R.id.mountain1);
        mountainLayout2 = findViewById(R.id.mountain2);
        mountainLayout3 = findViewById(R.id.mountain3);
        mountainLayout4 = findViewById(R.id.mountain4);
        mountainLayout5 = findViewById(R.id.mountain5);
        mountainLayout6 = findViewById(R.id.mountain6);
        mountainLayout7 = findViewById(R.id.mountain7);
        mountainLayout8 = findViewById(R.id.mountain8);
        mountainLayout9 = findViewById(R.id.mountain9);
        mountainLayout10 = findViewById(R.id.mountain10);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int index = random.nextInt(thaiMountainItems.length);
                String mountainItem = thaiMountainItems[index];
                txt.setText(mountainItem);
                switchToMountainLayout(mountainItem);
            }
        });
    }
    private void hideAllMountainLayout() {
        mountainLayout1.setVisibility(View.GONE);
        mountainLayout2.setVisibility(View.GONE);
        mountainLayout3.setVisibility(View.GONE);
        mountainLayout4.setVisibility(View.GONE);
        mountainLayout5.setVisibility(View.GONE);
        mountainLayout6.setVisibility(View.GONE);
        mountainLayout7.setVisibility(View.GONE);
        mountainLayout8.setVisibility(View.GONE);
        mountainLayout9.setVisibility(View.GONE);
        mountainLayout10.setVisibility(View.GONE);
    }

    private void switchToMountainLayout(String mountainItem) {
        hideAllMountainLayout();

        switch (mountainItem) {
            case "Doi Inthanon":
                mountainLayout1.setVisibility(View.VISIBLE);
                break;
            case "Doi Pha Hom Pok":
                mountainLayout2.setVisibility(View.VISIBLE);
                break;
            case "Doi Luang Chiang Dao":
                mountainLayout3.setVisibility(View.VISIBLE);
                break;
            case "Phu Soi Dao":
                mountainLayout4.setVisibility(View.VISIBLE);
                break;
            case "Doi Langka Luang":
                mountainLayout5.setVisibility(View.VISIBLE);
                break;
            case "Doi Phu Kha":
                mountainLayout6.setVisibility(View.VISIBLE);
                break;
            case "Doi Chang":
                mountainLayout7.setVisibility(View.VISIBLE);
                break;
            case "Mogoju Mountain":
                mountainLayout8.setVisibility(View.VISIBLE);
                break;
            case "Doi Mon Jong":
                mountainLayout9.setVisibility(View.VISIBLE);
                break;
            case "Khao Luang National Park":
                mountainLayout10.setVisibility(View.VISIBLE);
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
