package lista;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto você tem na sua carteira em reais? ");
        double numero = scanner.nextDouble();
        if (numero > 0) {
            NumberFormat formatoDolar = NumberFormat.getCurrencyInstance(Locale.US);

            Double valorDolar = numero * 5.35;
            System.out.printf("O valor de " + NumberFormat.getCurrencyInstance().format(numero) + " em dólares é " + formatoDolar.format(valorDolar));
        } else {
            System.out.println("O valor deve ser maior que 0");
        }
    }
}
