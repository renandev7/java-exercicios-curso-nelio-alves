import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero inteiro para saber se é impar ou par: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("É PAR");
        } else {
            System.out.println("É IMPAR");
        }

        sc.close();
    }
}

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
