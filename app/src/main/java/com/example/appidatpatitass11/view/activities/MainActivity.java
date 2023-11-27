package com.example.appidatpatitass11.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.appidatpatitass11.R;
import com.example.appidatpatitass11.databinding.ActivityMainBinding;
import com.example.appidatpatitass11.retrofit.request.LoginRequest;
import com.example.appidatpatitass11.retrofit.response.LoginResponse;
import com.example.appidatpatitass11.viewmodel.AuthViewModel;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding binding;
    private AuthViewModel authViewModel; //view model
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        authViewModel = new ViewModelProvider(this).get(AuthViewModel.class); //viewmodel reference
        binding.btningresar.setOnClickListener(this);
        binding.btnregistro.setOnClickListener(this);
        //inicialmente null luego se carga con un json - livedata porque no sabemos cuanto demorara en responder el servidor
        authViewModel.loginResponseMutableLiveData.observe(this, new Observer<LoginResponse>() {
            @Override
            public void onChanged(LoginResponse loginResponse) {
                validarLogin(loginResponse);
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btningresar){
            invocarLogin();
        }else {
            startActivity(new Intent(MainActivity.this,RegistroActivity.class));
        }
    }
    //metodos
    public void invocarLogin(){
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsuario(binding.ctusuario.getText().toString());
        loginRequest.setPassword(binding.ctpassword.getText().toString());
        authViewModel.autenticarUsuario(loginRequest);
    }

    public void validarLogin(LoginResponse loginResponse){
        if (loginResponse.isRpta()){
            startActivity(new Intent(MainActivity.this,HomeActivity.class));
        }else {
            Snackbar.make(binding.getRoot(),loginResponse.getMensaje(),Snackbar.LENGTH_LONG).show();
        }
    }
}