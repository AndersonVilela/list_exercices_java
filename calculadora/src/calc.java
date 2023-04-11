public class calc {
    double firstNumber;
    double secondNumber;
    char operator;

    public calc(double firstNumber, double secondNumber, char operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    public void calculator() {
        switch (this.operator) {
            case '+' -> addition(this.firstNumber, this.secondNumber);
            case '-' -> subtraction(this.firstNumber, this.secondNumber);
            case '/' -> division(this.firstNumber, this.secondNumber);
            case '*' -> multiplication(this.firstNumber, this.secondNumber);
            case '^' -> power(this.firstNumber, this.secondNumber);
            case 'r' -> squareRoot(this.firstNumber);
            case 'c' -> cubeRoot(this.firstNumber);
            default -> System.out.println("por favor digite apenas valores entre [+, -. /, *, ^,r, c]");
        }
    }

    public void addition(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        System.out.println("A resposta da soma entre " + firstNumber + " e " + secondNumber + " é " + result);
    }

    public void division(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Não é possível dividir por zero");
        } else {
            double result = firstNumber / secondNumber;
            System.out.println("A resposta da divisão entre " + firstNumber + " e " + secondNumber + " é " + result);
        }
    }

    public void multiplication(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        System.out.println("A resposta da multiplicação entre " + firstNumber + " e " + secondNumber + " é " + result);

    }

    public void subtraction(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        System.out.println("A resposta da subtração entre " + firstNumber + " e " + secondNumber + " é " + result);
    }

    public void power(double base, double exponent) {
        double result = Math.pow(base, exponent);
        System.out.println("A resposta da potenciação de " + base + " elevado a " + exponent + " é " + result);
    }

    public void squareRoot(double number) {
        double result = Math.sqrt(number);
        System.out.println("A resposta da raiz quadrada de " + number + " é " + result);
    }

    public void cubeRoot(double number) {
        double result = Math.cbrt(number);
        System.out.println("A resposta da raiz cubica de " + number + " é " + result);
    }
}
