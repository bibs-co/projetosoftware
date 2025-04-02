package principal;

import java.util.Scanner;

import entidades.Livro;

public class Main {

	public static void main(String[] args) {
		
		Livro culpaDasEstrelas = new Livro();
		culpaDasEstrelas.livro = "A culpa é das estrelas";
		culpaDasEstrelas.autor = "John Green";
		culpaDasEstrelas.quantidade = 100;
		culpaDasEstrelas.valorUni = 40;
		
		Livro quemEVoceAlasca = new Livro();
		quemEVoceAlasca.livro = "Quem é Você, Alasca?";
		quemEVoceAlasca.autor = "John Green";
		quemEVoceAlasca.quantidade = 100;
		quemEVoceAlasca.valorUni = 50;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos livros 'A culpa é das estrelas' foram emprestados? ");
		culpaDasEstrelas.empresta(sc.nextInt());
		
		System.out.println("Quantos livros 'Quem é Você, Alasca?' foram emprestados? ");
		quemEVoceAlasca.empresta(sc.nextInt());
		
		System.out.println("Quantos livros 'A culpa é das estrelas' foram devolvidos? ");
		culpaDasEstrelas.devolve(sc.nextInt());
		
		System.out.println("Quantos livros 'Quem é Você, Alasca?' foram devolvidos? ");
		quemEVoceAlasca.devolve(sc.nextInt());
		
		
		System.out.println(culpaDasEstrelas.exibeInfo());
		System.out.println(quemEVoceAlasca.exibeInfo());
	}

}
