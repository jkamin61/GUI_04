package task01;

public class Main {
    public static void main(String[] args) {
        ICalc<Double> myAdd = (a, b) -> a + b;
        System.out.println(myAdd.calculate(5.0, 3.0));
        ICalc<Double> mySubtract = (a, b) -> a - b;
        System.out.println(mySubtract.calculate(5.0, 3.0));
        ICalc<Double> myMultiply = (a, b) -> a * b;
        System.out.println(myMultiply.calculate(5.0, 3.0));
        ICalc<Double> myDivide = (a, b) -> a / b;
        System.out.println(myDivide.calculate(5.0, 3.0));
    }
}
