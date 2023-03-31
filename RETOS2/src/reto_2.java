
import java.util.Scanner;
 public class reto_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el número de competidores: ");
        int numCompetidores = input.nextInt();
        String[] nombres = new String[numCompetidores];
        double[] tiempos = new double[numCompetidores];
        for (int i = 0; i < numCompetidores; i++) {
            System.out.print("Ingrese el nombre del competidor: ");
            nombres[i] = input.next();

            System.out.print("Ingrese el tiempo del competidor en segundos: ");
            tiempos[i] = input.nextDouble();
        }
        System.out.println("\nNadadores y tiempos:");
        for (int i = 0; i < numCompetidores; i++) {
            System.out.println(nombres[i] + ": " + tiempos[i] + " segundos");
        }
        String ganador = nombres[0];
        double mejorTiempo = tiempos[0];
        for (int i = 1; i < numCompetidores; i++) {
            if (tiempos[i] < mejorTiempo) {
                ganador = nombres[i];
                mejorTiempo = tiempos[i];
            }
        }

        System.out.println("\nEl ganador es " + ganador + " con un tiempo de " + mejorTiempo + " segundos.");

        input.close();
}
}
