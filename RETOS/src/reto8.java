import java.util.Random;
import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {
        // Generar número aleatorio
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1;

        // Inicializar contador de intentos
        int intentos = 0;

        // Pedir al usuario que adivine el número
        Scanner scanner = new Scanner(System.in);
        while (intentos < 10) {
            intentos++;
            System.out.print("Introduce un número del 1 al 100: ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroAdivinar) {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                break;
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor.");
            } else {
                System.out.println("El número a adivinar es menor.");
            }
        }

        // Si no se adivinó el número, mostrar el número a adivinar
        if (intentos == 10) {
            System.out.println("Lo siento, no lograste adivinar el número. El número era " + numeroAdivinar + ".");
        }
        scanner.close();
    }
}
