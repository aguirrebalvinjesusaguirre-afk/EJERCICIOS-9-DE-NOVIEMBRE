import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double celsius, fahrenheit;
        do {
            System.out.println("\n===== CONVERSION DE TEMPERATURAS =====");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese grados Celsius: ");
                    celsius = entrada.nextDouble();

                    fahrenheit = (celsius * 9 / 5) + 32;

                    System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
                    break;
                case 2:
                    System.out.print("Ingrese grados Fahrenheit: ");
                    fahrenheit = entrada.nextDouble();

                    celsius = (fahrenheit - 32) * 5 / 9;

                    System.out.println("Temperatura en Celsius: " + celsius);
                    break;

                case 3:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        } while (opcion != 3);
        entrada.close();
    }
}