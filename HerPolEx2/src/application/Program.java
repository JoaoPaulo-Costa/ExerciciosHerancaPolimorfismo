package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Pessoa> lista = new ArrayList<>();

        System.out.print("Inserir número de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Dados do contribuinte #" + i + ":");
            System.out.print("PF ou PJ? (f/j) ");
            char ch = sc.next().charAt(0);

            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();

            if (ch == 'f') {
                System.out.print("Gastos com saúde: ");
                double gastosSaude = sc.nextDouble();
                lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            }
            else {
                System.out.print("Número de funcionários: ");
                int numFuncionarios = sc.nextInt();
                lista.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
            }
        }

        System.out.println();
        System.out.println("IMPOSTOS PAGOS:");
        double impostosTotais = 0.0;

        for (Pessoa pessoa : lista) {
            impostosTotais += pessoa.imposto();
            System.out.printf("%s: $ %.2f%n", pessoa.getNome(), pessoa.imposto());
        }

        System.out.println();
        System.out.println("IMPOSTOS TOTAIS: $ " + impostosTotais);





    }
}
