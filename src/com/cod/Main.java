package com.cod;

public class Main {

    public static void main(String[] args) {
        if (metodo1("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        if (metodo2()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
    }

    public static boolean metodo1(String comando) {
        Conexion Direccion = new Conexion (comando);
        System.out.println("Conectando a " + Direccion.ip + ", con el usuario " + comando);
        return Direccion.con();
    }

    public static boolean metodo2() {
        Conexion enlace = new Conexion.getInstance();
        enlace = new Conexion();
        System.out.println("Conectando a " + enlace.ip + ", con el usuario " + enlace.Correo);
        return enlace.con();
    }
}

