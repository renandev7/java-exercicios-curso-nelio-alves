import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C,D, diferenca;

        System.out.println("Digite o primeiro valor: ");
        A = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        B = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        C = sc.nextInt();
        System.out.println("Digite o quarto valor: ");
        D = sc.nextInt();

        diferenca = (A * B - C * D);

        System.out.printf("Diferença: %d", diferenca);

        sc.close();
    }
}

//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
