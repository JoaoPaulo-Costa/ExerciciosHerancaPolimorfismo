package entities;

public class PessoaJuridica extends Pessoa{

    private Integer numFuncionario;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionario) {
        super(nome, rendaAnual);
        this.numFuncionario = numFuncionario;
    }

    public Integer getNumFuncionario() {
        return numFuncionario;
    }

    public void setNumFuncionario(Integer numFuncionario) {
        this.numFuncionario = numFuncionario;
    }

    @Override
    public double imposto() {
        if (numFuncionario > 10) {
            return getRendaAnual()*0.14;
        }
        else {
            return getRendaAnual()*0.16;
        }
    }
}
