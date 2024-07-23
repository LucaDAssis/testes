import java.util.Scanner;

public class advinhacao {
    public static void main(String[] args) {
        int numero = 7; int tentativas = 5;
        Scanner scanner = new Scanner(System.in);

        while (tentativas >= 0){
            System.out.println("Digite um numero entre 1 e 10: ");
            int numeroFornecido = scanner.nextInt();


            if (numeroFornecido == numero){
                System.out.println("Parabéns Você acertou!! :D");
                return;
            } else {
                tentativas--;
            }

        }
    }
}
