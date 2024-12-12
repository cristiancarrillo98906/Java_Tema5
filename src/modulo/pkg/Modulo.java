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

    void metodoDummy(){
        String descripcion;
        descripcion = "asiydfagvbjkdasdjasd";
        System.out.println(this.descripcion); // llama al atributo y la variable deja de tener utilidad
        //El this es para acceder a los atributos de la clase que se está instanciando
    }


    void fichaModulo(){
        System.out.println("---------- Ficha del Modulo ----------");
        System.out.println("Horas semanales : " + this.horasSemanales);
        System.out.println("Profesor : " + this.profesor);
        System.out.println("Nombre del modulo : " + this.nombreModulo);
        System.out.println("Código del modulo : " + this.codigoModulo);
        System.out.println("Curso : " + this.curso);
        System.out.println("Horas totales : " + horasTotales());
        System.out.println("Ciclo formativo : " + this.cicloFormativo);
        System.out.println("¿Aprobado? :" + this.moduloAprobado());
        System.out.println("Descripción : " + this.descripcion);
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
