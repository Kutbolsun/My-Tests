package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {

    public static int sumOfTwo(int a, int b){
        return a + b ;
    }
    public static int divide(int a , int b) {
        if (b == 0) {
            throw new ArithmeticException("You cannot divide to zero");
        }
        return a/b;
    }

    @Test
    public void testSumFunction(){
        Assert.assertEquals(sumOfTwo(3,3),6);
        Assert.assertEquals(sumOfTwo(4,5),9);
        Assert.assertEquals(sumOfTwo(20,1),21);

    }

    @Test
    public void testDivideFunction() {
        Assert.assertEquals(divide(8,2),4);
        Assert.assertEquals(divide(4,4),1);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideExceptionFunction(){
        divide(4,0);
        Assert.assertEquals(divide(6,3),2);
    }
}
