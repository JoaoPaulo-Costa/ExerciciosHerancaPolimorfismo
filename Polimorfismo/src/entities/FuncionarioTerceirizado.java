package entities;

public class FuncionarioTerceirizado extends Funcionario{

    private Double taxaAdicional;

    public FuncionarioTerceirizado() {
    }

    public FuncionarioTerceirizado(String nome, Integer horas, Double valorHora, Double taxaAdicional) {
        super(nome, horas, valorHora);
        this.taxaAdicional = taxaAdicional;
    }

    public Double getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(Double taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + taxaAdicional * 1.1;
    }
}
