
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int pares = 0;
        int impares = 0;

        do {
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = entrada.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

        } while (numero != 0);

        System.out.println("\nCantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);

        entrada.close();
    }
}
