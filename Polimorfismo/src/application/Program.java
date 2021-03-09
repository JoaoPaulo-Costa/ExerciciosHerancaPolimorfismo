package application;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Insira número de funcionários: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Funcionário #" + i + ":");
            System.out.println("Terceirizado? (s/n)");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();
            if(ch == 's') {
                System.out.print("Valor da taxa adicional: ");
                double taxaAdicional = sc.nextDouble();
                funcionarios.add(new FuncionarioTerceirizado(nome, horas, valorHora, taxaAdicional));
            }
            else
                funcionarios.add(new Funcionario(nome, horas, valorHora));
        }
        System.out.println();
        System.out.println("PAGAMENTOS:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + " - $ " + String.format("%.2f", funcionario.pagamento()));
        }

    }

}
