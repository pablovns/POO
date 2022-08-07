import javax.swing.*;

public class Atividade8Melhorado {
    public static void main(String[] args) {
        
        Integer menor, maior, aux, total = 0, n = 4;
        Integer[] resistencias = new Integer[n];
        for (int i = 0; i < n; i++) {
            aux = Integer.parseInt(JOptionPane.showInputDialog(String.format("Insira o valor da %dª resistência: ", i+1)));
            total += aux;
            resistencias[i] = aux;
        }
        maior = menor = resistencias[0];
        System.out.println(resistencias);
        for (int i = 0; i < resistencias.length; i++) {
            if (resistencias[i] > maior) {
                maior = resistencias[i];
            }
            if (resistencias[i] < menor) {
                menor = resistencias[i];
            }
        }
        JOptionPane.showMessageDialog(null, String.format(
            "Resistências fornecidas: %d %d %d %d\nResistência equivalente: %d\nMaior resistência: %d\nMenor resistência: %d\n",
            resistencias[0], resistencias[1], resistencias[2], resistencias[3], total, maior, menor
        ));
    }
}
