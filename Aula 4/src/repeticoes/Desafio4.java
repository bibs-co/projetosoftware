package repeticoes;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema que calcula médias");
        int soma = 0;
        int i = 0;
        int num = 0;
        
        do{
          System.out.print("Digite um número: ");
          num = scanner.nextInt();
          
          soma += num;
          i++;
        } while (num != 0);
        
        double media = soma / i;
        System.out.print("A média de todos os valores digitados antes de 0 é de " + media);
        
        scanner.close();
    }
}