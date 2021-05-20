package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GameActivity extends AppCompatActivity {
    private ImageView gamePlayImageView;
    private ImageView gameBackImageView;
    private static final int HEADS_COIN = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        findIds();

        Bundle dice = getIntent().getExtras();
        int randomNumber = dice.getInt(Constants.NUMBER);

        if (randomNumber == HEADS_COIN) {
            gamePlayImageView.setImageResource(R.drawable.moeda_cara);
        } else {
            gamePlayImageView.setImageResource((R.drawable.moeda_coroa));
        }

        gameBackImageView.setOnClickListener(v -> finish());
    }

    private void findIds() {
        gamePlayImageView = findViewById(R.id.gamePlayImageView);
        gameBackImageView = findViewById(R.id.gameBackImageView);
    }

}