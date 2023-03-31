import java.util.Scanner;
public class reto_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de notas a evaluar: ");
        int n = sc.nextInt();
        
        double[] notas = new double[n];
        double totalNotas = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor de la nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            totalNotas += notas[i];
        }
        
        double promedio = totalNotas / n;
        System.out.println("El promedio de notas es: " + promedio);
        
        if (promedio < 3.0) {
            System.out.println("Reprobaste");
        } else if (promedio >= 3.0 && promedio <= 4.0) {
            System.out.println("Pasaste Raspando");
        } else {
            System.out.println("Aprobaste con buenos resultados");
        }
        
        sc.close();
}
}