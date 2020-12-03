package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ing;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent activityBienvenido = new Intent(this, Bienvenido.class);
        Intent activityRegistro = new Intent(this, Registro.class);

        ing = (Button) findViewById(R.id.btnLogin);
        reg = (Button) findViewById(R.id.btnNewAcc);


        ing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(activityBienvenido);
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(activityRegistro);
            }
        });
    }
}