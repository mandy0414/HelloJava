package idv.mandy;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    // member variale
    String name;
    Map<Integer, Long> cache;
    // map<key,value>

    public Calculator() {
        this.cache = new HashMap<Integer, Long>();
    }

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

    public long fibonacci(int n) {
        if (1 == n || 2 == n) {
            return 1;
        }
        if (0 >= n) {
            return -1;
        }
        long result;


        if (cache.containsKey(n)) {
            result = cache.get(n);
        } else {
            result = fibonacci(n - 1) + fibonacci(n - 2);
            cache.put(n, result);
        }
        return result;
    }

}
