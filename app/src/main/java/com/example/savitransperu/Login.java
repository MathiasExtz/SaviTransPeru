package com.example.savitransperu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.savitransperu.api.ApiClient;
import com.example.savitransperu.api.LoginRequest;
import com.example.savitransperu.api.LoginResponse;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {
    EditText email;
    EditText password;
    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.et_correo);
        password = findViewById(R.id.et_contrasena);
        ingresar = findViewById(R.id.iniciar_sesion);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(email.getText().toString()) || TextUtils.isEmpty(password.getText().toString())){
                    Toast.makeText(Login.this, "Email /Password vacíos", Toast.LENGTH_LONG).show();
                }else{
                    //Procedemos a logear
                    iniciar();

                }

            }
        });
    }

    public void iniciar(){
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setEmail(email.getText().toString());
        loginRequest.setPassword(password.getText().toString());
        Call<LoginResponse> loginResponseCall = ApiClient.getUserService().userLogin(loginRequest);
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if(response.isSuccessful()){

                    final LoginResponse loginResponse = response.body();
                    if(loginResponse.getEstado().equals("1")){
                        Toast.makeText(Login.this, "Inicio de Sesión Autorizado!", Toast.LENGTH_LONG).show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                startActivity(new Intent(Login.this, ListaLugares.class));
                            }
                        }, 700);
                    }else{
                        Toast.makeText(Login.this, "La validación falló!", Toast.LENGTH_LONG).show();
                    }


                }else{
                    Toast.makeText(Login.this, "El servidor no responde!", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(Login.this, "Throwable"+t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    //Metodo para el boton anterior
    public void Registro(View view){
        Intent registro = new Intent(this, Registros.class);
        startActivity(registro);
    }

    public void ListaLugares(View view){
        Intent listado = new Intent(this, ListaLugares.class);
        startActivity(listado);
    }

}
