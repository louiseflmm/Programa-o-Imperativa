import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);

        System.out.println("Números pares entre " + menor + " e " + maior + ":");
        for (int i = menor; i <= maior; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("Números ímpares entre " + menor + " e " + maior + ":");
        for (int i = menor; i <= maior; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
