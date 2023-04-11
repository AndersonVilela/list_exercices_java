import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner typing = new Scanner(System.in);

        System.out.println("D  ___________________________\n" +
                "   /                           \\\n" +
                "  |    Bem-vindo à calculadora |\n" +
                "  |___________________________|\n" +
                "  \n" +
                "      Escolha uma operação:\n" +
                "  \n" +
                "      +---------+---------+\n" +
                "      |    +    |    -    |\n" +
                "      +---------+---------+\n" +
                "      |    /    |    *    |\n" +
                "      +---------+---------+\n" +
                "      |    ^    |    r    |\n" +
                "      +---------+---------+\n" +
                "      |    c    |    q    |\n" +
                "      +---------+---------+\n" +
                "         \n" +
                "      + para adição\n" +
                "      - para subtração\n" +
                "      / para divisão\n" +
                "      * para multiplicação\n" +
                "      ^ para potenciação\n" +
                "      r para raiz quadrada\n" +
                "      c para raiz cubica\n" +
                "obs: no caso do r e c será somente levado em consideração o primeiro número");
        char operator = typing.next().charAt(0);

        System.out.println("Digite o primeiro número: ");
        double firstNumber = typing.nextDouble();

        System.out.println("Digite o segundo número: ");
        double secondNumber = typing.nextDouble();

        new calc(firstNumber, secondNumber, operator).calculator();
    }
}