package prova;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor qualquer:");
        double numero = scanner.nextDouble();
        System.out.println("O valor digitado ao quadrado é " + (numero * numero) + " e ao cubo é " + ( numero * numero * numero));
    }
}
