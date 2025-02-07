package Semana3;

import generico.Utils;

public class Ejemplo01 {
    public static void main(String[] args) {
        
        Utils.limpiarConsola();

        int numero;

        numero = Utils.leerEntero("Digitel el número: ");

        if (numero >= 0) {
            // Todo lo que está dentro del if es True en Java
            System.out.println("El número " + numero + " es positivo");
        } else {
            // Todo lo que está dentro del else es False en Java
            System.out.println("El número " + numero  + "es negativo");
        }

    }
    
}