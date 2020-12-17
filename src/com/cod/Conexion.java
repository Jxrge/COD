package com.cod;

public class Conexion {
    //Nesta clase tamén están os formatos main aplicados
    public static String direccion = "";
    String ip = "127.0.0.2";

    private static Conexion instance = null;

    public static  Conexion getInstance(){
        if (instance == null){
            instance = new Conexion();
        }
        direccion = "anonymous@danielcastelao.org";
        return instance;
    }
    public static  Conexion getInstance(String direcc){
        if (instance == null){
            instance = new Conexion();
        }
        direccion = direcc;
        return instance;
    }

    public boolean diferenciar() {
        if (direccion != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false ;
        }
    }
}



