package ativPoo;

public class Roupa {
	
    String marca;
    String tipo;
    String tamanho;
    int qtd;
    double valor;

    public Roupa(String marca, String tipo, String tamanho, int qtd, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.qtd = qtd;
        this.valor = valor;
    }

    public double total() {
        return qtd * valor;
        
    }

    public void adicionarEstoque(int qtd) {
        qtd += qtd;
    }

    public void removerEstoque(int qtd) {
        if (qtd <= qtd) {
            qtd -= qtd;
            
        } else {
        	
            System.out.println("quantidade insuficiente em estoque!");
        }
    }

    public void exibirInformacoes() {
    	System.out.println("-----------------");
        System.out.println("marca: " + marca);
        System.out.println("tipo: " + tipo);
        System.out.println("tamanho: " + tamanho);
        System.out.println("qtd: " + qtd);
        System.out.println("valor: " + valor);
        System.out.println("total em estoque: " + total());
        
    }
}
