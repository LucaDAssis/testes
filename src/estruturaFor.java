public class estruturaFor {
    public static void main(String[] args) {
        int n = 7;
        int factorial = 1;
        //usando for lembrar da estrutura e lembrar de manter o clean code.
        for (int i = 1; i <= n; i++){
            System.out.println("I: " + i + ", " + factorial);
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
