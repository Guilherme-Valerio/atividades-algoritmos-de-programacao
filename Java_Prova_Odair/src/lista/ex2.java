package lista;
import javax.swing.*;

public class ex2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Seja bem-vindo, vamos conversar");
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String numero = JOptionPane.showInputDialog("Digite um numero");
        Byte num1 = Byte.parseByte(numero);
        Short num2 = Short.parseShort(numero);
        Integer num3 = Integer.parseInt(numero);
        Long num4 = Long.parseLong(numero);
        Float num5 = Float.parseFloat(numero);
        Double num6 = Double.parseDouble(numero);

        JOptionPane.showMessageDialog(null, " Os numeros convertidos sao ? \n  " + num1 + " \n " + num2 + " \n " + num3 + " \n " + num4 + " \n " + num5 + " \n " + num6);
        JOptionPane.showMessageDialog(null, "Bom dia " + nome + ", foi um prazer");
    }
}
