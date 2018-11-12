package com.example.wilson.eva2_8_listas_personalizadas;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;

public class WeatherAdapter extends ArrayAdapter<Clima> {
    Context cContexto;
    int iLayout;
    Clima[] aCiudadesClima;

    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Clima[] objects) {
        super(context, resource, objects);
        cContexto = context;
        iLayout = resource;
        aCiudadesClima = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageView imgVwClima;
        TextView txtVwCiudad, txVwTemp, txtVwDesc;

        View vFila = convertView;

        if (vFila == null){//Si es nulo, no existe nuestra fila
            //PARA CREAR NUESTRA VISTA USAMOS LAYOUTINFLATER
            LayoutInflater liVista = ((Activity)cContexto).getLayoutInflater();
            vFila = liVista.inflate(iLayout, parent, false);
        }

        //VINCULAR LOS WIDGETS
        imgVwClima = vFila.findViewById(R.id.imgVwClima);
        txtVwCiudad = vFila.findViewById(R.id.txtVwCiudad);
        txVwTemp = vFila.findViewById(R.id.txtVwTemp);
        txtVwDesc = vFila.findViewById(R.id.txtVwDesc);

        //llenar los datos
        Clima cActual = aCiudadesClima[position];
        imgVwClima.setImageResource(cActual.img);
        txtVwCiudad.setText(cActual.nombreCiudad);
        txVwTemp.setText(cActual.temp + "o");
        txtVwDesc.setText(cActual.desc);

        return vFila;
        //return super.getView(position, convertView, parent);
    }
}
