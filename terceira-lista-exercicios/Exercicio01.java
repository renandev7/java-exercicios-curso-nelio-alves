import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int validacao, senha = 2002;

        System.out.println("Digite a senha: ");
        validacao = sc.nextInt();

        while(validacao != senha) {
            System.out.println("Senha invalida, insira novamente");
            validacao = sc.nextInt();
        }
        System.out.println("ACESSO PERMITIDO");
        sc.close();
    }
}
//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

