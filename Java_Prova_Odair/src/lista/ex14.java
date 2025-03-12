package lista;
import java.text.NumberFormat;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Quantos KM foram rodados?");
        Double km = scanner.nextDouble();
        System.out.println("Por quantos dias o carro foi utilizado?");
        int dias = scanner.nextInt();
        Double valorFinal = (90 * dias) + (0.2 * km);
        System.out.println("O valor final a ser pago é " + NumberFormat.getCurrencyInstance().format(valorFinal));
    }
}
