package repeticoes;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
			int maquina =(int) (Math.random() *10);
			int usuario;

			do {
				System.out.println("Informe um número: ");
				usuario = sc.nextInt();
				
				if(usuario != maquina) {
					System.out.println("Errou!");				
				}
				
			}while(usuario != maquina);
			
			System.out.println("Parabéns!");
			
			sc.close();

		}
}


