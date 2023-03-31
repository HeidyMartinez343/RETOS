import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String empleado, cliente;
        double precio, totalProducto, total = 0;
        int cantidad, numProductos;
        boolean registro;

        System.out.print("Nombre del empleado: ");
        empleado = sc.nextLine();
        System.out.print("Nombre del cliente: ");
        cliente = sc.nextLine();
        System.out.print("¿El cliente está registrado? (true/false): ");
        registro = sc.nextBoolean();
        System.out.print("Ingrese el número de productos a comprar: ");
        numProductos = sc.nextInt();

        for (int i = 1; i <= numProductos; i++) {
            System.out.println("Producto #" + i);
            System.out.print("Precio del producto: ");
            precio = sc.nextDouble();
            System.out.print("Cantidad del producto: ");
            cantidad = sc.nextInt();
            totalProducto = precio * cantidad;

            if (registro) {
                totalProducto = totalProducto *0;
            }
            System.out.println("Total por producto: " + totalProducto);
            total += totalProducto;
        }
        System.out.println("Total de la compra: " + total); 
        double pago, vuelto;
        System.out.print("Ingrese la cantidad a pagar: ");
        pago = sc.nextDouble();
        if (pago < total) {
            System.out.println("No le alcanza el dinero.");
        } else {
            vuelto = pago - total;
            System.out.println("Vuelto: " + vuelto);
 }
 sc.close();
 empleado.strip();
 cliente.strip();
}
} 