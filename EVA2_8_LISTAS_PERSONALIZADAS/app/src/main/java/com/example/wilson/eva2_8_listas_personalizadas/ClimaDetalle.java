package com.example.wilson.eva2_8_listas_personalizadas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ClimaDetalle extends AppCompatActivity {
    Intent inDatos;
    ImageView imgVwClimaDet;
    TextView txtVwCiudadDet, txVwTempDet, txtVwDescDet;
    Clima cActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clima_detalle);

        //VINCULAR LOS WIDGETS
        imgVwClimaDet = findViewById(R.id.imgVwClima);
        txtVwCiudadDet = findViewById(R.id.txtVwCiudad);
        txVwTempDet = findViewById(R.id.txtVwTemp);
        txtVwDescDet = findViewById(R.id.txtVwDesc);
        inDatos = getIntent();

        //llenar los datos

        imgVwClimaDet.setImageResource(inDatos.getIntExtra("IMAGEN", R.drawable.cloudy));
        txtVwCiudadDet.setText(cActual.nombreCiudad);
        txVwTempDet.setText(cActual.temp + "°C");
        txtVwDescDet.setText(cActual.desc);
    }
}
