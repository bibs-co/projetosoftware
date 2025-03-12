/**
 * 
 */
package repeticoes;

import java.util.Scanner;

/**
 * 
 */
public class Loopdowhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int maquina =(int) (Math.random() *10);
		int usuario;

		do {
			System.out.println("Informe um número: ");
			usuario = sc.nextInt();
			
			if(usuario > maquina) {
				System.out.println("Errou, é menor");				
			}
			else if(usuario<maquina) {
				System.out.println("Errou, é maior");				
			}
			
		}while(usuario != maquina);
		
		System.out.println("Parabéns!");
		
		sc.close();

	}

}
