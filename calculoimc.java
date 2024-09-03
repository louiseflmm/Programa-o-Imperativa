import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Você está com peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está obeso.");
        }

        scanner.close();
    }
}
