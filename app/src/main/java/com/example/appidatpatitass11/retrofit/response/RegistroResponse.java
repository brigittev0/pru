package com.example.appidatpatitass11.retrofit.response;

public class RegistroResponse { //lo que responde
    private boolean rpta;
    private String mensaje;

    public boolean isRpta() {
        return rpta;
    }

    public void setRpta(boolean rpta) {
        this.rpta = rpta;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
