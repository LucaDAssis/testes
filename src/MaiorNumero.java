import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int maior = 1;

        while (num > 0){
            num = scanner.nextInt();
            if (num > maior){
                maior =+ num;
            }
        }
        System.out.println(maior);

    }
}
