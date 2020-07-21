package com.example.savitransperu.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.savitransperu.R;
import com.squareup.picasso.Picasso;

public class info_viaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_viaje);

        String destino = getIntent().getStringExtra("destino");
        String fecha_embarque = getIntent().getStringExtra("fecha_embarque");
        String punto_embarque = getIntent().getStringExtra("punto_embarque");
        String img_url = getIntent().getStringExtra("img_url");
        int cantidad_pasajeros = getIntent().getIntExtra("cantidad_pasajeros", 0);
        double precio_asiento = getIntent().getDoubleExtra("precio_asiento", 0);
        String hora_embarque = getIntent().getStringExtra("hora_embarque");


        ImageView imageView;
        imageView = findViewById(R.id.img_info);
        Picasso.get().load(img_url).resize(370, 170).centerCrop().into(imageView);








        TextView textView;
        textView = findViewById(R.id.titulo);
        textView.setText(destino);
        textView = findViewById(R.id.info_cantidadpasajeros);
        textView.setText("Boletos Disponibles: " + String.valueOf(cantidad_pasajeros));
        textView = findViewById(R.id.dia);
        textView.setText("Fecha de Salida: " + fecha_embarque);
        textView = findViewById(R.id.embarque);
        textView.setText("Punto de Embarque: " + punto_embarque);
        textView = findViewById(R.id.precio);
        textView.setText("Precio: S/." + String.valueOf(precio_asiento));
        textView = findViewById(R.id.hora);
        textView.setText("Hora de Embarque: " + String.valueOf(hora_embarque));


    }
}