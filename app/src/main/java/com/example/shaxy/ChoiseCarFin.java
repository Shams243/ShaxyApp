package com.example.shaxy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChoiseCarFin extends AppCompatActivity {
    ImageButton btn, btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choise_car_fin);
        btn = this.findViewById(R.id.MpesaBtn);
        btn1 = this.findViewById(R.id.AirtelBtn);
        btn2 = this.findViewById(R.id.OrangeBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ValidatePayment.class));
            }
        });
    }
}