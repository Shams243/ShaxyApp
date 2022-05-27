package com.example.shaxy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ConfirmationMail extends AppCompatActivity {
    ImageButton btn;
    TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_mail);
        btn = this.findViewById(R.id.BtnSuivantMail);
        txtview = this.findViewById(R.id.textMail);
        txtview.setTextColor(getResources().getColor(R.color.white));



        Intent intent = this.getIntent();

        String mail = intent.getStringExtra("mail");
        txtview.setText(mail);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ConfirmationName.class));
            }
        });
    }
}