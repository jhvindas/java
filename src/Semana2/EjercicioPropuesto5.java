package Semana2;

import generico.Utils;

public class EjercicioPropuesto5 {
    public static void main(String[] args) {
        
        double limonada = 4.5;
        //double costo = 5.50;
        double gananciaTotal;

        //Paco recibe el 30%
        //Luis recibe el 30%
        //Hugo recibe el 40%

        Utils.limpiarConsola();

        int totalLimonadas = Utils.leerEntero("Digite la cantidad total de limonadas vendidas: ");

        gananciaTotal = totalLimonadas * limonada;

        double gananciaPaco = gananciaTotal * 0.30;
        double gananciaLuis = gananciaTotal * 0.30;
        double gananciaHugo = gananciaTotal * 0.40;

        System.out.println("Las ganancias para Hugo son de " + gananciaHugo + " colones" + " , las ganancias para Paco son de " + gananciaPaco + " colones" + " y las ganancias para Luis son de " + gananciaLuis + " colones");
    }
    
}
