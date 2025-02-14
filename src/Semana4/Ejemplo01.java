package Semana4;

import generico.Utils;

public class Ejemplo01 {
    public static void main(String[] args) {

        Utils.limpiarConsola();

        int cantidadComprasAnteriores;
        double montoActualCompra, montoDescuento = 0, montoTotalFinal;

        cantidadComprasAnteriores = Utils.leerEntero("Digite la cantidad de compras anteriores: ");
        montoActualCompra = Utils.leerDoble("Digite la cantidad de la compra actual: ");

        if (cantidadComprasAnteriores >= 6 && montoActualCompra >= 10000 ) {
            montoDescuento = montoActualCompra * 0.35;
        }

        montoTotalFinal = montoActualCompra - montoDescuento;

        System.out.println("DETALLE DE LA FACTURA");
        System.out.printf("%-15s %12.2f\n", "Monto original", montoActualCompra);
        System.out.printf("%-15s %12.2f\n", "Monto descuento", montoDescuento);
        System.out.printf("%-15s %12.2f\n", "Monto final", montoTotalFinal);
    }
}
