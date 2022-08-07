// Pablo Vinicius
import javax.swing.*;

public class Atividade8 {
    public static void main(String[] args) {
        Integer aux, menor, maior, total = 0;
        String res1, res2, res3, res4;
        res1 = JOptionPane.showInputDialog("Insira o valor da 1ª resistência: ");
        aux = Integer.parseInt(res1);
        total += aux;
        menor = aux;
        maior = aux;

        res2 = JOptionPane.showInputDialog("Insira o valor da 2ª resistência: ");
        aux = Integer.parseInt(res2);
        total += aux;
        if (aux < menor) {
            menor = aux;
        }
        if (aux > maior) {
            maior = aux;
        }

        res3 = JOptionPane.showInputDialog("Insira o valor da 3ª resistência: ");
        aux = Integer.parseInt(res3);
        total += aux;
        if (aux < menor) {
            menor = aux;
        }
        if (aux > maior) {
            maior = aux;
        }

        res4 = JOptionPane.showInputDialog("Insira o valor da 4ª resistência: ");
        aux = Integer.parseInt(res4);
        total += aux;
        if (aux < menor) {
            menor = aux;
        }
        if (aux > maior) {
            maior = aux;
        }

        JOptionPane.showMessageDialog(null,
            "Resistências fornecidas: " + res1 + " " +  res2 + " " +  res3 + " " +  res4 + "\n"
            + "Resistência equivalente: " + total + "\n"
            + "Maior resistência: " + maior + "\n"
            + "Menor resistência: " + menor + "\n"
        );
    }
}
