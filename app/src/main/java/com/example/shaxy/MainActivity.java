package com.example.shaxy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.widget.AppCompatImageButton;


public class MainActivity extends AppCompatActivity {
    ImageButton btnsuivant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsuivant = this.findViewById(R.id.btnSuivant1);

        btnsuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), EnregistrementNumber.class));
            }
        });

    }
}