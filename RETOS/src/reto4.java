import java.util.Scanner;
public class reto4 {
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
    System.out.print("¿piedra , papel o tijera? (1 = piedra , 2 = papel , 3 = tijera): ");
    int seleccionJugador = scanner.nextInt();
    if (seleccionJugador == resultado) {
      System.out.println("¡Felicidades, " + nombreJugador + "! Ganaste " + apuesta + " pesos.");
    } else {
      System.out.println("Lo siento, " + nombreJugador + ", perdiste " + apuesta + " pesos.");
    }
    scanner.close();
  }
} 
    

