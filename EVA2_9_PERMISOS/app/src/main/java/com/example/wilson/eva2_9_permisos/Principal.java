package com.example.wilson.eva2_9_permisos;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Principal extends AppCompatActivity {

    EditText edtTxtTel;
    Intent inLlamar;
    final int PERMISO_LLAMAR = 1000;
    boolean bBande;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edtTxtTel = findViewById(R.id.edtTxtTel);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},PERMISO_LLAMAR);
        }


    }


    public void click(View v){
        if (bBande){
            String sTel = "tel: " + edtTxtTel.getText().toString();
            inLlamar =  new Intent(Intent.ACTION_CALL, Uri.parse(sTel));
            startActivity(inLlamar);
        }else{
            Toast.makeText(getApplicationContext(),"No puedes llamar", Toast.LENGTH_SHORT).show();
        }

    }
        @Override
        public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
            if (requestCode ==PERMISO_LLAMAR){
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    bBande = true;
                }
            }


}

        }