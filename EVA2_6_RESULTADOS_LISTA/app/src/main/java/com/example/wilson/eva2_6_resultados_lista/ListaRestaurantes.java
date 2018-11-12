package com.example.wilson.eva2_6_resultados_lista;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaRestaurantes extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView lstResta;
    Intent inDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        lstResta = findViewById(R.id.lstResta);
        //CREAR EL ADAPTADOR
        //ASIGNAR EL ADAPTADOR
        lstResta.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Datos.sResta));
        //ASIGNAR EL LISTENER
        lstResta.setOnItemClickListener(this);
        inDatos = getIntent();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        inDatos.putExtra("RESTAURANTE", position);
        setResult(Activity.RESULT_OK, inDatos);
        finish();
    }
}
