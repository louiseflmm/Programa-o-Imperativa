import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário bruto (em R$): ");
        double salarioBruto = scanner.nextDouble();

        double impostoRenda = 0.0;

        if (salarioBruto <= 2640.00) {
            impostoRenda = 0.0;
        } else if (salarioBruto <= 3960.00) {
            impostoRenda = (salarioBruto - 2640.00) * 0.075;
        } else if (salarioBruto <= 7440.00) {
            impostoRenda = (3960.00 - 2640.00) * 0.075 + (salarioBruto - 3960.00) * 0.15;
        } else if (salarioBruto <= 15000.00) {
            impostoRenda = (3960.00 - 2640.00) * 0.075 + (7440.00 - 3960.00) * 0.15 + (salarioBruto - 7440.00) * 0.225;
        } else {
            impostoRenda = (3960.00 - 2640.00) * 0.075 + (7440.00 - 3960.00) * 0.15 + (15000.00 - 7440.00) * 0.225 + (salarioBruto - 15000.00) * 0.275;
        }

        System.out.printf("Valor do imposto de renda retido na fonte: R$ %.2f%n", impostoRenda);

        scanner.close();
    }
}
