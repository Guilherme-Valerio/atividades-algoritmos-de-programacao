package prova;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");
        double temp = scanner.nextDouble();
        System.out.println("Essa temperatura equivale a " + ((temp * 1.8) + 32) + "° Fahrenheit");
    }
}
