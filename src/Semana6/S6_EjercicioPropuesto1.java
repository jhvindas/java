package Semana6;

import generico.Utils;

public class S6_EjercicioPropuesto1 {
    public static void main(String[] args) {
        int n;

        Utils.limpiarConsola();

        n = Utils.leerEntero("Hasta donde quiere llegar hoy?: ");

        System.out.printf("Los numeros pares del 1 hasta el %d son: \n", n);

        for (int i = 2; i < n; i+=2) {
            System.out.println(i);
        }

    }
}
