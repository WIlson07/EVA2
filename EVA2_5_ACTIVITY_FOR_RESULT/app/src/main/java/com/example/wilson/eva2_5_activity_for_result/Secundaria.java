package com.example.wilson.eva2_5_activity_for_result;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Secundaria extends AppCompatActivity {

    EditText edtTxtDatos;
    Intent inDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        edtTxtDatos = findViewById(R.id.edtTxtDatos);
        inDatos = getIntent();
    }

    public void clickSecun(View v){
        String sCade = edtTxtDatos.getText().toString();
        inDatos.putExtra("DATOS", sCade);
        setResult(Activity.RESULT_OK, inDatos);
        finish();

    }
}
