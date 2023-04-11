import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            double raiz = (numero % 2 == 0) ? Math.cbrt(numero) : Math.sqrt(numero);
            System.out.printf("A raiz de %d é %.2f%n", numero, raiz);
        }
    }
}