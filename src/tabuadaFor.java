import java.util.Scanner;

public class tabuadaFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = base * i;
            System.out.println(i + " x " + base + " = " + resultado);
        }
    }
}
