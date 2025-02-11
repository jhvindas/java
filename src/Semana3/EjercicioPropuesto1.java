package Semana3;

import generico.Utils;

public class EjercicioPropuesto1 {
    public static void main(String[] args) {
        
        Utils.limpiarConsola();

        double tempraturaPersona;

        tempraturaPersona = Utils.leerDoble("Digite la temperatura de la persona: ");

        if (tempraturaPersona > 37) {
            System.out.println("La temperatura de la persona es de " + tempraturaPersona + " grados, esto indica que tiene fiebre.");
        } else {
            System.out.println("La temperatura de la persona es de " + tempraturaPersona + " grados, esto indica que no tiene fiebre.");
        }
    }
}
