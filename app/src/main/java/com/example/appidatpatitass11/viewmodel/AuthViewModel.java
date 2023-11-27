package com.example.appidatpatitass11.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.appidatpatitass11.retrofit.PatitasCliente;
import com.example.appidatpatitass11.retrofit.request.LoginRequest;
import com.example.appidatpatitass11.retrofit.response.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AuthViewModel extends AndroidViewModel {
    public MutableLiveData<LoginResponse> loginResponseMutableLiveData = new MutableLiveData<>();
    public AuthViewModel(@NonNull Application application) {
        super(application);
    }
    public void autenticarUsuario(LoginRequest loginRequest){
        new PatitasCliente().getInstance().login(loginRequest).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) { //saccefully
                loginResponseMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {//fail
                t.printStackTrace();
            }
        });
    }
}
