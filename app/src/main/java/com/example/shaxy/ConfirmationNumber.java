package com.example.shaxy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ConfirmationNumber extends AppCompatActivity {
    ImageButton btnSuivant;
    TextView codeView, numberView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_number);
        btnSuivant = this.findViewById(R.id.suivantbtn);
        codeView = findViewById(R.id.viewCode);
        numberView = findViewById(R.id.viewNumber);

        intent =this.getIntent();
        String codeTel = intent.getStringExtra("code");
        String numbTel = intent.getStringExtra("number");

        codeView.setText(codeTel);
        numberView.setText(numbTel);
//        Log.i("TAG", "onCreate: ");

        btnSuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), EnregistrementMail.class));
            }
        });
    }
}