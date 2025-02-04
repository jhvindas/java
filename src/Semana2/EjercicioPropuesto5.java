package Semana2;

import generico.Utils;

public class EjercicioPropuesto5 {
    public static void main(String[] args) {
        
        int limonada = 10;
        //double costo = 5.50;
        double GananciaTotal;

        //Paco recibe el 30%
        //Luis recibe el 30%
        //Hugo recibe el 40%

        int TotalLimonadas = Utils.leerEntero("Digite la cantidad total de limonadas vendidas: ");

        GananciaTotal = TotalLimonadas * limonada;

        double GananciaPaco = GananciaTotal * 0.30;
        double GananciaLuis = GananciaTotal * 0.30;
        double GananciaHugo = GananciaTotal * 0.40;

        System.out.println("Las ganancias para Hugo son de " + GananciaHugo + " colones" + " , las ganancias para Paco son de " + GananciaPaco + " colones" + " y las ganancias para Luis son de " + GananciaLuis + " colones");
    }
    
}