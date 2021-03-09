package entities;

public class ContaBusiness extends Conta {

    private Double limiteEmprestimo;

    public ContaBusiness() {
        super();
    }

    public ContaBusiness(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo (double valor) {
        if (valor <= limiteEmprestimo) {
            saldo += valor - 10;
        }
    }

    @Override
    public void saque(double valor) {
        super.saque(valor);
        saldo -= 2.00;
    }
}
