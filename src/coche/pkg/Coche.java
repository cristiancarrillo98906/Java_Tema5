package coche.pkg;

public class Coche {
    // Atributos - Propiedades - Características
    String color;
    String marca;
    String modelo;
    String tipoCombustible;
    boolean encendido = false;
    int deposito;
    int limiteDeposio;
    int maxDeposito;
    int velocidad;

    //---------------------------------------

    // Métodos - FUNCIONES - Acciones - Comportamientos
    void llenarDeposito(int cantidad){
        if(cantidad <= getMaxDeposito()){
            deposito += cantidad;
        }else {
            System.out.println("NO puedes sobrepasar el límite");
        }
    }

    void arrancarMotor(){
        if (encendido == true) {
            deposito -= 2;
        }
    }

    void pararMotor(){
        encendido = false;
    }

    void acelerar(){
        velocidad += 10;
        deposito -= 1;
    }

    void frenar(){
        velocidad -= 5;

    }

    int getMaxDeposito(){
         return limiteDeposio - deposito;
    }

    void fichaCoche(){
        System.out.println("----- Ficha del coche -------");
        System.out.println("Marca : " + marca);
        System.out.println("Modelo : " + modelo);
        System.out.println("Color : " + color);
        System.out.println("Tipo de combustible : " + tipoCombustible);
        System.out.println("Cantidad del deposito : " + deposito + " Litros");
        System.out.println("Encendido? : " + encendido);
        System.out.println("Limite del deposito : " + limiteDeposio);
        System.out.println("Máximo del depósito : " + getMaxDeposito());
        System.out.println("Velocidad : " + velocidad);
        System.out.println("--------------------");
        System.out.println("");

    }

}
