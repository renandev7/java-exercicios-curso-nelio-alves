import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C, qst1 ,qst2 ,qst3, qst4, qst5 , pi = 3.14159;;

        System.out.println("Digite o valor do A: ");
        A = sc.nextFloat();
        System.out.println("Digite o valor do B: ");
        B = sc.nextFloat();
        System.out.println("Digite o valor do C: ");
        C = sc.nextFloat();

        //area do triangulo retangulo que tem A por base e C por altura

        qst1 = (A * C);
        qst1 = qst1 / 2;

        //a área do círculo de raio C. (pi = 3.14159)

        qst2 = pi * (C * C);

        //a área do trapézio que tem A e B por bases e C por altura.

        qst3 = A + B;
        qst3 = qst3 * C;
        qst3 = qst3 / 2;

        //a área do quadrado que tem lado B.

        qst4 = B * B;

        //a área do retângulo que tem lados A e B.

        qst5 = A * B;

        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", qst1, qst2, qst3, qst4, qst5);

        sc.close();



    }
}

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

