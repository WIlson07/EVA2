package com.example.wilson.eva2_1_intentos;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {

    EditText edtTxtTel;
    Intent inMarcar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        edtTxtTel = findViewById(R.id.edtTxtTel);

    }

    public void onClick(View v){
        String sTel = edtTxtTel.getText().toString();
        sTel = "tel:"+sTel;
                                //ACCION        , DATOS
        inMarcar = new Intent(Intent.ACTION_DIAL, Uri.parse(sTel));

        //EJECUTAR EL INTENTO
        //QUIEREN UNA RESPUESTA O NO
        startActivity(inMarcar);
    }

    public void onClickLlamar(View v){
        String sTel = edtTxtTel.getText().toString();
        sTel = "tel:"+sTel;
        //ACCION        , DATOS
        inMarcar = new Intent(Intent.ACTION_CALL, Uri.parse(sTel));

        //EJECUTAR EL INTENTO
        //QUIEREN UNA RESPUESTA O NO
        startActivity(inMarcar);
    }

    public void onClickWeb(View v){

        //ACCION        , DATOS
        inMarcar = new Intent(Intent.ACTION_WEB_SEARCH);
        inMarcar.putExtra(SearchManager.QUERY, "fallout 76");

        //EJECUTAR EL INTENTO
        //QUIEREN UNA RESPUESTA O NO
        startActivity(inMarcar);
    }
}
