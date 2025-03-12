package repeticoes;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		
		double valor = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor: ");
		valor = sc.nextDouble();
		
		System.out.println("Selecione a moeda:\n1. Dólar\n2. Euro\n3. Libra");
		int id = sc.nextInt();
		
		switch(id){
		
		case 1:
			System.out.println("Em dólares, seu valor de R$" + valor + " fica em US$" + valor*0.20);
			break;
		case 2: 
			System.out.println("Em euros, seu valor de R$" + valor + " fica em €" + valor*0.18);
			break;			
		case 3:
			System.out.println("Em dólares, seu valor de R$" + valor + " fica em £" + valor*0.15);
			break;
		}
	}

}
