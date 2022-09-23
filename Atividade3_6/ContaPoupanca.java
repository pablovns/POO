public class ContaPoupanca extends ContaBancaria {
    /**
     * deve estar em porcentagem, por exemplo:
     * 3% = 0.03
     */
    private Double taxaDeOperacao;

    public ContaPoupanca(Integer id, Double saldo, Double taxaDeOperacao) {
        super(id, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
    public void depositar(Double quantia) {
        this.saldo += quantia - quantia * this.taxaDeOperacao;
        System.out.printf("Quantia descontada pela taxa de operação: %d", quantia * this.taxaDeOperacao);
    }

    public void sacar(Double quantia) {
        if (this.saldo - quantia >= 0) {
            this.saldo -= quantia - quantia * this.taxaDeOperacao;
            System.out.printf("Quantia descontada pela taxa de operação: %d", quantia * this.taxaDeOperacao);
        }
    }
}
