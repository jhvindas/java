package Semana7;

import javax.swing.plaf.TreeUI;

import generico.Utils;

public class EjercicioPropuesto4 {
    public static void main(String[] args) {
        
        int numero, i;
        boolean esPrimo;

        Utils.limpiarConsola();

        numero = Utils.leerEntero("Digite un numero a evaluar: ");
        esPrimo = True;
        i = 2;

        if (numero < 1) {
            System.out.println("No se puede evaluar");
        } else {
            if (numero >= 3) {
                do {
                    if (numero % i == 0) {
                        esPrimo = False;
                    }
                } while (esPrimo && i < numero);

                    i = i + 1;
            } else {
                if (numero = 1) {
                    System.out.println("El 1 no es primo");
                } else {
                    System.out.println("Es primo");
                }
            }
        }



    }
}
