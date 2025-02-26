import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o capital inicial: R$ ");
        double capitalInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxaJuros = scanner.nextDouble() / 100;

        System.out.print("Digite o tempo (em meses): ");
        int tempo = scanner.nextInt();

        double jurosSimples = capitalInicial * taxaJuros * tempo;
        double montanteTotal = capitalInicial + jurosSimples;

        System.out.printf("Juros simples: R$ %.2f%n", jurosSimples);
        System.out.printf("Montante total: R$ %.2f%n", montanteTotal);

        scanner.close();
    }
}
