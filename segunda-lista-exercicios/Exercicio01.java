import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero inteiro, para saber se é negativo ou positivo: ");
        numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("seu numero é POSITIVO");
        } else {
            System.out.println("seu numero é NEGATIVO");
        }

        sc.close();
    }
}


//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

