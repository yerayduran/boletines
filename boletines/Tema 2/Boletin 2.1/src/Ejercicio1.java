import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Introduce un número: ");
        num1 = scanner.nextInt();
        System.out.println("Introduce un número: ");
        num2 = scanner.nextInt();
        System.out.println("Introduce un número: ");
        num3 = scanner.nextInt();

        if (num1 > num2 && num2 > num3){
            System.out.println("El orden menor a mayor es: " + num3 " > " + num2 " > " + num1);
        }
        if (num1 > num3 && num2 > num1){
            System.out.println("El orden menor a mayor es: " + num3 " > " + num2 " > " + num1);
        }
        if (num2 > num1 && num1 > num3){
            System.out.println("El orden menor a mayor es: " + num3 " > " + num1 " > " + num2);
        }
        if (num2 > num3 && num1 > num2){
            System.out.println("El orden menor a mayor es: " + num3 " > " + num2 " > " + num1);
        }

    }
}