package lista;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um número para saber seu antecessor e sucessor:");
        int numero = scanner.nextInt();
        System.out.println("O antecessor de " + numero + " é " + (numero - 1));
        System.out.println("O sucessor é " + numero + " é " + (numero + 1));
    }
}
