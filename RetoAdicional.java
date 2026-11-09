import java.util.Scanner;

public class RetoAdicional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad;
        int cantidad = 0;
        int suma = 0;
        int mayor = 0;
        int menor = 0;
        int mayoresEdad = 0;
        double promedio;

        String continuar;

        do {
            System.out.print("Ingrese la edad de la persona: ");
            edad = entrada.nextInt();

            if (edad >= 0) {
                suma += edad;
                cantidad++;

                if (cantidad == 1) {
                    mayor = edad;
                    menor = edad;
                } else {
                    if (edad > mayor) {
                        mayor = edad;
                    }

                    if (edad < menor) {
                        menor = edad;
                    }
                }

                if (edad >= 18) {
                    mayoresEdad++;
                }

            } else {
                System.out.println("Edad no valida.");
            }

            System.out.print("¿Desea continuar encuestando? (S/N): ");
            continuar = entrada.next();

        } while (continuar.equalsIgnoreCase("S"));

        if (cantidad > 0) {
            promedio = (double) suma / cantidad;

            System.out.println("\n===== RESULTADOS DE LA ENCUESTA =====");
            System.out.println("Cantidad de personas encuestadas: " + cantidad);
            System.out.printf("Promedio de edad: %.2f%n", promedio);
            System.out.println("Edad mayor: " + mayor);
            System.out.println("Edad menor: " + menor);
            System.out.println("Cantidad de mayores de edad: " + mayoresEdad);
        } else {
            System.out.println("No se registraron edades validas.");
        }

        entrada.close();
    }
}