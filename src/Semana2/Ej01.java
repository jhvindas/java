package Semana2;

import generico.Utils;

public class Ej01 {
    public static void main(String[] args) {
        // INPUTS
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int suma = 0;
        int multi = 0;

        Utils.limpiarConsola();

        numero1 = Utils.leerEntero("Digite el primer número: ");
        numero2 = Utils.leerEntero("Digite el segundo número: ");
        numero3 = Utils.leerEntero("Digite el tercero número: ");

        // PROCESS
        suma = numero1 + numero2 + numero3;
        multi = numero1 * numero2 * numero3;

        // OUTPUT
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La multiplicación de los números es: " + multi);
    }    
}
