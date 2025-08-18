import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, teste;

        System.out.println("Digite um numero inteiro: ");
        A = sc.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        B = sc.nextInt();


        if (A % B == 0 || B % A == 0) {
            System.out.println("É MULTIPLO");
        } else {
            System.out.println("NÃO SÃO MULTIPLOS");
        }
        sc.close();
    }
}

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
//indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.
