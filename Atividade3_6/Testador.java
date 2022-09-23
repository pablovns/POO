public class Testador {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente(1, 1000.0, 500.0);
        ContaPoupanca poupanca = new ContaPoupanca(1, 1200.0, 0.03);

        corrente.depositar(150.0);
        corrente.sacar(475.5);

        poupanca.depositar(900.5);
        poupanca.sacar(360.99);

    }
}
