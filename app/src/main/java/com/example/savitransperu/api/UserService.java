package com.example.savitransperu.api;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface UserService {

    @POST("Validar_usuario.php")
    Call<LoginResponse> userLogin(@Body LoginRequest loginRequest);

    @POST("Insertar_usuario.php")
    Call<RegisterResponse> createUser(@Body RegisterRequest registerRequest);


}
