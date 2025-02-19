package Semana4;

import javax.swing.text.Utilities;

import generico.Utils;

public class EjercicioPropuesto1 {
    public static void main(String[] args) {
        
        int dia, mes, anno, diaSiguiente, mesSiguiente, annoSigueinte, ultimoDia;

        dia = Utils.leerEntero("Digite el dia: ");
        mes = Utils.leerEntero("Digite el mes: ");
        anno = Utils.leerEntero("Digite el ano: ");

        if (mes >= 1 && mes <= 12) {
            if (mes == 12) {
                
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
                ultimoDia = 31;
            } {
                ultimoDia = 30;
        } else {
            //Mes incorrecto
            Utils.establecerColorRojo();
            System.out.println("No se puede determinar la fecha debido a que el mes es incorrecto.");
            Utils.reiniciarColores();
        }


    }
}
