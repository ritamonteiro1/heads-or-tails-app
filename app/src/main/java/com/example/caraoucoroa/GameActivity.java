package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class GameActivity extends AppCompatActivity {
    private ImageView gamePlayImageView;
    private ImageButton gameBackImageButton;
    private static final int HEADS_COIN = 0;
    private static final int DEFAULT_RANDOM_NUMBER = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        findViewsById();
        int randomNumber = getIntent().getIntExtra(Constants.NUMBER, DEFAULT_RANDOM_NUMBER);

        if (randomNumber == HEADS_COIN) {
            gamePlayImageView.setImageResource(R.drawable.img_heads_coin);
        } else {
            gamePlayImageView.setImageResource((R.drawable.img_tails_coin));
        }
        gameBackImageButton.setOnClickListener(v -> finish());
    }

    private void findViewsById() {
        gamePlayImageView = findViewById(R.id.gamePlayImageView);
        gameBackImageButton = findViewById(R.id.gameBackImageButton);
    }
}