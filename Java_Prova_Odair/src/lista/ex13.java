package lista;
import java.text.NumberFormat;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Qual o valor de seu salário?");
        Double salario = scanner.nextDouble();
        System.out.println("Parabéns, você conseguiu um aumento de 15%, e o valor do seu salário ficou " + NumberFormat.getCurrencyInstance().format(salario * 1.15));
    }
}
