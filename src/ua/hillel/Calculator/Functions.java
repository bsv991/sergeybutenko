package ua.hillel.Calculator;

public class Functions {
    int c;
    public void addition(int a, int b) {
        c = a + b;
        System.out.println("Сумма чисел: " + c);
    }

    public void addition(int a, int b, int d) {
        c = a + b + d;
        System.out.println("Сумма чисел : " + c);
    }

    public void subtraction(int a, int b) {
        c = a - b;
        System.out.println("Разность чисел: " + c);
    }

    public void multiplication(int a, int b) {
        c = a * b;
        System.out.println("Произведение чисел: " + c);
    }
}