

import java.util.Scanner;

public class reto_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingresa la cantidad de columnas: ");
        int columnas= scanner.nextInt();
        


        String[][] k = new String[filas][columnas];
        for (int i = 0; i < filas ; i++) {
            for (int l = 0; l < columnas; l++) {
                System.out.print("Ingresa el emoji para [" + i + "][" + l + "]: ");
                k [i][l] = scanner.next();
            }
        }
        
        for (int i = 0; i < filas ; i++) {
            for (int l = 0; l < columnas; l++) {
                System.out.print(k [i][l] + " ");
            }
            System.out.println();
            scanner.close();
 }
}
}