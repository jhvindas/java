package Semana4;

import generico.Utils;

public class EjercicioPropuesto5 {
    public static void main(String[] args) {

        Utils.limpiarConsola();
        
        double edadAproxPiedra;

        edadAproxPiedra = Utils.leerDoble("Digite la edad aproximada de la piedra: ");

        if (edadAproxPiedra < 65.5) {
            System.out.println("La piedra pertenece a la era Cenozoica");
        } else {
            if (edadAproxPiedra < 251) {
                System.out.println("La piedra pertenece a la era Mesozoica");
            } else {
                if (edadAproxPiedra < 542) {
                    System.out.println("La piedra pertenece a la era Paleozoica");
                } else {
                    if (edadAproxPiedra >= 542) {
                        System.out.println("La piedra pertenece a la era Pre-paleozoica");
                    }
                }
            }
        }

    }
}
