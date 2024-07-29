import java.util.Scanner;

public class impares_concecutivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero Inteiro: ");
        int x = scanner.nextInt();

        int soma = 0;

        for (int i = 0; i <= x ; i++) {
            if(x % 2 != 0){
                soma = soma + x;
                System.out.println("soma: " + soma);
            }
        }

    }
}
