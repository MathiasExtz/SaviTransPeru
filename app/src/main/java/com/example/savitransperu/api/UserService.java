package com.example.savitransperu.api;

import com.example.savitransperu.models.LoginRequest;
import com.example.savitransperu.models.LoginResponse;
import com.example.savitransperu.models.RegisterRequest;
import com.example.savitransperu.models.RegisterResponse;
import com.example.savitransperu.models.Viaje;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserService {

    @POST("Validar_usuario.php")
    Call<LoginResponse> userLogin(@Body LoginRequest loginRequest);

    @POST("Insertar_usuario.php")
    Call<RegisterResponse> createUser(@Body RegisterRequest registerRequest);

    @GET("Obtener_viajes.php")
    Call<List<Viaje>> listTravel();

}
