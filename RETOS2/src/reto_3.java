
import java.util.Scanner;

public class reto_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[][] productos = new String[16][2];
        int opcion;
        
        do {
            System.out.println("Ingrese una opción:");
            System.out.println("1. Llenar la máquina");
            System.out.println("2. Mostrar catálogo");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    llenarMaquina(productos, sc);
                    break;
                case 2:
                    mostrarCatalogo(productos);
                    break;
                case 0:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
        
        sc.close();
    }
    
    public static void llenarMaquina(String[][] productos, Scanner sc) {
        System.out.println("Llenando la máquina.");
        for (int i = 0; i < productos.length; i++) {
            System.out.print("Ingrese el nombre del producto " + (i+1) + ": ");
            String nombre = sc.next();
            System.out.print("Ingrese el precio del producto " + (i+1) + ": ");
            String precio = sc.next();
            productos[i][0] = nombre;
            productos[i][1] = precio;
        }
    }
    
    public static void mostrarCatalogo(String[][] productos) {
        System.out.println("Catálogo de productos:");
        System.out.println("Código\tNombre\t\tPrecio");
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i+1) + "\t" + productos[i][0] + "\t\t" + productos[i][1]);
}
}
}