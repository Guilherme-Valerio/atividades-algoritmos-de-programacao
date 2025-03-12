package lista;
import java.text.NumberFormat;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Qual o valor de seu produto?");
        Double produto = scanner.nextDouble();
        System.out.println("Parabéns, você conseguiu um desconto de 5%, e o valor do produto ficou " + NumberFormat.getCurrencyInstance().format(produto * 0.95));
    }
}
