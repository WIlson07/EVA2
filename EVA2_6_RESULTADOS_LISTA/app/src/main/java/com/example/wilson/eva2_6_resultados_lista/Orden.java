package com.example.wilson.eva2_6_resultados_lista;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Orden extends AppCompatActivity {
    EditText edtTxtCant, edtTxtPrecio;
    Intent inDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orden);
        edtTxtCant = findViewById(R.id.edtTxtCant);
        edtTxtPrecio = findViewById(R.id.edtTxtPrecio);
        inDatos = getIntent();
    }



    public void calcularCosto(View v){
        int iCant = Integer.parseInt(edtTxtCant.getText().toString());
        double dPrecio = Double.parseDouble(edtTxtPrecio.getText().toString());
        inDatos.putExtra("TOTAL", (iCant * dPrecio));
        setResult(Activity.RESULT_OK, inDatos);
        finish();
    }
}
