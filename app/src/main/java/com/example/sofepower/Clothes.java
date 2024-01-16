package com.example.sofepower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class Clothes extends AppCompatActivity {

    TextView txt;
    Button btn;
    LinearLayout clothesLayout1, clothesLayout2, clothesLayout3, clothesLayout4, clothesLayout5, clothesLayout6, clothesLayout7, clothesLayout8, clothesLayout9;

    String[] thaiClothesItems = {
            "Thai Reun ton",
            "Thai Chitralada",
            "Thai Amarintra",
            "Thai Borom Phiman",
            "Thai Dusit",
            "Thai Chakri",
            "Thai Sivalai",
            "Thai Chakraphad",
            "Thai Prayurk",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);

        setLinkMovementMethod(R.id.textviewthaireunton);
        setLinkMovementMethod(R.id.textviewthaichitralada);
        setLinkMovementMethod(R.id.textviewthaiamarintra);
        setLinkMovementMethod(R.id.textviewthaiborom);
        setLinkMovementMethod(R.id.textviewthaidusit);
        setLinkMovementMethod(R.id.textviewthaichakri);
        setLinkMovementMethod(R.id.textviewthaisivalai);
        setLinkMovementMethod(R.id.textviewthaichakraphad);
        setLinkMovementMethod(R.id.textviewthaiprayurk);

        txt = findViewById(R.id.textview02);
        btn = findViewById(R.id.button02);

        clothesLayout1 = findViewById(R.id.clothes1);
        clothesLayout2 = findViewById(R.id.clothes2);
        clothesLayout3 = findViewById(R.id.clothes3);
        clothesLayout4 = findViewById(R.id.clothes4);
        clothesLayout5 = findViewById(R.id.clothes5);
        clothesLayout6 = findViewById(R.id.clothes6);
        clothesLayout7 = findViewById(R.id.clothes7);
        clothesLayout8 = findViewById(R.id.clothes8);
        clothesLayout9 = findViewById(R.id.clothes9);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Random random = new Random();
            int index = random.nextInt(thaiClothesItems.length);
            String clothesItem = thaiClothesItems[index];
            txt.setText(clothesItem);
            switchToClothesLayout(clothesItem);
        }
    });
}

    private void hideAllClothesLayout() {
        clothesLayout1.setVisibility(View.GONE);
        clothesLayout2.setVisibility(View.GONE);
        clothesLayout3.setVisibility(View.GONE);
        clothesLayout4.setVisibility(View.GONE);
        clothesLayout5.setVisibility(View.GONE);
        clothesLayout6.setVisibility(View.GONE);
        clothesLayout7.setVisibility(View.GONE);
        clothesLayout8.setVisibility(View.GONE);
        clothesLayout9.setVisibility(View.GONE);
    }

    private void switchToClothesLayout(String clothesItem) {
        hideAllClothesLayout();

        switch (clothesItem) {
            case "Thai Reun ton":
                clothesLayout1.setVisibility(View.VISIBLE);
                break;
            case "Thai Chitralada":
                clothesLayout2.setVisibility(View.VISIBLE);
                break;
            case "Thai Amarintra":
                clothesLayout3.setVisibility(View.VISIBLE);
                break;
            case "Thai Borom Phiman":
                clothesLayout4.setVisibility(View.VISIBLE);
                break;
            case "Thai Dusit":
                clothesLayout5.setVisibility(View.VISIBLE);
                break;
            case "Thai Chakri":
                clothesLayout6.setVisibility(View.VISIBLE);
                break;
            case "Thai Sivalai":
                clothesLayout7.setVisibility(View.VISIBLE);
                break;
            case "Thai Chakraphad":
                clothesLayout8.setVisibility(View.VISIBLE);
                break;
            case "Thai Prayurk":
                clothesLayout9.setVisibility(View.VISIBLE);
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
