import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número entero positivo: ");
            numero = scanner.nextInt();
        } while (numero <= 0);

        //Formula de numero perfecto 2^(n-1) x ( 2^n - 1 )


        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) suma += i;
        }

        if (suma == numero) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }
}