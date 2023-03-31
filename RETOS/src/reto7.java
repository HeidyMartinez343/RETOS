import java.util.Scanner;
import java.util.Random;

public class reto7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int numJuegos = 0;
        int dinero;
        boolean puedeJugar = true;
        System.out.println("con cuanto dinero cuenta");
        dinero=sc.nextInt();
        
        while (puedeJugar) {
            System.out.println("\nTienes $" + dinero + " en tu cuenta.");
            System.out.print("¿Cuánto desea apostar? (0 para salir): $");
            int apuesta = sc.nextInt();
            
            if (apuesta ==0) {
                System.out.println("Gracias por jugar!  jugaste " + numJuegos + " veces y  gano $" + dinero + ".");
                puedeJugar = false;
            } else if (apuesta > dinero) {
                System.out.println("no tienes suficiente dinero para jugar.");
            } else {
                numJuegos++;
                
                System.out.print("seleccione una opcion  1 piedra , 2 papel  o 3 tijera : ");
                int jugador = sc.nextInt();
                
                int maquina = rnd.nextInt(3) + 1;
                
                System.out.println("La máquina elige: " + opcionToString(maquina));
                
                if (jugador == maquina) {
                    System.out.println("Empate!");
                } else if ((jugador == 1 && maquina == 3) || (jugador == 2 && maquina == 1) || (jugador == 3 && maquina == 2)) {
                    System.out.println("¡Ganaste $" + apuesta + "!");
                    dinero += apuesta;
                } else {
                    System.out.println("perdiste.");
                    dinero -= apuesta;
                    
                    if (dinero <= 0) {
                        System.out.println("ya no tienes dinero para seguir jugando.");
                        System.out.println("jugaste  " + numJuegos + " veces y has perdido todo tu dinero.");
                        puedeJugar = false;
                    } else if (numJuegos == 3) {
                        System.out.println("Ya has jugado tres veces. Gracias por jugar! Has ganado $" + dinero + ".");
                        puedeJugar = false;
                    }
                }
            }
        }
        sc.close();
    }
    
    public static String opcionToString(int opcion) {
        if (opcion == 1) {
            return "piedra";
        } else if (opcion == 2) {
            return "papel";
        } else {
            return "tijera";
        }

    }
}
