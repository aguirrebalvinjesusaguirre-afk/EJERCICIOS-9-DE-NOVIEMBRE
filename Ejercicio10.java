import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, continuar;
        double precio, montoTotal = 0;
        int cantidad, totalProductos = 0;
        int registros = 0;
        double promedio;
        do {
            System.out.println("\n===== REGISTRO DE VENTAS =====");
            System.out.print("Nombre del producto: ");
            nombre = entrada.next();
            System.out.print("Precio del producto: S/ ");
            precio = entrada.nextDouble();
            System.out.print("Cantidad vendida: ");
            cantidad = entrada.nextInt();

            if (precio > 0 && cantidad > 0) {
                montoTotal += precio * cantidad;
                totalProductos += cantidad;
                registros++;

                System.out.println("Producto registrado correctamente.");
            } else {
                System.out.println("Precio o cantidad no validos.");
            }
            System.out.print("¿Desea registrar otra venta? (S/N): ");
            continuar = entrada.next();

        } while (continuar.equalsIgnoreCase("S"));
        System.out.println("\n===== RESUMEN DE VENTAS =====");
        System.out.println("Monto total vendido: S/ " + montoTotal);
        System.out.println("Cantidad total de productos vendidos: " + totalProductos);

        if (totalProductos > 0) {
            promedio = montoTotal / totalProductos;
            System.out.printf("Promedio de venta por producto: S/ %.2f%n", promedio);
        } else {
            System.out.println("No se registraron ventas validas.");
        }
        entrada.close();
    }
}














