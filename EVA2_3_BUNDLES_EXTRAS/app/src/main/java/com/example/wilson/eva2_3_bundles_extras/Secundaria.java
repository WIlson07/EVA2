package com.example.wilson.eva2_3_bundles_extras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {

    TextView txtVwMensa;
    Intent inLeer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        txtVwMensa = findViewById(R.id.txtVwMensa);

        //recuperar el intento que genero a secundaria
        inLeer = getIntent();

        //leer los datos enviados
        txtVwMensa.setText(inLeer.getStringExtra("MENSAJE"));
    }

    public void cerrarSecun(View v){
        finish();
    }
}
