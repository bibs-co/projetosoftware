package repeticoes;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do empréstimo: R$ ");
        double valorEmprestimo = scanner.nextDouble();

        System.out.print("Informe o número de parcelas (6, 12 ou 24 meses): ");
        int parcelas = scanner.nextInt();

        double valorFinal;

        switch (parcelas) {
            case 6:
                valorFinal = valorEmprestimo * 1.05;
                break;
            case 12:
                valorFinal = valorEmprestimo * 1.10;
                break;
            case 24:
                valorFinal = valorEmprestimo * 1.20;
                break;
            default:
                valorFinal = 0;
                System.out.println("Número de parcelas inválido! Escolha entre 6, 12 ou 24 meses.");
        }

        if (valorFinal > 0) {
            System.out.printf("O valor final a ser pago em %d meses é: R$ %.2f\n", parcelas, valorFinal);
        }

        scanner.close();
    }
}
