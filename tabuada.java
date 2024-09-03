import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        int i = 1;
        while (i <= 10) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d%n", numero, i, resultado);
            i++; 
        }

        scanner.close();
    }
}
