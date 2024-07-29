import java.util.Scanner;

public class notaValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //inciando a pergunta e pegando os dados
        double nota1 = sc.nextDouble();
        //verificando se as notas estão no intervalo valido e fazendo o loop
        while (nota1 < 0.0 || nota1 > 10.0) {
            System.out.println("nota invalida");
            nota1 = sc.nextDouble();
        }

        //segundo loop mesmaa regra
        double nota2 = sc.nextDouble();
        while (nota2 < 0.0 || nota2 > 10.0) {
            System.out.println("nota invalida");
            nota2 = sc.nextDouble();
        }

        //fazendo o calculo
        double media = (nota1 + nota2) / 2.0;
        System.out.printf("media = %.2f%n", media);

        sc.close();


    }
}
