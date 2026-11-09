
import java.util.Scanner;

public class InstruccionDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int respuesta = 0;

        do {
            System.out.println("1) Opcion A");
            System.out.println("2) Opcion B");
            System.out.println("3) Salir");

            System.out.print("Elija una opcion: ");
            respuesta = entrada.nextInt();

            System.out.println("Elegiste la opcion " + respuesta);
            System.out.println();

        } while (respuesta != 3);

        System.out.println("Adios!");

        entrada.close();
    }
}
