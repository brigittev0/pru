package com.example.appidatpatitass11.retrofit;

import com.example.appidatpatitass11.retrofit.request.LoginRequest;
import com.example.appidatpatitass11.retrofit.response.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PatitasServicio {
    @POST("login.php")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);
}
