package idv.mandy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("Hello World!");
        }
        int a = 1;
        System.out.println("a*2=" + (a * 2));
        int b = 1;
        System.out.println("b*2=" + b * 2);

        int c = 0;
        for (int i = 1; i <= 100; i++) {
            c += i;
        }
        System.out.println(c);

        Calculator myCalculator = new Calculator();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "　*　" + j + "　=　" + myCalculator.multiply(i, j));
            }
        }
    }

}

