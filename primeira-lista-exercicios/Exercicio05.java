import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod1, qtd1, cod2, qtd2;
        double valorUnd1, valorUnd2, total;

        System.out.println("Qual o codigo da primeira peça?");
        cod1 = sc.nextInt();

        System.out.println("Qual as quantidades da primeira peça?");
        qtd1 = sc.nextInt();

        System.out.println("Qual o valor unitario da primeira peça?");
        valorUnd1 = sc.nextDouble();

        System.out.println("Qual o codigo da segunda peça?");
        cod2 = sc.nextInt();

        System.out.println("Qual as quantidades da segunda peça?");
        qtd2 = sc.nextInt();

        System.out.println("Qual o valor unitario da segunda peça?");
        valorUnd2 = sc.nextDouble();

        total = qtd1 * valorUnd1 + qtd2 * valorUnd2;

        System.out.printf("Total da compra: R$%.2f", total);

        sc.close();

    }
}
//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
//o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
