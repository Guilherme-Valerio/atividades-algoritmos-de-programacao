package lista;

import java.text.NumberFormat;
import java.util.Scanner;

public class ex16_desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos cigarros fuma por dia?");
        int cigarrosDia = scanner.nextInt();
        System.out.println("Por quantos anos fumou?");
        double anos = scanner.nextInt();
        double valorFinal = anos * 365 * cigarrosDia / 144;
        System.out.printf("Você perdeu %.2f dias de vida", valorFinal);
        scanner.close();
    }
}
