package Semana13;

import generico.Utils;

public class CuotasFijas {


    public static double calcularCuota(double P, double r_anual, int n) {
        double tasaMensual = (r_anual / (12 * 100));
        double cuotaMensual = P * (tasaMensual * Math.pow(1 + tasaMensual, n)) / (Math.pow(1 + tasaMensual, n) -1);
        return cuotaMensual;
    } 

    public static double totalPagar(double cuota, int n) {
        double resultadoPago = cuota * n;
        return resultadoPago;
    } 

    public static double totalInteresesPagados(double totalPagar, double P) {
        double resultadoPago = totalPagar - P;
        return resultadoPago;
    } 

    public static void generarTablaAmortizacion(double P, double r_anual, int n) {
        double tasaMensual = r_anual / (12 * 100);
        double cuotaMensual = P * (tasaMensual * Math.pow(1 + tasaMensual, n)) / (Math.pow(1 + tasaMensual, n) -1);
        double saldo = P;
        double totalIntereses = 0;


        System.out.println("--------------------------------------------------");
        System.out.println("| Mes | Cuota | Amortizacion | Interes |  Saldo  |");
        System.out.println("--------------------------------------------------");

        for (int mes = 1; mes <= n; mes++) {
            double interes = saldo * tasaMensual;
            double amortizacion = cuotaMensual - interes;
            saldo -= amortizacion;

            totalIntereses += interes;

            System.out.printf("| %2d | $%.2f | $%.2f | $%.2f | $%.2f |\n", mes, cuotaMensual, amortizacion, interes, saldo);
        }

        System.out.println("--------------------------------------------------");
        System.out.printf("Total intereses pagados: $%.2f\n", totalIntereses);

    }

    public static boolean validacionDatos(double P, double r_anual, int n) {
        if (P <= 0) {
            System.out.println("El monto del prestamo debe ser mayor a cero (0)");
            return false;
        }
        if (r_anual < 0 || r_anual > 100) {
            System.out.println("La tasa de interes anual debe estar entre 0% y 100%.");
            return false;
        }
        if (n <= 0 || n > 360) {
            System.out.println("El plazo en meses debe ser mayor a cero y no exceder 360 meses.");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
    
    Utils.limpiarConsola();
    double P = Utils.leerDoble("Digite el monto del préstamo: ");
    double r_anual = Utils.leerDoble("Digite la tasa de interés anual: ");
    int n = Utils.leerEntero("Digite el plazo en meses: ");

    if (!validacionDatos(P, r_anual, n)) {
        System.out.println("Los datos de entrada no son validos, por favor revise los valores.");
        return;
    }

    double CuotaMensualFija = calcularCuota(P, r_anual, n);
    double totalAPagar = totalPagar(CuotaMensualFija, n);
    double totalInteresessesPagados = totalInteresesPagados(totalAPagar, P);
    System.out.printf("Cuota mensual fija: %.2f\n", CuotaMensualFija);
    System.out.printf("Total a pagar: %.2f\n", totalAPagar);
    System.out.printf("Total de intereses pagados: %.2f\n", totalInteresessesPagados);

    generarTablaAmortizacion(P, r_anual, n);

    
    }
}
