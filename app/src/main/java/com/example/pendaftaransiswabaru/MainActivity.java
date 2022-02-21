package com.example.pendaftaransiswabaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private androidx.appcompat.widget.AppCompatButton btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_add = findViewById(R.id.btn_add);

        btn_add.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(),edit.class));
        });
    }
}