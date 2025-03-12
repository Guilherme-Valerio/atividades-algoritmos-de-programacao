package lista;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma medida em metros para ser transformada:");
        double numero = scanner.nextDouble();
        System.out.println("O valor de " + numero + " em metros é " + (numero * 1000.0) + " mm");
        System.out.println("O valor de " + numero + " em metros é " + (numero * 100.0) + " cm");
        System.out.println("O valor de " + numero + " em metros é " + (numero / 100.0) + " hm");
        System.out.println("O valor de " + numero + " em metros é " + (numero / 1000.0) + " km");
    }
}
