package com.example.shaxy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class ConfirmationName extends AppCompatActivity {
    ImageButton BtnName;
    EditText nameEtxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_name);
        BtnName = this.findViewById(R.id.chercheshaxiBtn);
        nameEtxt = findViewById(R.id.nameEditTxt);

        BtnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = String.valueOf(nameEtxt.getText());
                Intent intent = new Intent(getApplicationContext(), MapsSearching.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });
    }
}