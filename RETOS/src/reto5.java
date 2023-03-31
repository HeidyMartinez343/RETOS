import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {

        String nombreJugador;
        int apuesta;
        int resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
         nombreJugador = scanner.nextLine();

        int dineroAcumulado = 0;
        int cantidadJuegos = 0;

        do {
            System.out.print("Ingrese su apuesta (debe ser 10000 o más): ");
             apuesta = scanner.nextInt();

            if (apuesta < 10000) {
                System.out.println("La apuesta mínima es de 10000. Vuelve a intentarlo.");
                continue;
            }

            cantidadJuegos++;

             resultado = (int) (Math.random() * 2);

            System.out.print("¿Cara o sello? (0 = cara, 1 = sello): ");
            int eleccionJugador = scanner.nextInt();

            if (eleccionJugador == resultado) {
                int dineroGanado = apuesta;
                dineroAcumulado += dineroGanado;
                System.out.println("¡Felicidades, " + nombreJugador + "! Ganaste " + dineroGanado + " pesos.");
            } else {
                int dineroPerdido = apuesta;
                dineroAcumulado -= dineroPerdido;
                System.out.println("Lo siento, " + nombreJugador + ", perdiste " + dineroPerdido + " pesos.");
            }

            System.out.println("Dinero acumulado: " + dineroAcumulado + " pesos");
            System.out.println("Cantidad de juegos: " + cantidadJuegos);
        } while (dineroAcumulado >= 0);

        System.out.println("¡Gracias por jugar, " + nombreJugador + "! Tu dinero final es: " + dineroAcumulado + " pesos.");
        scanner.close();
    }
}
