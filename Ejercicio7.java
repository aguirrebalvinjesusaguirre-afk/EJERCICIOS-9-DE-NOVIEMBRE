
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int base, exponente, i = 1;
        int resultado = 1;

        System.out.print("Ingrese la base: ");
        base = entrada.nextInt();

        System.out.print("Ingrese el exponente positivo: ");
        exponente = entrada.nextInt();

        if (exponente > 0) {
            do {
                resultado = resultado * base;
                i++;

            } while (i <= exponente);

            System.out.println("Resultado: " + resultado);

        } else {
            System.out.println("El exponente debe ser positivo.");
        }

        entrada.close();
    }
}
