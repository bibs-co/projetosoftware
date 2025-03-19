package repeticoes;

import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Progama que calcula fatorial de um número positivo");
        
        long fat = 1;
        System.out.print("Digite um número positivo: ");
        int num = scanner.nextInt();
          
        if (num >  0) {
          for (int i = 1; i <= num; i++) {
            fat *=i;
          }
          System.out.print("O número " + num + " tem o fatorial " + fat);
        } else {
          System.out.print("Por favor digite um número positivo");
        }
        
        scanner.close();
    }
}