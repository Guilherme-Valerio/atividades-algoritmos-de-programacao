package lista;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor de A?");
        Double a = scanner.nextDouble();
        System.out.println("Qual o valor de B?");
        Double b = scanner.nextDouble();
        System.out.println("Qual o valor de C?");
        Double c = scanner.nextDouble();
        Double delta = (b*b - (4 * a * c));
        System.out.println("O valor de Delta é: " + delta);
    }
}
