package Semana5;

import generico.Utils;

public class CalculadoraBasica {
    public static void main(String[] args) {
        
        Utils.limpiarConsola();

        //Variables
        double numeroUno, numeroDos, resultado;
        String tipoOperador;

        //Entradas y Salidas
        tipoOperador = Utils.leerString("Digite el tipo de operación con el que va a trabajar: (suma, resta, multiplicación o division) ");
        numeroUno = Utils.leerDoble("Digite el primer número a utilizar en la opración: ");
        numeroDos = Utils.leerDoble("Digite el primer número a utilizar en la opración: ");

        //Proceso
        if ("suma".equalsIgnoreCase(tipoOperador)) { // Evalúa si la variable "tipoOperador" es igual al string "suma", sin importar mayúsculas o minúsculas.
            resultado = numeroUno + numeroDos;
        } else  {
            if ("resta".equalsIgnoreCase(tipoOperador)) {
                resultado = numeroUno - numeroDos;
            } else {
                if ("multiplicacion".equalsIgnoreCase(tipoOperador)) {
                    resultado = numeroUno * numeroDos;
                } else {
                    if ("division".equalsIgnoreCase(tipoOperador)) {
                        resultado = numeroUno / numeroDos;
                    } else {
                        Utils.establecerColorRojo();
                        System.out.println("La operación seleccionada no es válida, revise e ingrese los datos de nuevo.");
                        Utils.reiniciarColores();
                        resultado = 0;
                    }
                }
            }
        }

        //Resultado
        Utils.establecerColorVerde();
        System.out.println("El resultado es: " + resultado);
        Utils.reiniciarColores();
    }
}
