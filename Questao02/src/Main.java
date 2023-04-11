import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Digite a escala da temperatura (C, F ou K): ");
        String escala = scanner.next().toUpperCase();

        double celsius = 0.0;
        double fahrenheit = 0.0;
        double kelvin = 0.0;

        switch (escala) {
            case "C" -> {
                celsius = temperatura;
                fahrenheit = celsius * 9 / 5 + 32;
                kelvin = celsius + 273.15;
            }
            case "F" -> {
                fahrenheit = temperatura;
                celsius = (fahrenheit - 32) * 5 / 9;
                kelvin = celsius + 273.15;
            }
            case "K" -> {
                kelvin = temperatura;
                celsius = kelvin - 273.15;
                fahrenheit = celsius * 9 / 5 + 32;
            }
            default -> {
                System.out.println("Escala inválida!");
                return;
            }
        }

        System.out.println("Temperatura em Celsius: " + celsius);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura em Kelvin: " + kelvin);
    }
}