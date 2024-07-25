import java.util.Scanner;

/*
* Crie um programa Java que solicita ao usuário uma série de números e quando ele digitar um número negativo,
*  o programa irá encerrar e imprimir o maior número entre os digitados.
* Você deve utilizar estruturas de repetição para coletar os números e determinar qual é o maior.
Ex: Suponha que o usuário insira os seguintes números: 5, 12, 8, 25, 3, -1. A saída do programa deve ser: 25.
*
* Inicializamos a variável maiorNumero com 0, que é o menor valor possível para um número positivo inteiro.
* Isso garante que qualquer número positivo digitado pelo usuário será maior ou igual ao valor inicial.

Usamos um loop while (true) para permitir que o usuário insira números indefinidamente até que ele digite um número negativo para sair do loop.

Dentro do loop, solicitamos ao usuário que insira um número e o armazenamos na variável numero.

Verificamos se o número digitado é negativo. Se for, usamos break para sair do loop.

Caso contrário, comparamos o número atual com maiorNumero e o atualizamos se o número digitado for maior.

Após o loop, exibimos o maior número encontrado.
*
* */

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorNumero = 0;

        while (true){
            int numero = scanner.nextInt();

            if (numero < 0){
                break;
            }

            if (numero > maiorNumero){
                maiorNumero = numero;
            }



        }
        System.out.println(maiorNumero);
        scanner.close();


    }
}
