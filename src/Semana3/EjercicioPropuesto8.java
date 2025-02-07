package Semana3;

import generico.Utils;

public class EjercicioPropuesto8 {
    public static void main(String[] args) {

        Utils.limpiarConsola();
        
        double examen1;
        double examen2;
        double examen3;
        double promedio;

        examen1 = Utils.leerDoble("Digite la nota del primer examen: ");
        examen2 = Utils.leerDoble("Digite la nota del segundo examen: ");
        examen3 = Utils.leerDoble("Digite la nota del tercer examen: ");

        promedio = (examen1 + examen2 + examen3) / 3;

        if (promedio >= 70) {
            System.out.println("El promedio del estudiante es de " + promedio + " por lo tanto está aprobado.");
            
        } else {
            System.out.println("El promedio del estudiante es de " + promedio + " por lo tanto está reprobado.");           
        }

    }
}
