package application;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Produto> produtos = new ArrayList<>();


        System.out.print("Insira número de produtos: ");
        int n = sc.nextInt();

        for (int i =1; i<=n; i++) {
            System.out.println("Dados do produto #" + i + ":");
            System.out.print("Comum, usado, importado (c/u/i): ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            if (ch == 'c') {
                produtos.add(new Produto(nome, preco));
            }
            else if (ch == 'u') {
                System.out.print("Data de fabricação (dd/MM/yyyy): ");
                Date dataFabricacao = sdf.parse(sc.next());
                produtos.add(new ProdutoUsado(nome, preco, dataFabricacao));
            }
            else {
                System.out.print("Taxa de importação: ");
                double taxaImportacao = sc.nextDouble();
                produtos.add(new ProdutoImportado(nome, preco, taxaImportacao));
            }
        }
        System.out.println();
        System.out.println("ETIQUETAS DE PREÇO:");
        for (Produto produto : produtos) {
            System.out.println(produto.etiquetaPreco());
        }

        sc.close();

    }
}
