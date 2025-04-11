package prova;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B:");
        int b = scanner.nextInt();
        System.out.println("Digite o valor de C:");
        int c = scanner.nextInt();
        int delta = (b * b) - (4 * a * c);
        System.out.println("O valor de delta será " + delta);
    }
}
