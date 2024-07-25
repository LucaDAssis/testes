import java.util.Scanner;

public class imparesFor {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int min, max;

        if (num1 > num2){
            min = num2;
            max = num1;
        } else {
            min = num1;
            max = num2;
        }

        int soma = 0;
        for (int i = min+1; i < max; i++) {
            if (i % 2 != 0){
                soma += i;
            }

        }
        System.out.println(soma);







        scanner.close();
    }
}
