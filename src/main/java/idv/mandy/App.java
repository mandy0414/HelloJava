package idv.mandy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        long result = myCalculator.fibonacci(50);
        System.out.println("RESULT=" + result);
    }
}

