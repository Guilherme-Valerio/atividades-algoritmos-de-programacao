package prova;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da base do triângulo isóceles:");
        double base = scanner.nextDouble();
        System.out.println("Digite o valor da altura:");
        double altura = scanner.nextDouble();
        System.out.println("A área do triângulo será " + (base * altura) / 2 );
    }
}
