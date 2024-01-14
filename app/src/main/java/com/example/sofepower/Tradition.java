package com.example.sofepower;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class Tradition extends AppCompatActivity {

    TextView txt;
    Button btn;
    LinearLayout traditionLayout1, traditionLayout2, traditionLayout3, traditionLayout4, traditionLayout5, traditionLayout6, traditionLayout7, traditionLayout8, traditionLayout9, traditionLayout10;

    String[] thaiTraditionItems = {
            "Phi Ta Khon",
            "Yi Peng",
            "The Candle Festival",
            "Hae Nang Meaw",
            "Buffalo Running",
            "Loi Krathong",
            "Bun Bang Fai",
            "Songkran",
            "Buddhist Lent Day",
            "End of Buddhist Lent"
    };

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tradition);

        setLinkMovementMethod(R.id.textviewbangfai);
        setLinkMovementMethod(R.id.textviewbuffalo);
        setLinkMovementMethod(R.id.textviewheanang);
        setLinkMovementMethod(R.id.textviewheatein);
        setLinkMovementMethod(R.id.textviewkoapansa);
        setLinkMovementMethod(R.id.textviewkrathong);
        setLinkMovementMethod(R.id.textviewphitakhon);
        setLinkMovementMethod(R.id.textviewsongkran);
        setLinkMovementMethod(R.id.textviewyipeng);
        setLinkMovementMethod(R.id.textviewaokpansa);

        txt = findViewById(R.id.textview01);
        btn = findViewById(R.id.button01);

        traditionLayout1 = findViewById(R.id.Tradition1);
        traditionLayout2 = findViewById(R.id.Tradition2);
        traditionLayout3 = findViewById(R.id.Tradition3);
        traditionLayout4 = findViewById(R.id.Tradition4);
        traditionLayout5 = findViewById(R.id.Tradition5);
        traditionLayout6 = findViewById(R.id.Tradition6);
        traditionLayout7 = findViewById(R.id.Tradition7);
        traditionLayout8 = findViewById(R.id.Tradition8);
        traditionLayout9 = findViewById(R.id.Tradition9);
        traditionLayout10 = findViewById(R.id.Tradition10);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int index = random.nextInt(thaiTraditionItems.length);
                String traditionItem = thaiTraditionItems[index];
                txt.setText(traditionItem);
                switchToTraditionLayout(traditionItem);
            }
        });
    }

    private void hideAllTraditionLayout() {
        traditionLayout1.setVisibility(View.GONE);
        traditionLayout2.setVisibility(View.GONE);
        traditionLayout3.setVisibility(View.GONE);
        traditionLayout4.setVisibility(View.GONE);
        traditionLayout5.setVisibility(View.GONE);
        traditionLayout6.setVisibility(View.GONE);
        traditionLayout7.setVisibility(View.GONE);
        traditionLayout8.setVisibility(View.GONE);
        traditionLayout9.setVisibility(View.GONE);
        traditionLayout10.setVisibility(View.GONE);
    }

    private void switchToTraditionLayout(String traditionItem) {
        hideAllTraditionLayout();

        switch (traditionItem) {
            case "Phi Ta Khon":
                traditionLayout1.setVisibility(View.VISIBLE);
                break;
            case "Yi Peng":
                traditionLayout2.setVisibility(View.VISIBLE);
                break;
            case "The Candle Festival":
                traditionLayout3.setVisibility(View.VISIBLE);
                break;
            case "Hae Nang Meaw":
                traditionLayout4.setVisibility(View.VISIBLE);
                break;
            case "Buffalo Running":
                traditionLayout5.setVisibility(View.VISIBLE);
                break;
            case "Loi Krathong":
                traditionLayout6.setVisibility(View.VISIBLE);
                break;
            case "Bun Bang Fai":
                traditionLayout7.setVisibility(View.VISIBLE);
                break;
            case "Songkran":
                traditionLayout8.setVisibility(View.VISIBLE);
                break;
            case "Buddhist Lent Day":
                traditionLayout9.setVisibility(View.VISIBLE);
                break;
            case "End of Buddhist Lent":
                traditionLayout10.setVisibility(View.VISIBLE);
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