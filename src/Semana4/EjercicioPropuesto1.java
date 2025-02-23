package Semana4;

import generico.Utils;

public class EjercicioPropuesto1 {
    public static void main(String[] args) {
        
        int dia, mes, anno, diaSiguiente, mesSiguiente, annoSigueinte, ultimoDia;

        Utils.limpiarConsola();

        dia = Utils.leerEntero("Digite el dia: ");
        mes = Utils.leerEntero("Digite el mes: ");
        anno = Utils.leerEntero("Digite el año: ");

        if (mes >= 1 && mes <= 12) {
            if (mes == 2) {
                ultimoDia = 28;
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
                ultimoDia = 31;
            } else {
                ultimoDia = 30;
        } 
            if (dia >= 1 && dia <= ultimoDia) {
                // Dia correcto
                if (dia == ultimoDia) {
                    if (mes == 12) {
                        diaSiguiente = 1;
                        mesSiguiente = 1;
                        annoSigueinte = anno + 1;
                    } else {
                        diaSiguiente = 1;
                        mesSiguiente = mes + 1;
                        annoSigueinte = anno;
                    }
                } else {
                    diaSiguiente = dia +1;
                    mesSiguiente = mes;
                    annoSigueinte = anno;
                }
                Utils.establecerColorVerde();
                System.out.printf("Siguiente fecha es: %02d/%02d/%4d\n", diaSiguiente, mesSiguiente, annoSigueinte);
                Utils.reiniciarColores();
            } else {
                //Dia incorrecto / Error.
                Utils.establecerColorRojo();
                System.out.println("No se puede determinar la fecha, debido a que el dia es incorrecto.");
                Utils.reiniciarColores();
            }
        } else {
            //Mes incorrecto
            Utils.establecerColorRojo();
            System.out.println("No se puede determinar la fecha debido a que el mes es incorrecto.");
            Utils.reiniciarColores();
        }
    }
}
