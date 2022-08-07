// Alunos: Pablo Vinicius e Vitor Matheus

import javax.swing.JOptionPane;

public class atividade1_3 {
    public static void main(String[] args) {
        Boolean[] assentos = {false, false, false, false, false, false, false, false, false, false};
        String[] opcoes = {"1 - Primeira Classe", "2 - Classe Econômica", "3 - Sair"};
        int n = assentos.length;
        char opcao = ((String) JOptionPane.showInputDialog(null, "Selecione uma opção:\n", "Seleção", JOptionPane.PLAIN_MESSAGE, null, opcoes, 1)).charAt(0);
        System.out.println(opcao);
        do {
            switch (opcao) {
                case '1':
                    int aux = 1;
                    for (int i = 0; i < n / 2; i++) {
                        if (assentos[i] == false) {
                            assentos[i] = true;
                            JOptionPane.showMessageDialog(null, String.format("Assento número %d - Primeira Classe", i + 1));
                            aux = 0;
                            System.exit(0);
                        }
                    }

                    if (aux == 1) {
                        JOptionPane.showMessageDialog(null, "O próximo voo parte em 3 horas.");
                    }

                    break;
                    
                case '2':
                    aux = 1;
                    for (int i = n / 2; i < n; i++) {
                        if (assentos[i] == false) {
                            assentos[i] = true;
                            JOptionPane.showMessageDialog(null, String.format("Assento número %d - Classe Econômica", i + 1));
                            aux = 0;
                            System.exit(0);  
                        }
                    }

                    if (aux == 1) {
                        JOptionPane.showMessageDialog(null, "O próximo voo parte em 3 horas.");
                    }

                    break;
            }
        } while (opcao != '3');
    }
}   