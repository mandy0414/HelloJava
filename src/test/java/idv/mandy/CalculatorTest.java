package idv.mandy;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest extends TestCase {
    final double DELTA = 0.001;
    //若變數確定不變，建議改成"定數",前面需+ final且變數名稱改大寫
    // double DELTA=0.0001; 建議通用變數需要另外定義出來
    // 若程式中有相同變數要改大寫，shift+F6連按兩次

    @Test
    public void testAdd() throws Exception {
        double a = 2.1;
        double b = 3.1;

        Calculator myCalculator = new Calculator();
        double result = myCalculator.add(a, b);
        Assert.assertEquals(5.2, result, DELTA);
    }
    @Test
    public void testSubstract() throws Exception {
        double a = 2D;
        double b = 4D;
        Calculator myCalculator = new Calculator();
        double result = myCalculator.substract(a, b);
        Assert.assertEquals(-2D, result, DELTA);
    }
    @Test
    public void testMultiply() throws Exception {
        double a = 2D;
        double b = 4D;
        Calculator myCalculator = new Calculator();
        double result = myCalculator.multiply(a, b);
        Assert.assertEquals(8D, result, DELTA);
    }
    @Test
    public void testDivide() throws Exception {
        double a = 2;
        double b = 4;
        Calculator myCalculator = new Calculator();
        double result = myCalculator.divide(a, b);
        Assert.assertEquals(0.5, result, DELTA);
    }
    @Test
    public void testfibonacci(){
        int n=1;
        Calculator myCalculator = new Calculator();
        int result =myCalculator.fibonacci(n);
        Assert.assertEquals(1,result);
    }
    @Test
    public void testfibonacci10(){
        int n=10;
        Calculator myCalculator = new Calculator();
        int result =myCalculator.fibonacci(n);
        Assert.assertEquals(55,result);
    }
}