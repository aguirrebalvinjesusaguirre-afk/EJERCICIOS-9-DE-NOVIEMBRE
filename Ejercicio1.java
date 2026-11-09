import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, suma = 0;

        do {
            System.out.print("Ingrese un numero: ");
            numero = entrada.nextInt();

            if (numero > 0) {
                suma += numero;
            }

        } while (numero >= 0);

        System.out.println("Suma total: " + suma);

        entrada.close();
    }
}