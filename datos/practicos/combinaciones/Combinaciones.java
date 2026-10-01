import java.util.Scanner;

public class Combinaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        System.out.print("Ingrese m: ");
        int m = sc.nextInt();

        int resultado = combinacion(m, n);
        System.out.println("C(" + m + ", " + n + ") = " + resultado);
    }

    //Aqui hice que el metodo para el factorial
    public static int factorial(int x) {
        if (x == 0) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    // Aqui hice el metodo para calcular las combinaciones
    public static int combinacion(int m, int n) {
        return factorial(n) / (factorial(m) * factorial(n - m));
    }
}
