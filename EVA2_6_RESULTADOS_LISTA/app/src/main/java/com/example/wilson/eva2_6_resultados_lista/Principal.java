package com.example.wilson.eva2_6_resultados_lista;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    TextView txtVwResta, txtVwTotal;
    Intent inResta, inOrden;

    final int LISTA_RESTA = 100;
    final int ORDEN = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtVwResta = findViewById(R.id.txtVwResta);
        inResta = new Intent(this, ListaRestaurantes.class);
        inOrden = new Intent(this, Orden.class);
        txtVwTotal = findViewById(R.id.txtVwTotal);
    }

    public void click(View v){
        startActivityForResult(inResta, LISTA_RESTA);
    }

    public void calculaCosto(View v){
        startActivityForResult(inOrden, ORDEN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == LISTA_RESTA){
            if (resultCode == Activity.RESULT_OK){
                int iResta = data.getIntExtra("RESTAURANTE", 0);
                txtVwResta.setText(Datos.sResta[iResta]);
            }else if (requestCode == ORDEN) {
                if (resultCode == Activity.RESULT_OK) {
                    double dTotal = data.getDoubleExtra("TOTAL", 0);
                    txtVwTotal.setText("$ " + dTotal);
                }
            }
        }
    }
}
