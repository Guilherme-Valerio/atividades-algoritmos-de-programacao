package lista;
import java.text.NumberFormat;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do Funcionário: ");
        String nome = scanner.nextLine();
        System.out.println("Salário: ");
        Double salarioFuncionario = scanner.nextDouble();
        System.out.println("O funcionário " + nome + " tem un salário de " + NumberFormat.getCurrencyInstance().format(salarioFuncionario));
        scanner.close();
    }
}
