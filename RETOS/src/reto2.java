import java.util.Scanner;
public class reto2 {
    public static void main(String[] args) {
        String nommadre;
        String nombebe;
        int edad;
        double pesobebe;
        String vacuna;
        Scanner lectura=new Scanner (System.in);
        // solicitar datos 
        System.out.print("porfavor ingrese nombre de la madre: ");
        //capturar datos
        nommadre=lectura.nextLine();
        // solicitar datos 
        System.out.print("porfavor ingrese nombre del bebe: ");
        //capturar datos
        nombebe=lectura.nextLine();
         // solicitar datos
         System.out.print("porfavor ingrese nombre de la vacuna: ");
         //capturar datos
         vacuna=lectura.nextLine();
        // solicitar datos 
        System.out.print("porfavor ingrese la edad del bebe: ");
        //capturar datos
        edad=lectura.nextInt();
        // solicitar datos
        System.out.print("porfavor ingrese el peso del bebe: ");
        //capturar datos
        pesobebe=lectura.nextInt();

        // peso
        int numero=10;
        double resultado1;
        resultado1=pesobebe+numero;
        System.out.println(resultado1);

        // meses
        int resultado2;
        resultado2=edad*numero;
        System.out.println(resultado2);

        // dosis
        double resultado3;
        resultado3=resultado1/resultado2;
        System.out.println(resultado3);

        // resultado dosis vacuna
        int numero2=8;
        double resultado4;
        resultado4=resultado3*numero2;
        System.out.println(resultado4);

        lectura.close();
        nommadre.strip();
        nombebe.strip();
        vacuna.strip();
}
}