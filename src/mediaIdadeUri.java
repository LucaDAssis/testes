import java.util.Scanner;

public class mediaIdadeUri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();
        int soma = 0;
        int count = 0;

        while ( idade >= 0){
            soma += idade;
            count += 1;
            idade = scanner.nextInt();

        }
        if (count > 0){
            double media = (double) soma / count;
            System.out.printf("%.2f%n", media);
        } else {
            System.out.println("Impossivel Calculare");
        }


        scanner.close();
    }
}
