import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo, Alcool = 0, Gasolina = 0, Diesel = 0, Fim;

        System.out.println("TIPO DE COMBUSTIVEL:\n1. ALCOOL\n2.GASOLINA\n3.DIESEL\n4.FIM");
        tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                Alcool = Alcool + 1;

            } else if (tipo == 2) {
                Gasolina = Gasolina + 1;

            } else if (tipo == 3) {
                Diesel = Diesel + 1;

            }
            else {
                System.out.println("Codigo inválido, digite novamente:");
            }
            tipo = sc.nextInt();


        }

        System.out.println("MUITO OBRIGADO! ALCOOL: " + Alcool + " GASOLINA: " + Gasolina + " DIESEL: " + Diesel);

    }

}
