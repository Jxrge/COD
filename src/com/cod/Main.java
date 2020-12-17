package com.cod;

public class Main {

    public static void main(String[] args) {
        if (metodo1("pepe@danielcastelao.org")) {
        System.out.println("Listo");
        } else {
        System.out.println("Fallo");
        }
        if(metodo2()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
    }

    public static boolean metodo1(String u){
        Auxiliar obx1 = new Auxiliar(u);
        System.out.println("Conectando a " + obx1.h + ", con el usuario " + u);
        return obx1.con();
    }

    public static boolean metodo2() {
        Auxiliar obx2 = new Auxiliar();
        System.out.println("Conectando a " + obx2.h + ", con el usuario " + obx2.e);
        return obx2.con();
    }
}