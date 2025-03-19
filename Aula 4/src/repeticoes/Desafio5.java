package repeticoes;

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa de soma de números pares e impares");
        
        int par = 0;
        int imp = 0;
        int num = 1;
        
        while (num != 0) {
          System.out.print("Digite um número; ");
          num = scanner.nextInt();
          
          if (num % 2 == 0) {
            System.out.println("O número " + num + " é par");
            par += num;
          }
          else {
            System.out.println("O número " + num + " é impar");
            imp += num;
          }
        } 
        
        System.out.print("A soma dos números pares digitados antes de 0 é " + par + " e dos imapares é " + imp);
        
        scanner.close();
    }
}
