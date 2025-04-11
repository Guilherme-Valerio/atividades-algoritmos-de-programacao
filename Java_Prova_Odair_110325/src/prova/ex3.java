package prova;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é " + imc);
        if (imc <= 18.5){
            System.out.println("Você está abaixo do normal");
        } else if (imc <= 24.9) {
            System.out.println("Você está normal");
        } else if (imc <= 29.9) {
            System.out.println("Você está com sobrepeso");
        } else if (imc <= 34.9) {
            System.out.println("Você está com obesidade grau 1");
        } else if (imc <= 39.9) {
            System.out.println("Você está com obesidade grau 2");
        } else {
            System.out.println("Você está com obesidade grau 3");
        }
    }
}
