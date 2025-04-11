package lista;
import java.text.NumberFormat;
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Quantos dias o funcionario trabalhou esse mês?");
        int diasTrabalhados = scanner.nextInt();
        int salario = diasTrabalhados * 8 * 25;
        System.out.println("O funcionário ganha " + NumberFormat.getCurrencyInstance().format(salario));
    }
}
