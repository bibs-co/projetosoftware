import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o capital inicial: R$ ");
        double capitalInicial = scanner.nextDouble();

        System.out.println("Digite a taxa de juros (em % ao mês): ");
        double taxaJuros = scanner.nextDouble() / 100;

        System.out.println("Digite o número de meses: ");
        int meses = scanner.nextInt();

        double montanteTotal = capitalInicial* Math.pow(1+taxaJuros,meses);

        System.out.printf("O montante total é %.2f", montanteTotal);
        
        scanner.close();
    }

  
}