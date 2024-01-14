package com.example.sofepower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class Food extends AppCompatActivity {

    TextView txt;
    Button btn;
    LinearLayout foodLayout1, foodLayout2, foodLayout3, foodLayout4, foodLayout5, foodLayout6, foodLayout7, foodLayout8, foodLayout9, foodLayout10;

    String[] thaiFoodItems = {
            "Spicy Shrimp Soup",
            "Pad Thai",
            "Stir Fried Basil",
            "Papaya Salad",
            "Stir-Fried Beef with Yellow Curry Paste",
            "Khao Soi",
            "Panaeng Curry",
            "Khanom Jeen",
            "Hat Yai Styled Fried Chicken",
            "Fired Rice"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        setLinkMovementMethod(R.id.textviewtomyum);
        setLinkMovementMethod(R.id.textviewpadthai);
        setLinkMovementMethod(R.id.textviewkrapao);
        setLinkMovementMethod(R.id.textviewsomtum);
        setLinkMovementMethod(R.id.textviewkuaking);
        setLinkMovementMethod(R.id.textviewkhaosoi);
        setLinkMovementMethod(R.id.textviewpanange);
        setLinkMovementMethod(R.id.textviewkhanonjeen);
        setLinkMovementMethod(R.id.textviewfiredchicken);
        setLinkMovementMethod(R.id.textviewfriedrice);

        txt = findViewById(R.id.textview);
        btn = findViewById(R.id.button);

        foodLayout1 = findViewById(R.id.Food1);
        foodLayout2 = findViewById(R.id.Food2);
        foodLayout3 = findViewById(R.id.Food3);
        foodLayout4 = findViewById(R.id.Food4);
        foodLayout5 = findViewById(R.id.Food5);
        foodLayout6 = findViewById(R.id.Food6);
        foodLayout7 = findViewById(R.id.Food7);
        foodLayout8 = findViewById(R.id.Food8);
        foodLayout9 = findViewById(R.id.Food9);
        foodLayout10 = findViewById(R.id.Food10);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int index = random.nextInt(thaiFoodItems.length);
                String foodItem = thaiFoodItems[index];
                txt.setText(foodItem);
                switchToFoodLayout(foodItem);
            }
        });
    }

    private void hideAllFoodLayouts() {
        foodLayout1.setVisibility(View.GONE);
        foodLayout2.setVisibility(View.GONE);
        foodLayout3.setVisibility(View.GONE);
        foodLayout4.setVisibility(View.GONE);
        foodLayout5.setVisibility(View.GONE);
        foodLayout6.setVisibility(View.GONE);
        foodLayout7.setVisibility(View.GONE);
        foodLayout8.setVisibility(View.GONE);
        foodLayout9.setVisibility(View.GONE);
        foodLayout10.setVisibility(View.GONE);
    }

    private void switchToFoodLayout(String foodItem) {
        hideAllFoodLayouts();

        switch (foodItem) {
            case "Spicy Shrimp Soup":
                foodLayout1.setVisibility(View.VISIBLE);
                break;
            case "Pad Thai":
                foodLayout2.setVisibility(View.VISIBLE);
                break;
            case "Stir Fried Basil":
                foodLayout3.setVisibility(View.VISIBLE);
                break;
            case "Papaya Salad":
                foodLayout4.setVisibility(View.VISIBLE);
                break;
            case "Stir-Fried Beef with Yellow Curry Paste":
                foodLayout5.setVisibility(View.VISIBLE);
                break;
            case "Khao Soi":
                foodLayout6.setVisibility(View.VISIBLE);
                break;
            case "Panaeng Curry":
                foodLayout7.setVisibility(View.VISIBLE);
                break;
            case "Khanom Jeen":
                foodLayout8.setVisibility(View.VISIBLE);
                break;
            case "Hat Yai Styled Fried Chicken":
                foodLayout9.setVisibility(View.VISIBLE);
                break;
            case "Fired Rice":
                foodLayout10.setVisibility(View.VISIBLE);
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