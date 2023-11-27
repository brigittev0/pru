package com.example.appidatpatitass11.retrofit;

import com.example.appidatpatitass11.retrofit.request.LoginRequest;
import com.example.appidatpatitass11.retrofit.request.RegistroRequest;
import com.example.appidatpatitass11.retrofit.response.LoginResponse;
import com.example.appidatpatitass11.retrofit.response.MascotaResponse;
import com.example.appidatpatitass11.retrofit.response.RegistroResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface PatitasServicio {
    @POST("login.php")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);
    @PUT("persona.php") //registrar es post pero aca se confundieron
    Call<RegistroResponse> registro(@Body RegistroRequest registroRequest);
    @GET("mascotaperdida.php")
    Call<List<MascotaResponse>> listarMascotas(); //get no envia parametros en el body

}
