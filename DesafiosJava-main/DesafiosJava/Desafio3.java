import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota do aluno: ");
        float n1 = scanner.nextFloat();
        
        System.out.println("Digite a segunda nota do aluno: ");
        float n2 = scanner.nextFloat();
        
        System.out.println("Digite a terceira nota do aluno: ");
        float n3 = scanner.nextFloat();
        
        float media = (n1+n2+n3) / 3;
        
        System.out.printf("A media final do aluno é %.1f", media);
        
        scanner.close();
    }
}