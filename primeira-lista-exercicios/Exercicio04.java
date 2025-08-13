import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFuncionario;
        double salario,horasTrabalhadas, valorHora;

        System.out.println("Qual seu número? ");
        numFuncionario = sc.nextInt();

        System.out.println("Digite quantas horas você trabalhou: ");
        horasTrabalhadas = sc.nextDouble();

        System.out.println("Digite o valor que você recebe por hora:  ");
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.printf("Numero: %d%n", numFuncionario);
        System.out.printf("Salario: %.2f", salario);

        sc.close();
    }
}
//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
