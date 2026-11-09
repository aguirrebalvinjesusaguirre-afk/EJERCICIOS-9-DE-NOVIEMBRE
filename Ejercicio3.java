import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, i = 1;

        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();

        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;

        } while (i <= 12);

        entrada.close();
    }
}