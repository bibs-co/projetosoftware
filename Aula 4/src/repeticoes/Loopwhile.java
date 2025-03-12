package repeticoes;

import java.util.Scanner;

public class Loopwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String loginSalvo = "admin";
		String senhaSalva = "admin";
		String login = "";
		String senha = "";
		int id = 1;
		
		while(id < 6) {
			
			System.out.println("Digite seu login: ");
			login = sc.nextLine();
			
			System.out.println("Digite sua senha: ");
			senha = sc.nextLine();
			
			if(login.equals(loginSalvo) && senha.equals(senhaSalva)) {
				System.out.println("Acesso liberado");
				break;
			}
			else if(id >5){
				break;				
			}
			else{
				System.out.println("Acesso negado, voce tem mais " + (5 - id) + " tentativas");
				id++;

			}
		}
			
		
		
		sc.close();

	}

}
