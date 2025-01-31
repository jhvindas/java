import generico.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        String nombre;

        Utils.limpiarConsola();

        nombre = Utils.leerString("Digite su nombre: ");
        System.out.println("Su nombre es: " + nombre);
    }
}
