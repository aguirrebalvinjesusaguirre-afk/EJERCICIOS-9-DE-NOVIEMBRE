import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double saldo = 5000;
        double monto;
        int opcion;

        do {
            System.out.println("\n===== CAJERO AUTOMATICO =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es: S/ " + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese monto a retirar: S/ ");
                    monto = entrada.nextDouble();

                    if (monto > 0 && monto <= saldo) {
                        saldo -= monto;
                        System.out.println("Retiro exitoso.");
                        System.out.println("Saldo actual: S/ " + saldo);
                    } else {
                        System.out.println("Monto no valido o saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese monto a depositar: S/ ");
                    monto = entrada.nextDouble();

                    if (monto > 0) {
                        saldo += monto;
                        System.out.println("Deposito exitoso.");
                        System.out.println("Saldo actual: S/ " + saldo);
                    } else {
                        System.out.println("Monto no valido.");
                    }
                    break;

                case 4:
                    System.out.println("Gracias por utilizar el cajero.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 4);

        entrada.close();
    }
}