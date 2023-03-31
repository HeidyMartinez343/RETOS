import java.util.Scanner;

public class reto3 {
  public static void main(String[] args) {
    String nombreJugador;
    int apuesta;
    int resultado;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese su nombre: ");
    nombreJugador = scanner.nextLine();

    System.out.print("Ingrese su apuesta: ");
    apuesta = scanner.nextInt();
    if (apuesta < 10000) {
      System.out.println("La apuesta debe ser 10000. Vuelve a intentarlo.");
      return;
    }
    resultado = (int) (Math.random() * 2);
    System.out.print("¿Cara o sello? (1 = cara, 2 = sello): ");
    int seleccionJugador = scanner.nextInt();
    if (seleccionJugador == resultado) {
      System.out.println("¡Felicidades, " + nombreJugador + "! Ganaste " + apuesta + " pesos.");
    } else {
      System.out.println("Lo siento, " + nombreJugador + ", perdiste " + apuesta + " pesos.");
    }
    scanner.close();
  }
}
