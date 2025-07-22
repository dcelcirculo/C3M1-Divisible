import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int number = 0;
        boolean validator = false;

        do {
            System.out.print("Ingrese el número: ");
            if (entrada.hasNextInt()) {
                number = entrada.nextInt();
                validator = true;
            } else {
                System.out.println("Entrada inválida. ");
            }
        } while (!validator);

        if (number % 2 == 0 && number % 7 == 0) {
            System.out.printf("El número %d, es divisible por 2 y por 7.\n", number);
        } else {
            System.out.printf("El número %d, no es divisible por 2 y por 7.\n", number);
        }

    }
}
