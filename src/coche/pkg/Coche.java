package coche.pkg;

public class Coche {
    // Atributos - Propiedades - Características
    String color;
    String marca;
    String modelo;
    String tipoCombustible;
    boolean encendido;
    int deposito;
    //---------------------------------------

    // Métodos - FUNCIONES - Acciones - Comportamientos
    void llenarDeposito(int cantidad){
        deposito += cantidad;
    }

    void arrancarMotor(){
        encendido = true;
    }

    void pararMotor(){
        encendido = false;
    }

    void fichaCoche(){
        System.out.println("----- Ficha del coche -------");
        System.out.println("Marca : " + marca);
        System.out.println("Modelo : " + modelo);
        System.out.println("Color : " + color);
        System.out.println("Tipo de combustible : " + tipoCombustible);
        System.out.println("Cantidad del deposito : " + deposito + " Litros");
        System.out.println("Encendido? : " + encendido);
        System.out.println("--------------------");
        System.out.println("");

    }

}
