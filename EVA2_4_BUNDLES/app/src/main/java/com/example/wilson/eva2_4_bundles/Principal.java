package com.example.wilson.eva2_4_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements CheckBox.OnCheckedChangeListener, View.OnClickListener{

    EditText edtTxtNom, edtTxtApe, edtTxtEdad, edtTxtSal;
    TextView txtVwSal;
    CheckBox ckBxLabora;
    Button btnEnviar;
    RadioGroup rdGrpGen;
    Intent inEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        edtTxtNom = findViewById(R.id.edtTxtNom);
        edtTxtApe = findViewById(R.id.edtTxtApe);
        edtTxtEdad = findViewById(R.id.edtTxtEdad);
        edtTxtSal = findViewById(R.id.edtTxtSal);
        txtVwSal = findViewById(R.id.txtVwSal);
        ckBxLabora = findViewById(R.id.chBxLabora);
        btnEnviar = findViewById(R.id.btnEnviar);
        rdGrpGen = findViewById(R.id.rdGrpGen);

        //LISTENERS
        ckBxLabora.setOnCheckedChangeListener(this);
        btnEnviar.setOnClickListener(this);
        inEnviar = new Intent(this, Secundaria.class);
    }

    @Override
    public void onClick(View v) {
        String sNom = edtTxtNom.getText().toString();
        String sApe = edtTxtApe.getText().toString();
        int iEdad = Integer.parseInt(edtTxtEdad.getText().toString());
        boolean bLabora = ckBxLabora.isChecked();
        double dSal = Double.parseDouble(edtTxtSal.getText().toString());
        int iSel = rdGrpGen.getCheckedRadioButtonId();
        int iGen;

        if (iSel == R.id.rdBtnMas){
            iGen = 1;
        }else if (iSel == R.id.rdBtnFem){
            iGen = 2;
        } else
            iGen = 3;




        Bundle bBundle = new Bundle();
        bBundle.putString("NOMBRE", sNom);
        bBundle.putString("APELLIDO", sApe);
        bBundle.putInt("EDAD", iEdad);
        bBundle.putBoolean("LABORA", bLabora);
        bBundle.putDouble("SALARIO", dSal);
        bBundle.putInt("GENERO", iGen);
        inEnviar.putExtras(bBundle);

        startActivity(inEnviar);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        txtVwSal.setEnabled(ckBxLabora.isChecked());
        edtTxtSal.setEnabled(ckBxLabora.isChecked());
    }
}
