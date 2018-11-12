package com.example.wilson.eva2_8_listas_personalizadas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
    Intent inDetalle;

    Clima[] aCiudades = {
            new Clima("CHIHUAHUA", 7, "Nublado", R.drawable.cloudy),
            new Clima("CHIHUAHUA", 7, "Luuvioso", R.drawable.rainy),
            new Clima("CHIHUAHUA", 7, "Soleado", R.drawable.sunny),
            new Clima("CHIHUAHUA", 7, "Lluvia ligera", R.drawable.light_rain),
            new Clima("CHIHUAHUA", 7, "Nublado", R.drawable.cloudy),

            new Clima("CHIHUAHUA", 20, "Nublado", R.drawable.cloudy),
            new Clima("CHIHUAHUA", 20, "Luuvioso", R.drawable.rainy),
            new Clima("CHIHUAHUA", 20, "Soleado", R.drawable.sunny),
            new Clima("CHIHUAHUA", 20, "Lluvia ligera", R.drawable.light_rain),
            new Clima("CHIHUAHUA", 20, "Nublado", R.drawable.cloudy),

            new Clima("CIUDAD JUAREZ", 7, "Nublado", R.drawable.cloudy),
            new Clima("CIUDAD JUAREZ", 7, "Luuvioso", R.drawable.rainy),
            new Clima("CIUDAD JUAREZ", 7, "Soleado", R.drawable.sunny),
            new Clima("CIUDAD JUAREZ", 7, "Lluvia ligera", R.drawable.light_rain),
            new Clima("CIUDAD JUAREZ", 7, "Nublado", R.drawable.cloudy),

            new Clima("CIUDAD JUAREZ", 27, "Nublado", R.drawable.cloudy),
            new Clima("CIUDAD JUAREZ", 27, "Luuvioso", R.drawable.rainy),
            new Clima("CIUDAD JUAREZ", 27, "Soleado", R.drawable.sunny),
            new Clima("CIUDAD JUAREZ", 27, "Lluvia ligera", R.drawable.light_rain),
            new Clima("CIUDAD JUAREZ", 27, "Nublado", R.drawable.cloudy)
    };

    ListView lstVwClima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lstVwClima = findViewById(R.id.lstVwClima);
        lstVwClima.setAdapter(new WeatherAdapter(this, R.layout.layout_clima, aCiudades));
        inDetalle = new Intent(this, ClimaDetalle.class);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        inDetalle.putExtra("IMAGEN", aCiudades[i].img);
        startActivity(inDetalle);

    }
}
