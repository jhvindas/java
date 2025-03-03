package Semana6;

import generico.Utils;

public class S6_EjercicioPropuesto2 {
    public static void main(String[] args) {
        int n;

        Utils.limpiarConsola();

        n = Utils.leerEntero("hasta donde quiere llegar?: ");

        System.out.printf("Los numeros pares de %d hasta 1 son: \n", n);

        for (int i = n; i >= 2; i-=2 ) {
            System.out.println(i);
        }


    }
}
