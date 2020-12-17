package com.cod;

public class Conexion {
    String Correo = "";
    String ip = "127.0.0.2";

    Conexion() {
        Correo = "anonymous@danielcastelao.org";
    }

    Conexion(String Correo2) {
        this.Correo = Correo2;
    }

    public boolean con() {
        if (Correo!= "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}

