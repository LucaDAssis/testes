import java.util.Scanner;

/*
* O programa solicita ao usuário que insira um número inteiro não negativo para calcular o fatorial.
Ele checa os casos especiais, do 0 e 1 e já retorna se o n for um desses valores.
Em seguida, ele calcula o fatorial desse número usando o for para iterar de 2 até o N, e assim ir acumulando as multiplicações.
O programa imprime o fatorial encontrado.
* */


public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero == 0 || numero == 1) {
            System.out.println(1);
            return;
        }

        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
        scanner.close();
    }
}
