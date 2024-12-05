package modulo.pkg;

import java.util.Random;

public class Modulo {
    //Atributos
    final int K_HORAS_SEMANA = 32;
    int horasSemanales ;
    String profesor;
    String nombreModulo;
    String codigoModulo;
    String curso;
    String cicloFormativo;
    String descripcion;
    int horasTotales;

    void fichaModulo(){
        System.out.println("---------- Ficha del Modulo ----------");
        System.out.println("Horas semanales : " + horasSemanales);
        System.out.println("Profesor : " + profesor);
        System.out.println("Nombre del modulo : " + nombreModulo);
        System.out.println("Código del modulo : " + codigoModulo);
        System.out.println("Curso : " + curso);
        System.out.println("Horas totales : " + horasTotales());
        System.out.println("Ciclo formativo : " + cicloFormativo);
        System.out.println("¿Aprobado? :" + moduloAprobado());
        System.out.println("Descripción : " + descripcion);
        System.out.println("----------------------------------");
    }

    int horasTotales(){
        horasTotales = horasSemanales * K_HORAS_SEMANA;
        return horasTotales;
    }

    boolean moduloAprobado(){
        Random rand = new Random();   
        int calificacion = rand.nextInt(11);
        System.out.println("Calificación : " + calificacion);
        if(calificacion >=5){
            return true;
        }else 
            return false;
    }
}
