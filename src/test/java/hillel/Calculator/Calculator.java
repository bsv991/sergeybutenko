package hillel.Calculator;

public class Calculator extends Functions {
    public static void main(String[] args) {
        int a = 10, b = 20, d = 30;
        Calculator calculator = new Calculator();
        calculator.addition(a, b);
        calculator.addition(a, b, d);
        calculator.subtraction(a, b);
        calculator.multiplication(a, b);

        Functions functions = new FunctionsEngineering();
        functions.multiplication(a, b);
    }
}