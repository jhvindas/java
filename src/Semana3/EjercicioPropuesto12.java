package Semana3;

import generico.Utils;

public class EjercicioPropuesto12 {
    public static void main(String[] args) {
        
        int golesHugo;
        int golesPaco;
        int golesLuis;
        int equipoHugo;
        int equipoPacoLuis;

        golesHugo = Utils.leerEntero("Digite la cantidad de goles que anotó Hugo: ");
        golesPaco = Utils.leerEntero("Digite la cantidad de goles que anotó Paco: ");
        golesLuis = Utils.leerEntero("Digite la cantidad de goles que anotó Luis: ");
        
        equipoHugo = golesHugo;
        equipoPacoLuis = golesPaco + golesLuis;

        if (equipoHugo > equipoPacoLuis) {
            System.out.println("El equipo de Hugo hizo " + equipoHugo + " goles, por lo tanto es el ganador.");
        } else {
            System.out.println("El equipo de Paco y Luis hizo " + equipoPacoLuis + " goles, por lo tanto es el ganador.");
        }
    }
}
