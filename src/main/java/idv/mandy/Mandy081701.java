package idv.mandy;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

public class Mandy081701 {
    public static void main(String[] args) {
        Calculator myfirstgcalculator = new Calculator();
        double a = myfirstgcalculator.add(1, 3);
        double b = myfirstgcalculator.substract(4, 5);
        double c = myfirstgcalculator.multiply(1, 3);
        double d = myfirstgcalculator.divide(1, 0);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}

