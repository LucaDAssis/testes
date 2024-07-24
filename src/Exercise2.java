import java.util.Scanner;
/*
* Escreva um programa Java que imprima a soma dos números de 1 até um número inteiro positivo N,
* onde N é fornecido pelo usuário. O programa deve solicitar ao usuário que insira o valor de N e,
* em seguida, calcular e exibir a soma dos números de 1 até N.
Ex: Se N = 5, a soma de 1 a N será 15.
*
*
* O programa começa importando a classe Scanner para ler a entrada do usuário.

Ele solicita que o usuário insira um número N usando scanner.nextInt().

Em seguida, calcula a soma dos números de 1 até N usando um loop for.

Dentro do loop for, a variável soma é usada para acumular a soma dos números.

Após o loop, o programa exibe a soma calculada.

O scanner.close() é usado para fechar o scanner e liberar recursos.
*
*
*
* */

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println(soma);

        scanner.close();


    }
}
