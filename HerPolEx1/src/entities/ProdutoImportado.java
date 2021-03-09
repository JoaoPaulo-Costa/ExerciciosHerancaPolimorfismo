package entities;

public class ProdutoImportado extends Produto{

    private Double taxaAlfandegaria;

    public ProdutoImportado() {
    }

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandegaria) {
        super(nome, preco);
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public Double precoTotal () {
        return getPreco() + taxaAlfandegaria;
    }

    public Double getTaxaAlfandegaria() {
        return taxaAlfandegaria;
    }

    public void setTaxaAlfandegaria(Double taxaAlfandegaria) {
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    @Override
    public String etiquetaPreco() {
        return getNome()
                + " $ "
                + String.format("%.2f", precoTotal())
                + " (Taxa Alfadegária: $ "
                + String.format("%.2f", getTaxaAlfandegaria())
                + ")";
    }
}
