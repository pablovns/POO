public class Testador {
    public static void main(String[] args) {
        int codigo;
        for (int i = 1; i <= 12; i++) {
            codigo = i % 2 + 1; // isso faz ele alternar entre 1 e 2 conforme o loop progride
            System.out.printf("no. do mes: %d\ncodigo: %d\nretorno: %s\n\n", i, codigo, Mes.getMesPorExtenso(i, codigo));
        }
    }
}
