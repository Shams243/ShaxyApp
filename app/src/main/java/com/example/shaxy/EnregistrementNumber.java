package com.example.shaxy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class EnregistrementNumber extends AppCompatActivity {
    ImageButton btn;
    Intent intent;
    TextView codeView, numberView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enregistrement_number);

        codeView = findViewById(R.id.codeEditText);
        numberView = findViewById(R.id.numberEditText2);
        btn = this.findViewById(R.id.accepteEtContinue);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String code = String.valueOf(codeView.getText());
                 String number = String.valueOf(numberView.getText());

                intent =new Intent(getApplicationContext(), ConfirmationNumber.class);

                intent.putExtra("code",code);
                intent.putExtra("number", number);

                startActivity(intent);
            }
        });
    }
}