package idv.mandy;

public class Calculator {
    // member variale
    String name;

    // member method
    public double add(double adder, double addee) {
        return adder + addee;
    }

    public double substract(double substractee, double substractor) {
        return substractee - substractor;
    }

    public double multiply(double multipliee, double multiplier) {
        return multipliee * multiplier;
    }

    public double divide(double dividee, double divider) {
        return dividee / divider;
    }

    public int fibonacci(int n) {
        if (1 == n || 2 == n) {
            return 1;
        }
        if (0 >= n) {
            return -1;
        }
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        return result;
    }

}
