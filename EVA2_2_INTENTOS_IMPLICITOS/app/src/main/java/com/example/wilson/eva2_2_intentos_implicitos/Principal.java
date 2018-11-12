package com.example.wilson.eva2_2_intentos_implicitos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity implements View.OnClickListener{

    Button btnIniSecun;
    Intent inLanzarSecun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnIniSecun = findViewById(R.id.btnIniSecun);
        btnIniSecun.setOnClickListener(this);

        inLanzarSecun = new Intent(this, Secundaria.class);
    }

    @Override
    public void onClick(View v){
        startActivity(inLanzarSecun);
    }
}
