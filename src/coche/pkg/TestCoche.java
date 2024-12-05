package coche.pkg;

public class TestCoche {
    public static void main(String[] args) {
        //Creando Objetos
        Coche c1 = new Coche();// CREACION DE UN OBJETO COCHE LLAMADO C1

        // Atributos del objeto Coche (c1)
        c1.marca = "Ferrari";
        c1.modelo = "Testarrosa";
        c1.color = "Naranja";
        c1.tipoCombustible = "Diesel";
        c1.deposito = 30;
        c1.encendido = false;


        c1.fichaCoche();
        c1.arrancarMotor();
        c1.llenarDeposito(5);
        c1.fichaCoche();

        Coche c2 = new Coche();
        c2.marca = "Mercedez";
        c2.modelo = "C200";
        c2.color = "Gris";
        c2.tipoCombustible = "Gasolina";
        c2.deposito = 200;
        c1.encendido = true;
        c2.fichaCoche();

        Coche c3 = new Coche();
        c3.marca = "Opel";
        c3.modelo = "corsa";
        c3.color = "Rojo";
        c3.tipoCombustible = "Gasolina";
        c3.deposito = 20;
        c3.encendido = true;
        c3.limiteDeposio = 90;
        c3.velocidad = 70;
        c3.maxDeposito = 100;

        c3.fichaCoche();
        c3.arrancarMotor();
        c3.llenarDeposito(50);

        c3.fichaCoche();
        c3.arrancarMotor();
        c3.acelerar();
        c3.acelerar();
        c3.fichaCoche();
        c3.frenar();
        c3.fichaCoche();

    }
}
