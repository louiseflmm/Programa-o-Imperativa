import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário bruto (em R$): ");
        double salarioBruto = scanner.nextDouble();

        double contribuicaoINSS = 0.0;
        double salarioLiquido = salarioBruto;

        if (salarioBruto <= 1320.00) {
            contribuicaoINSS = salarioBruto * 0.075;
        } else if (salarioBruto <= 2640.00) {
            contribuicaoINSS = (1320.00 * 0.075) + ((salarioBruto - 1320.00) * 0.09);
        } else if (salarioBruto <= 3960.00) {
            contribuicaoINSS = (1320.00 * 0.075) + ((1320.00) * 0.09) + ((salarioBruto - 2640.00) * 0.12);
        } else {
            contribuicaoINSS = (1320.00 * 0.075) + (1320.00 * 0.09) + (1320.00 * 0.12) + ((salarioBruto - 3960.00) * 0.14);
        }

        salarioLiquido = salarioBruto - contribuicaoINSS;

        System.out.printf("Valor da contribuição ao INSS: R$ %.2f%n", contribuicaoINSS);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}
