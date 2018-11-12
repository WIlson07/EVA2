package com.example.wilson.eva2_7_intentos_resultados;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    TextView txtVwResu;
    Intent inContactos, inImg, inLlamar;

    Uri uContactos, uImg;

    final int BUSCAR_CONTACTOS = 1000;
    final int BUSCAR_IMG = 2000;
    final int BUSCAR_LLAMAR = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtVwResu = findViewById(R.id.txtVwResu);
        uContactos = ContactsContract.Contacts.CONTENT_URI;
        inContactos = new Intent(Intent.ACTION_PICK, uContactos);
        uImg = Uri.parse("content://media/external/images/media");

        inImg = new Intent(Intent.ACTION_PICK, uImg);

    }

    public void click(View v){
        startActivityForResult(inContactos, BUSCAR_CONTACTOS);
    }

    public void clickImg(View v){
        startActivityForResult(inImg, BUSCAR_IMG);
    }

    public void clickLlamada(View v){
        String sTel = "tel:6143740124";

        inLlamar = new Intent(Intent.ACTION_CALL);
        inLlamar.setData(Uri.parse(sTel));
        startActivity(inLlamar);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case BUSCAR_CONTACTOS:
                if (resultCode == Activity.RESULT_OK){
                    String sResu = data.getDataString();
                    txtVwResu.setText(sResu);
                }
                break;
            case BUSCAR_IMG:
                if (resultCode == Activity.RESULT_OK){
                    String sResu = data.getDataString();
                    txtVwResu.setText(sResu);
                }
                break;
            case BUSCAR_LLAMAR:
                if (resultCode == Activity.RESULT_OK){
                    String sResu = data.getDataString();
                    txtVwResu.setText(sResu);
                }
                break;
            default:
                break;

    }
    }
}
