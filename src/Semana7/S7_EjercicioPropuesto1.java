package Semana7;

import generico.Utils;

public class S7_EjercicioPropuesto1 {
    public static void main(String[] args) {
        
        int numero;

        do {
            numero = Utils.leerEntero("Digite el numero: ");
        } while (numero % 2 == 0);
        System.out.println("Muchas gracias");

    }
}
