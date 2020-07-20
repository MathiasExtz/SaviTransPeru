package com.example.savitransperu.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.savitransperu.R;
import com.example.savitransperu.api.ApiClient;
import com.example.savitransperu.models.RegisterRequest;
import com.example.savitransperu.models.RegisterResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Registros extends AppCompatActivity {
        private EditText nombre;
        private EditText apellido;
        private EditText email;
        private EditText telefono;
        private EditText contrasenia;
        private EditText contrasenia2;
        private Button btnRegistro;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registros);
        nombre =  findViewById(R.id.et_nombre);
        apellido =  findViewById(R.id.et_apellidos);
        email =  findViewById(R.id.et_correo);
        telefono = findViewById(R.id.et_telefono);
        contrasenia =  findViewById(R.id.et_contrasena);
        contrasenia2 = findViewById(R.id.et_contrasenaa);
        btnRegistro = findViewById(R.id.registro);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(nombre.getText().toString()) || TextUtils.isEmpty(apellido.getText().toString())
                        || TextUtils.isEmpty(telefono.getText().toString())|| TextUtils.isEmpty(contrasenia.getText().toString())
                        || TextUtils.isEmpty(contrasenia2.getText().toString())|| TextUtils.isEmpty(email.getText().toString())){

                    Toast.makeText(Registros.this, "Debe completar todos los campos", Toast.LENGTH_LONG).show();
                }else{
                    if(contrasenia.getText().toString().equals(contrasenia2.getText().toString())){
                        //Procedemos a logear
                        registrar();
                    }else  {
                        Toast.makeText(Registros.this, "Las contrasenas deben ser iguales", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

    }

    public void registrar(){
        RegisterRequest registerRequest= new RegisterRequest();
        registerRequest.setEmail(email.getText().toString());
        registerRequest.setPassword(contrasenia.getText().toString());
        registerRequest.setTelefono(telefono.getText().toString());
        registerRequest.setUsername(nombre.getText().toString()+" "+apellido.getText().toString());

        Call<RegisterResponse> registerResponseCall = ApiClient.getUserService().createUser(registerRequest);
        registerResponseCall.enqueue(new Callback<RegisterResponse>() {
            @Override
            public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {
                if(response.isSuccessful()){

                    final RegisterResponse loginResponse = response.body();
                    if(loginResponse.getEstado().equals("1")){
                        Toast.makeText(Registros.this, "Usuario registrado!", Toast.LENGTH_LONG).show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                startActivity(new Intent(Registros.this, Login.class));
                            }
                        }, 700);
                    }else{
                        Toast.makeText(Registros.this, "La validación falló!", Toast.LENGTH_LONG).show();
                    }


                }else{
                    Toast.makeText(Registros.this, "El servidor no responde!", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<RegisterResponse> call, Throwable t) {
                Toast.makeText(Registros.this, "Throwable"+t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
