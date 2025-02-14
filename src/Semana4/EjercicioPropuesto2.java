package Semana4;

import generico.Utils;

public class EjercicioPropuesto2 {
    public static void main(String[] args) {
        
        Utils.limpiarConsola();

        double ladoA, ladoB, ladoC;

        ladoA = Utils.leerDoble("Digite cuánto miden los tres lados del triángulo: ");
        ladoB = Utils.leerDoble("Digite cuánto miden los tres lados del triángulo: ");
        ladoC = Utils.leerDoble("Digite cuánto miden los tres lados del triángulo: "); 

        if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)) {
            System.out.println("Este es un triángulo");
        } else {
            System.out.println("Este no es un triángulo");
        }

    }
}
