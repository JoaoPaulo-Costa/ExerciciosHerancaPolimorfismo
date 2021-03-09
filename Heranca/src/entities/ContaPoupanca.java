package entities;

public /*final*/ class ContaPoupanca extends Conta {

    private Double taxa;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxa) {
        super(numero, titular, saldo);
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public void atualizarSaldo () {
        saldo += saldo*taxa;
    }

    @Override
    public /*final*/ void saque(double valor) {
        saldo -= valor;
    }
}
