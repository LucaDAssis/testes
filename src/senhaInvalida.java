import java.util.Scanner;

public class senhaInvalida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senhaFixa = 2312;

        System.out.println("Digite a Senha: ");
        int senha = scanner.nextInt();


        while (senha != senhaFixa){
            System.out.println("Senha Invalida! Tente Novamene " + senha);
            senha = scanner.nextInt();
        }
        System.out.println("Acesso Permitido!!");
    }
}
