package estruturasCondicionais;

import java.util.Scanner;

public class Compras {

	public static void main(String[] args) {
		double compra;
		double valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da compra:");
		valor = sc.nextDouble();
		
		System.out.println("Selecione o método de pagamento\n1. Dinheiro/PIX\n2. Débito\n3. Crédito");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:			
			compra = valor *0.9;
			
			System.out.println("Sua compra com 10% de desconto fica em " + compra + " reais");
			break;
		case 2:
			compra = valor *0.95;
			
			System.out.println("Sua compra com 5% de desconto fica em " + compra + " reais");
			break;
		case 3:
			System.out.println("Parcelamento:\n1. A vista\n2. 2X\n3. 3X");
			int opcao2 = sc.nextInt();
			
			switch(opcao2) {
			case 1:
				System.out.println("Sua compra fica em " + valor + " reais");
				break;
			case 2:
				compra = valor *1.05;
				System.out.println("Sua compra com 5% de juros fica em " + compra + " reais");
				break;
			case 3:
				compra = valor *1.1;
				System.out.println("Sua compra com 10% de juros fica em " + compra + " reais");
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
		
		
		
		
		}

}
