package lista;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a largura da parede?");
        Double largura = scanner.nextDouble();
        System.out.println("Qual o comprimento da parede?");
        Double comprimento = scanner.nextDouble();
        Double area = largura * comprimento;
        Double litros = area/2.0;
        System.out.println("É necessário " + litros + " litros para preencher uma oparede de " + area + " metros quadrados");
    }
}
