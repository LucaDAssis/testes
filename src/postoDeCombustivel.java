import java.util.Scanner;

public class postoDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesil = 0;

        int tipo = scanner.nextInt();

        //usando o while como não sabemos a quantidade especifica o while vem mais a calhar
        while (tipo != 4){
            if (tipo == 1){
              alcool = alcool + 1;
            } else if (tipo == 2) {
                gasolina = gasolina + 1;
            } else {
                diesil = diesil + 1;
            }
            tipo = scanner.nextInt();
        }

        System.out.println("Muito Obrigado!!");
        System.out.println("alcool: " + alcool);
        System.out.println("gasolia: " + gasolina);
        System.out.println("diesel: " + diesil);





        scanner.close();
    }
}
