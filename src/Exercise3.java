import java.util.Scanner;

/*
* Utilizamos a variável numberOfRows para especificar quantas linhas queremos no padrão. Fazemos a leitura da entrada do sistema.

Usamos um loop externo (for) para controlar o número de linhas no padrão. Ele começa em 1 e continua até numberOfRows.

Dentro do loop externo, usamos um loop interno (for) para imprimir os números em cada linha.
* O loop interno começa em 1 e continua até o número da linha atual (i).

Dentro do loop interno, usamos System.out.print(j) para imprimir o valor atual de j,
* que representa os números de 1 até i na mesma linha.

Após imprimir todos os números na linha atual, usamos System.out.println()
* para avançar para a próxima linha antes de começar a próxima iteração do loop externo.*/


public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();

        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }
}
