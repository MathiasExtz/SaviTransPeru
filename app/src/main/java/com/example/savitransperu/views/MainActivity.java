package com.example.savitransperu.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.savitransperu.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Metodo para el boton Iniciar Sesión
    public void Login(View view){
        Intent login= new Intent(this, Login.class);
        startActivity(login);
    }
    public void ListaLugares(View view){
        Intent tarifa = new Intent(this, ListaLugares.class);
        startActivity(tarifa);
    }
}
