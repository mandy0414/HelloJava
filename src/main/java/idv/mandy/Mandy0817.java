package idv.mandy;

public class Mandy0817 {
    public static void main(String[] args) {
        double mandy = add(10, 1);
        double a = substract(1, 2);
        double b = multiply(1, 2);
        double c = divide(1, 0);

        System.out.println(mandy);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static double add(double adder, double addee) {
        return adder + addee;
    }

    public static double substract(double substractee, double substractor) {
        return substractee - substractor;
    }

    public static double multiply(double multipliee, double multiplier) {
        return multipliee * multiplier;
    }

    public static double divide(double dividee, double divider) {
        return dividee / divider;
    }
}
