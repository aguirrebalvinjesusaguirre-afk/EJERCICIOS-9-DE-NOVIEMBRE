import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota, suma = 0, promedio;
        int cantidad = 0;
        String continuar;

        do {
            System.out.print("Ingrese una nota (0 - 20): ");
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 20) {
                suma += nota;
                cantidad++;
            } else {
                System.out.println("Nota no valida.");
            }

            System.out.print("¿Desea continuar? (S/N): ");
            continuar = entrada.next();

        } while (continuar.equalsIgnoreCase("S"));

        if (cantidad > 0) {
            promedio = suma / cantidad;

            System.out.println("\nCantidad de notas: " + cantidad);
            System.out.println("Suma total: " + suma);
            System.out.printf("Promedio: %.2f%n", promedio);
        } else {
            System.out.println("No se ingresaron notas validas.");
        }

        entrada.close();
    }
}