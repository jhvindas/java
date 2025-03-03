package Semana6;

import generico.Utils;

public class S6_Ejemplo01 {
    public static void main(String[] args) {
        int acumulador = 0, limite, numero/* , contador*/;
        double promedio;

        limite = Utils.leerEntero("Digite la cantiada de datos: ");

        for (int i = 0; i < limite; i++) {
            numero = Utils.leerEntero(String.format("Digite el valor #%02d: ", (i+1)));
            acumulador = acumulador + numero;   
        }
        promedio = acumulador / limite;
        //promedio = (double) acumulador / limite; Esta linea trata los datos int (enteros) como doubles para poder imprimir los decimales. Cuando se usan int (enteros) el resultado se imprime como entero.
        System.out.printf("El promedio es: %.2f\n", promedio);
    }
}
