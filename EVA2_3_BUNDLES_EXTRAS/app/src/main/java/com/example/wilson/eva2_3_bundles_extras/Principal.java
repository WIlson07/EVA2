package com.example.wilson.eva2_3_bundles_extras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity implements View.OnClickListener{

    Button btnIniSecu;
    Intent inLanzarSecun;
    EditText edtTxtMensa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnIniSecu = findViewById(R.id.btnIniSecu);
        btnIniSecu.setOnClickListener(this);
        edtTxtMensa = findViewById(R.id.edtTxtMensa);

        inLanzarSecun = new Intent(this, Secundaria.class);
    }



    @Override
    public void onClick(View v) {
        String sCade = edtTxtMensa.getText().toString();
        inLanzarSecun.putExtra("MENSAJE", sCade);
        startActivity(inLanzarSecun);
    }
}
