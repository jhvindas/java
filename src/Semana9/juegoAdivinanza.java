package Semana9;

import generico.Utils;

public class juegoAdivinanza {
    public static void main(String[] args) {
        
        Utils.limpiarConsola();
        
        // Generar un número aleatorio entre 1 y 100.
        int numeroAleatorio = (int) (Math.random() * 100) + 1;

        // Variables
        int intentosMaximos = 5;
        int intentosRealizados = 0;
        int suposicion = -1;

        // Intro
        System.out.println("Bienvenido al juego de adivinar el número!");
        System.out.println("He escogido un número entre 1 y 100.");
        System.out.println("Tienes un máximo de " + intentosMaximos + " intentos para adivinarlo.");

        // Gestion de intentos del usuario
        while (intentosRealizados < intentosMaximos && suposicion != numeroAleatorio) {

            // Entrada del usuario
            suposicion = Utils.leerEntero("Introduce tu suposición (escribe un número): ");

            intentosRealizados++;

            if (suposicion == numeroAleatorio) {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentosRealizados + " intentos.");
            } else if (suposicion < numeroAleatorio) {
                System.out.println("El número que buscas es mayor.");
            } else {
                System.out.println("El número que buscas es menor.");
            }
        }

        // Mensaje al final del juego
        if (suposicion != numeroAleatorio) {
            System.out.println("Lo siento! Se agotaron sus intentos. El número era: " + numeroAleatorio);
        }
    }
}
