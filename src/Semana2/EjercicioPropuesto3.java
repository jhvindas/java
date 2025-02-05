package Semana2;

import generico.Utils;

public class EjercicioPropuesto3 {
    public static void main(String[] args) {
    
        //int EdadElena;
        int edadAna;

        int edadElena = Utils.leerEntero("Digite la edad actual de Elena: ");

        edadAna = edadElena * 2 + 10;

        Utils.limpiarConsola();

        System.out.println("La edad de Ana dentro de diez años es de: " + edadAna);

    }
}
