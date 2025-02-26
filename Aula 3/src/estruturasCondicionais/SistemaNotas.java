package estruturasCondicionais;

import java.util.Scanner;

public class SistemaNotas {

	public static void main (String[]args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Insira a primeira nota: ");
	double nota1 = sc.nextDouble();
	
	System.out.println("Insira a segunda nota: ");
	double nota2 = sc.nextDouble();
	
	double media = (nota1 + nota2)/2;
	
	System.out.println("Sua média é: " + media);
	
	if (media >= 7) {
		System.out.println("Aprovado!");	
	}
	else if(media <5){
		System.out.println("Reprovado.");
	}
	else {
		System.out.println("Recuperação... Insira a nota tirada na recuperação");
		double rec = sc.nextDouble();
		
		double nota3 = (media + rec) /2;
		
		System.out.println("Sua nova média é: " + media);
		
		if (nota3 >= 7 ) {
			System.out.println("Aprovado!");
		}
		else {
			System.out.println("Reprovado.");
		}
		
	}
	
	sc.close();
	}
}
