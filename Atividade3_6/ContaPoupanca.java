public class ContaPoupanca extends ContaBancaria {
    private Double taxaDeOperacao;

    public ContaPoupanca(Integer id, Double saldo, Double taxaDeOperacao) {
        super(id, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
    public void depositar(Double quantia) {
        this.saldo += quantia;
    }

    public void sacar(Double quantia) {
        this.saldo -= quantia;
    }
}
