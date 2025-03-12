package prova;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit:");
        double temp = scanner.nextDouble();
        System.out.println("Essa temperatura equivale a " + (temp - 32) * 5/9 + "° Celsius");
    }
}
