import java.util.Scanner;

public class JumpStatements {
    public static void main(String[] args) {
        //continue
//        for (int i = 0; i < 50; i++) {
//            if( i % 2 != 0)
//            continue;
//            System.out.println(i);
//        }

        //break
//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            System.out.println("Digite um número: ");
//            int numero = scanner.nextInt();
//
//            if(numero == 1)
//                break;
//        }
//        System.out.println("Ufa, Acabou o Looping");

        //return
        Scanner scanner = new Scanner(System.in);
           while (true){
               System.out.println("Digite um número: ");
                int numero = scanner.nextInt();
               //fechando o Scanner
               if(numero == 1)
                   System.out.println("Ufa, Acabou o Looping");
                scanner.close();
                   return;
           }




    }
}
