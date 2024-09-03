import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! Por favor, digite um número inteiro positivo.");
        } else {

            long fatorial = 1; 

            int i = numero; 
            while (i > 0) {
                fatorial *= i; 
                i--; 
            }

            System.out.printf("O fatorial de %d é: %d%n", numero, fatorial);
        }

        scanner.close();
    }
}
