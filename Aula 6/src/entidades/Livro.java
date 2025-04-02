package entidades;

public class Livro {
	
	public String livro;
	public String autor;
	public int quantidade;
	public double valorUni;
	
	public String exibeInfo() {
		return "Livro: " + livro + 
				"\nAutor: " + autor + 
				"\nQuantidade: " + quantidade + 
				"\nValor: " + valorUni + "\n";
	}
	
	public void empresta(int quantidade) {
		this.quantidade -= quantidade;
		
	}
	
	public void devolve(int quantidade) {
		this.quantidade += quantidade;
		
	}
}
