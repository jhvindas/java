package Semana2;

import generico.Utils;

public class EjercicioPropuesto3 {
    public static void main(String[] args) {
    
        //int EdadElena;
        int EdadAna;

        int EdadElena = Utils.leerEntero("Digite la edad actual de Elena: ");

        EdadAna = EdadElena * 2 + 10;

        Utils.limpiarConsola();

        System.out.println("La edad de Ana dentro de diez años es de: " + EdadAna);

    }
}
