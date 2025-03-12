package lista;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Double numero = 0.0;
        int cont = 0;
        Double soma = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número positivo para ser feita a média dos" +
                " valores, se quiser para o programa digite um número negativo : ");
        while((numero = scanner.nextDouble()) >= 0.0){
            soma += numero;
            cont ++;
        }
        numero = soma / cont;
        System.out.println("A média dos números passados é " + numero);
    }
}
