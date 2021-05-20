package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView mainToPlayImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainToPlayImageView = findViewById(R.id.mainToPlayImageView);
        setupImageViewClick();
    }

    private void setupImageViewClick() {
        mainToPlayImageView.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), GameActivity.class);
            int randomNumber = new Random().nextInt(2);
            intent.putExtra(Constants.NUMBER, randomNumber);
            startActivity(intent);
        });
    }
}