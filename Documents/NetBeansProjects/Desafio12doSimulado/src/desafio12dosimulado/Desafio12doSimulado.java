package desafio12dosimulado;

import java.util.Scanner;

/**
 *
 * Faça um algoritmo que leia dois valores inteiros A e B se os valores forem
 * iguais deverá se somar os dois, caso contrário multiplique A por B. Ao final
 * de qualquer um dos cálculos deve-se atribuir o resultado para uma variável C
 * e mostrar seu conteúdo na tela.
 */
public class Desafio12doSimulado {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A, B, c;
        System.out.println("Digite valor A");
        A = ler.nextInt();
        System.out.println("Digite valor B");
        B = ler.nextInt();
        if (A == B) {
            c = A + B;
            System.out.println("Resultado:" + c);
        } else if (A != B) {
            c = A * B;
            System.out.println("Resultado:" + c);
        }
    }

}
