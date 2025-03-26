public class AdivinaElNumeroSinImport {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 100 usando Math.random()
        int numeroAleatorio = (int) (Math.random() * 100) + 1;

        // Configuración inicial
        int intentosMaximos = 5;
        int intentosRealizados = 0;
        int suposicion = -1;

        // Introducción
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He escogido un número entre 1 y 100.");
        System.out.println("Tienes un máximo de " + intentosMaximos + " intentos para adivinarlo.");

        // Bucle para gestionar los intentos del usuario
        while (intentosRealizados < intentosMaximos && suposicion != numeroAleatorio) {
            System.out.print("Introduce tu suposición (escribe un número): ");

            // Leer entrada manualmente sin Scanner
            suposicion = leerNumeroDesdeTeclado();

            intentosRealizados++;

            if (suposicion == numeroAleatorio) {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentosRealizados + " intentos.");
            } else if (suposicion < numeroAleatorio) {
                System.out.println("El número que buscas es mayor.");
            } else {
                System.out.println("El número que buscas es menor.");
            }
        }

        // Mensaje al final del juego
        if (suposicion != numeroAleatorio) {
            System.out.println("¡Lo siento! Has agotado tus intentos. El número era: " + numeroAleatorio);
        }
    }

    // Método para leer entrada desde el teclado sin usar Scanner
    private static int leerNumeroDesdeTeclado() {
        int numero = 0;
        try {
            byte[] buffer = new byte[10]; // Tamaño suficiente para leer un número
            int leidos = System.in.read(buffer); // Leer entrada
            numero = convertirAEntero(buffer, leidos); // Convertir bytes a entero
        } catch (Exception e) {
            System.out.println("Error al leer la entrada. Por favor, intenta de nuevo.");
        }
        return numero;
    }

    // Convertir entrada en bytes a un número entero
    private static int convertirAEntero(byte[] buffer, int longitud) {
        int resultado = 0;
        for (int i = 0; i < longitud - 1; i++) { // Ignorar el salto de línea
            resultado = resultado * 10 + (buffer[i] - '0');
        }
        return resultado;
    }
}
