import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = scanner.nextInt();

            int soma = numero1 + numero2;
            int subtracao = numero1 - numero2;
            int multiplicacao = numero1 * numero2;

            if (numero2 != 0) {
                double divisao = (double) numero1 / numero2;
                System.out.printf("A divisão de %d por %d é %.2f%n", numero1, numero2, divisao);
            } else {
                System.out.println("Não é possível dividir por zero.");
            }

            System.out.printf("A soma de %d e %d é %d%n", numero1, numero2, soma);
            System.out.printf("A subtração de %d e %d é %d%n", numero1, numero2, subtracao);
            System.out.printf("A multiplicação de %d e %d é %d%n", numero1, numero2, multiplicacao);

        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, digite apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }
}
