package com.example.appidatpatitass11.retrofit.request;
//request lo que se envia en el cuerpo de la peticion - body - raw -json
public class LoginRequest { //definir objecto
    private String usuario;
    private String password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
