package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageButton mainToPlayImageButton;
    private static final int MAXIMUM_NUMBER_LIMIT = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainToPlayImageButton = findViewById(R.id.mainToPlayImageButton);
        setupImageViewClick();
    }

    private void setupImageViewClick() {
        mainToPlayImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), GameActivity.class);
            int randomNumber = new Random().nextInt(MAXIMUM_NUMBER_LIMIT);
            intent.putExtra(Constants.NUMBER, randomNumber);
            startActivity(intent);
        });
    }
}