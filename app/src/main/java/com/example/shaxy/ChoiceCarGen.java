package com.example.shaxy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChoiceCarGen extends AppCompatActivity {
    ImageButton carChoiseGenBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_car_gen);

        carChoiseGenBtn = this.findViewById(R.id.imageButton13);

        carChoiseGenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ChoiseCarFin.class));
            }
        });
    }
}