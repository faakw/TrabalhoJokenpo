package testequiz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TesteQuiz {
/*
    Crie um programa em Java que: Solicite o preço e a quantidade de dois 
    produtos. Calcule o total de cada um. Independentemente dos valores, 
    sempre aplique um desconto de 10% no valor total. Exiba o valor final 
    formatado com duas casas decimais.
    */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        double preco1, preco2,total1, total2, calculo1, calculo2,valorFinal;
        int  quantidade1, quantidade2;
        System.out.println("Digite o preço do produto 1");
        preco1 = ler.nextDouble();
        System.out.println("Digite o preço do produto 2");
        preco2 = ler.nextDouble();
        System.out.println("Digite a quantidade de unidades do produto 1");
        quantidade1 = ler.nextInt();
        System.out.println("Digite a quantidade de unidades do produto 2");
        quantidade2 = ler.nextInt();
        total1 = preco1 * quantidade1;
        total2 = preco2 * quantidade2;
        calculo1 = total1 - (total1 * 0.10);
        calculo2 = total2 - (total2 * 0.10);
        valorFinal = calculo1 + calculo2;
        System.out.println("O valor total é R$"+decimal.format(valorFinal));
    }
}
