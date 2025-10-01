import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce un número entero: ");
        int num = scanner.nextInt();


        if (num < 2) {
            System.out.println(num + " no es primo.");
        } else {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(num + " es primo.");
            } else {
                System.out.println(num + " no es primo.");
            }
        }
    }
}