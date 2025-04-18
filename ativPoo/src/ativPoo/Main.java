package ativPoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Roupa> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String opc = "";

        while (!opc.equals("n")) {
        	
            System.out.print("marca: ");
            String marca = sc.nextLine();

            System.out.print("tipo: ");
            String tipo = sc.nextLine();

            System.out.print("tamanho: ");
            String tam = sc.nextLine();

            System.out.print("qtd inicial: ");
            int qnt = Integer.parseInt(sc.nextLine());

            System.out.print("valor: ");
            double valor = Double.parseDouble(sc.nextLine());

            Roupa r = new Roupa(marca, tipo, tam, qnt, valor);
            lista.add(r);

            System.out.println("-----------------");
            System.out.print("gostaria de adicionar ou remover no estoque? (s/n): ");
            String mexer = sc.nextLine();

            if (mexer.equals("s")) {
            	System.out.println("-----------------");
                System.out.print("digite 'a' para adicionar e 'r' pra remover: ");
                String acao = sc.nextLine();

                System.out.print("qnt: ");
                int qtd = Integer.parseInt(sc.nextLine());

                if (acao.equals("a")) {
                    r.adicionarEstoque(qtd);
                } else if (acao.equals("remover")) {
                    r.removerEstoque(qtd);
                }
            }

            r.exibirInformacoes();

            System.out.println("-----------------");
            System.out.print("cadastrar outra peça? (s/n): ");
            opc = sc.nextLine();
            
        }

        System.out.println("estoque final:");
        for (Roupa r : lista) {
            r.exibirInformacoes();
        }

        
        sc.close();
    }
    
}

