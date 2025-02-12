package Semana3;

import generico.Utils;

public class EjercicioPropuesto14 {
    public static void main(String[] args) {
        
        double horaEntrada;
        double horaSalida;
        double tarifaHora;
        double horaExtra;
        double dineroTotal;
        double dineroTotalExtras;
        double horasTrabajadas;

        //También puedo definir variables así: double horaEntrada, horaSalida, tarifaHora, horaExtra, horasTrabajadas;
        //Puedo simplificar dineroTotal y dineroTotalExtras.

        horaEntrada = Utils.leerDoble("Digite la hora de entrada: ");
        horaSalida = Utils.leerDoble("Digite la hora de salida: ");
        tarifaHora = Utils.leerDoble("Digite la tarifa que se paga por hora: ");

        horaExtra = tarifaHora * 1.5;
        horasTrabajadas = (horaSalida - horaEntrada);
        dineroTotal = horasTrabajadas * tarifaHora;
        dineroTotalExtras = horaExtra * horasTrabajadas;

        if (horasTrabajadas > 8) {
            System.out.println("Felipe trabajó " + horasTrabajadas + " hora/s, y el pago es de $" + dineroTotalExtras);
        } else {
            System.out.println("Felipe trabajó " + horasTrabajadas + " hora/s, y el pago es de $" + dineroTotal);
        }
    }
}
