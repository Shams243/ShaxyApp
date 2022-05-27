package com.example.shaxy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MapsSearching extends AppCompatActivity {
    ImageButton btndest;
    TextView txtV;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_searching);
        btndest = this.findViewById(R.id.destButton);
        txtV = findViewById(R.id.nameView);

        intent = this.getIntent();
        String name =intent.getStringExtra("name");
        txtV.setText(name);

        btndest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DestConfir.class));
            }
        });
    }
}