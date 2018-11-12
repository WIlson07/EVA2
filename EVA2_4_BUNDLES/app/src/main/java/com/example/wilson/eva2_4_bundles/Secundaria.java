package com.example.wilson.eva2_4_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
    Intent inDatos;
    TextView txtVwMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtVwMostrar = findViewById(R.id.txtVwDatos);
        inDatos = getIntent();
        Bundle bDatos = inDatos.getExtras();
        txtVwMostrar.append("Nombre: "+ bDatos.getString("NOMBRE"));
        txtVwMostrar.append("\nApellido: "+ bDatos.getString("APELLIDO"));
        txtVwMostrar.append("\nEdad: "+ bDatos.getInt("EDAD"));

        if (bDatos.getBoolean("LABORA")) {
            txtVwMostrar.append("\nSi Trabaja");
            txtVwMostrar.append("\nSalario: $"+ bDatos.getDouble("SALARIO"));
        }
        else
            txtVwMostrar.append("\nEsta de Flojo");

        switch (bDatos.getInt("GENERO")){
            case 1:
                txtVwMostrar.append("\nMasculino");
                break;
            case 2:
                txtVwMostrar.append("\nFemenino");
                break;
            default:
                txtVwMostrar.append("\nOtro");        }
    }
}
