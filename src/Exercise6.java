import java.util.Scanner;

/*
* import java.util.Scanner;: Esta linha importa a classe Scanner do pacote java.util, que permite a leitura de entrada do usuário.

Scanner scanner = new Scanner(System.in);: Aqui, um objeto Scanner chamado scanner é criado para ler a entrada do usuário a partir do sistema (System.in).

int numero = scanner.nextInt();: O programa lê um número inteiro fornecido pelo usuário e armazena-o na variável numero.

if (numero <= 0) { ... }: Esta parte verifica se o número fornecido pelo usuário é menor ou igual a zero. Se for, o programa imprime 0 como resultado e retorna, encerrando o programa.

else if (numero == 1) { ... }: Se o número for igual a 1, o programa imprime 1 como resultado e retorna, encerrando o programa. Isso ocorre porque os primeiros dois termos da Sequência de Fibonacci são 0 e 1.

Em seguida, o código cria três variáveis para rastrear os termos da Sequência de Fibonacci:

termoAnterior é inicializado como 0, representando o termo anterior na sequência.

termoAtual é inicializado como 1, representando o termo atual na sequência.

termoFibonacci é inicializado como 0, que será usado para calcular o termo subsequente.

O loop for (int i = 2; i <= numero; i++) { ... } é usado para calcular o termo Fibonacci correspondente ao número fornecido pelo usuário. O loop começa a partir do terceiro termo da sequência, pois os dois primeiros termos já foram tratados.

Dentro do loop, termoFibonacci é calculado somando-se os valores de termoAnterior e termoAtual. Em seguida, os valores de termoAnterior e termoAtual são atualizados para os próximos cálculos.

Após o término do loop, o programa imprime o valor de termoFibonacci, que é o termo da Sequência de Fibonacci correspondente ao número fornecido pelo usuário.

Finalmente, scanner.close(); é usado para fechar o objeto Scanner e liberar recursos.
*
* */

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println(0);
            return;
        } else if (numero == 1) {
            System.out.println(1);
            return;
        }

        long termoAnterior = 0;
        long termoAtual = 1;
        long termoFibonacci = 0;

        for (int i = 2; i <= numero; i++) {
            termoFibonacci = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = termoFibonacci;
        }

        System.out.println(termoFibonacci);
        scanner.close();
    }
}
