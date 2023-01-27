package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {


    public  int sum(int a , int b){
        return a + b ;
    }

    public static int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("You cannot divide to zero");
        }
        return a/b;
    }

    @Test
    public void testSumFunction(){
        int expectedResult = 4;
        Assert.assertEquals(sum(2,2),expectedResult);
        Assert.assertEquals(sum(5,5),10);
        Assert.assertEquals(sum(7,7),14);
    }

    @Test
    public void testDivideFunction(){
        Assert.assertEquals(divide(6,2),3);
        Assert.assertEquals(divide(10,10),1);
        Assert.assertEquals(divide(100,10),10);

    }
    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideExceptionFunction(){
        divide(2,0);
        Assert.assertEquals(divide(10,10),1);
        Assert.assertEquals(divide(20,2),10);
    }



}
