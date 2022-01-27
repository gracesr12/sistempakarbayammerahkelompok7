package com.example.bayammerah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class tentangkami extends AppCompatActivity {
    ImageButton back, tentangpakar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentangkami);

        back = findViewById(R.id.back);
        tentangpakar = findViewById(R.id.tentangpakar);

        back.setOnClickListener(v -> {
            Intent intent = new Intent(tentangkami.this, MainActivity.class);
            finish();
            startActivity(intent);
        });
        tentangpakar.setOnClickListener(v -> {
            Intent intent = new Intent(tentangkami.this, fotopakar.class);
            finish();
            startActivity(intent);
        });
    }
}