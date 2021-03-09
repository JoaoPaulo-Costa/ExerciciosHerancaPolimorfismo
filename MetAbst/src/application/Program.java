package application;

import e.enums.Cor;
import entities.Circulo;
import entities.Forma;
import entities.Retangulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Forma> lista = new ArrayList<>();

        System.out.print("Número de figuras: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados da forma #" + i + ":");
            System.out.println("Retangulo ou Circulo? (r/c)");
            char ch = sc.next().charAt(0);
            System.out.print("(BLACK/BLUE/RED): ");
            Cor cor = Cor.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                lista.add(new Retangulo(cor, largura, altura));
            }
            else {
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                lista.add(new Circulo(cor, raio));
            }
        }
        System.out.println();
        System.out.println("Áreas das formas:");
        for (Forma forma : lista) {
            System.out.println(String.format("%.2f", forma.area()));
        }
        sc.close();

    }
}
