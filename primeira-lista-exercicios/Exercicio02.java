import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double area, pi = 3.14159, raio;
        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble();

        area = pi * (raio * raio);

        System.out.printf("O valor da àrea desse circulo é: %.4f%n", area);

        sc.close();
    }

}


//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159
