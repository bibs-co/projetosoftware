package variáveis;

import java.util.Scanner;

public class Desafio1  {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius:");
		double cel = sc.nextDouble();
		
		double fah = (cel * 9/5) + 32;
		double kev = cel + 273.15;
		
		System.out.println("Sua temperatura em Fahrenheit é " + fah + "°");
		System.out.println("Sua temperatura em Kevin é " + kev + "°");
		
		sc.close();

}
}
