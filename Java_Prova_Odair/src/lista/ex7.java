package lista;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um número para saber seu dobro e terço:");
        double numero = scanner.nextDouble();
        System.out.println("O dobro de " + numero + " é " + (numero * 2));
        System.out.println("A terça parte é " + numero + " é " + (numero / 3));
    }
}
