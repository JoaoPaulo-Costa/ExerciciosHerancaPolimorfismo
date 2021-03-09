package application;

import entities.Conta;
import entities.ContaBusiness;
import entities.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
/*
        Conta acc = new Conta(1001, "Juse", 1000.0);
        ContaBusiness bacc = new ContaBusiness(1002, "Juau", 0.0, 500.00);

        //UPCASTING

        Conta acc1 = bacc;
        Conta acc2 = new ContaBusiness(1003, "BOB", 1000.0, 500.00);
        Conta acc3 = new ContaPoupanca(1004,"Ana", 1000.0, 0.01);

        //DOWNCASTING

        ContaBusiness acc4 = (ContaBusiness) acc2;
        acc4.emprestimo(100);

        //ContaBusiness acc5 = (ContaBusiness) acc3;
/*
        if (acc3 instanceof ContaBusiness) {
            ContaBusiness acc5 = (ContaBusiness) acc3;
            acc5.emprestimo(200.00);
            System.out.println("Emprestimo!");
        }
        if (acc3 instanceof ContaPoupanca) {
            ContaPoupanca acc5 = (ContaPoupanca) acc3;
            acc5.atualizarSaldo();
            System.out.println("Atualizado!");
        }
*/
/*
        Conta acc1 = new Conta(1001, "Alex", 1000.0);
        acc1.saque(200.0);
        System.out.println(acc1.getSaldo());

        Conta acc2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
        acc2.saque(200.0);
        System.out.println(acc2.getSaldo());

        Conta acc3 = new ContaBusiness(1003, "Bob", 1000.0, 500.0);
        acc3.saque(200.0);
        System.out.println(acc3.getSaldo());

        System.out.println();

        Conta x = new Conta(1020, "Juse", 1000.00);
        Conta y = new ContaPoupanca(1048, "Juau", 1000.00, 0.01);

        x.saque(200);
        y.saque(200);

        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());
*/

        List<Conta> lista = new ArrayList<>();

        lista.add(new ContaPoupanca(1001, "Alex", 500.00, 0.001));
        lista.add(new ContaBusiness(1001, "Mary", 1000.00, 500.00));
        lista.add(new ContaPoupanca(1001, "Bob", 800.00, 0.001));
        lista.add(new ContaBusiness(1001, "Anna", 670.00, 500.00));

        double soma = 0.0;
        for (Conta acc : lista) {
            soma += acc.getSaldo();
        }
        for (Conta acc : lista) {
            acc.deposito(10.0);
        }
        for (Conta acc : lista) {
            System.out.printf("Saldo atualizado para conta %d: %.2 ", acc.getTitular(), acc.getSaldo());
        }

    }
}
