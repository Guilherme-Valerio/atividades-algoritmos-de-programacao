package lista;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        imprime();
        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite um outro inteiro: ");
        int n2 = scanner.nextInt();
        System.out.println("A soma dos números " + n1 + " + " + n2 + " = " + (n1+n2));
        scanner.close();
    }

    public static void imprime(){
        System.out.println("Bem vindo ao Java!");
    }
}
