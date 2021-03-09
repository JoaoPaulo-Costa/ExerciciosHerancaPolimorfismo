package entities;

public class contaPoupancaPlus extends ContaPoupanca{

    @Override
    public void saque(double valor) {
        super.saque(valor);
        saldo -= 2.00;
    }
}
