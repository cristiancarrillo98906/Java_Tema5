package modulo.pkg;

public class TestModulo {
    public static void main(String[] args) {
    Modulo programacion = new Modulo();
    programacion.nombreModulo = "PROGRAMACION";
    programacion.codigoModulo = "0485";
    programacion.horasSemanales = 8;
    programacion.profesor = "Manolin";
    programacion.curso = "1";
    programacion.cicloFormativo = "DAW";
    programacion.descripcion = "Cositas";
    programacion.fichaModulo();

    //REFERENCIA NULL DE LOS OBJETOS
        /*
        Modulo lmsi;
        lmsi = null;
        lmsi.fichaModulo(); */

        Modulo lmsi = new Modulo();
        lmsi = programacion;
        lmsi.fichaModulo();

        programacion.descripcion= "Es el modulo que más me gusta";
        programacion.metodoDummy();

    }
}
