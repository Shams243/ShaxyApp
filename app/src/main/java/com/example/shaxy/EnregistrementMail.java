package com.example.shaxy;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class EnregistrementMail extends AppCompatActivity {
    ImageButton btn;
    EditText etxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enregistrement_mail);
        btn = this.findViewById(R.id.suivantbtnMail);
        etxt = this.findViewById(R.id.mailEditText);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail = String.valueOf(etxt.getText());
                Intent intent = new Intent(getApplicationContext(), ConfirmationMail.class);

                intent.putExtra("mail", mail);
                startActivity(intent);
            }
        });
    }
}