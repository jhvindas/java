package Semana2;

import generico.Utils;

public class EjercicioPropuesto1 {
    public static void main(String[] args) {
        
        int precio = 0;
        String producto;
        double iva = 0.13;
        double precioFinal = 0;

        Utils.limpiarConsola();

        producto = Utils.leerString("Digite el nombre del producto: ");
        precio = Utils.leerEntero("Digite el precio del producto: ");

        precioFinal = precio + (precio * iva);

        System.out.println("El precio de " + producto + " con IVA incluído es de " + precioFinal);
    }
}
