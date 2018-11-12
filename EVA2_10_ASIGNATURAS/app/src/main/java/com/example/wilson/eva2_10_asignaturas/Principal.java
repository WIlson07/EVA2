package com.example.wilson.eva2_10_asignaturas;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


    }

    public void  clickGeneral(View v){
        new AlertDialog.Builder(this)
                .setTitle("MI CUADRO DE DIALOGO")
                .setMessage("Cuadro de dialogo general")
                .setPositiveButton("BIEN!",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "EXITO!", Toast.LENGTH_LONG).show();
                            }
                        })
                .setNeutralButton("NEUTRAL!",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "NEUTRAL!", Toast.LENGTH_LONG).show();
                            }
                        })
                .setNegativeButton("MALO!",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "MALOOOO!", Toast.LENGTH_LONG).show();
                            }
                        })
                .create().show();
    }
    public void  clickPerson(View v){
        final Dialog dMiCuadroDialogo = new Dialog(this);
        dMiCuadroDialogo.setContentView(R.layout.mis_cuadros);
        final TextView txtVwTitu;
        final EditText edtTxtDatos;
        Button btnAccion;
         txtVwTitu = dMiCuadroDialogo.findViewById(R.id.txtVwTitulo);
         edtTxtDatos = dMiCuadroDialogo.findViewById(R.id.edtTxtCaptu);
         btnAccion = dMiCuadroDialogo.findViewById(R.id.btnAccion);

        txtVwTitu.setText("SALUDAR!");
        edtTxtDatos.setHint("INTRODUCE TU NOMBRE");
        btnAccion.setText("SALUDAR!!!");
        btnAccion.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),
                                edtTxtDatos.getText().toString(),
                                Toast.LENGTH_LONG).show();
                        dMiCuadroDialogo.dismiss();
                    }
                }
        );
        dMiCuadroDialogo.show();
    }

}
