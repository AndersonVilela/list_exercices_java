// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.next();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            if (sobrenome.equalsIgnoreCase("Wayne")) {
                System.out.println("Acesso liberado, Sr. Wayne");
            } else if (sobrenome.equalsIgnoreCase("Kent")) {
                System.out.println("Saí daí, mané!");
            } else if (nome.equalsIgnoreCase("Diana")) {
                System.out.println("Bem-vinda, Princesa de Themyscara");
            } else {
                System.out.println("Cai fora!");
            }
        }
    }
}