package practice;

import org.example.FakeDataProvider;
import org.testng.Assert;
import org.testng.annotations.*;
import practice.Demo1;

import java.util.SortedMap;

public class TestDemo {

    Demo1 demo1;
    String expectedFakeName;

    @BeforeClass
    public void setUp(){
        System.out.println("Open Chrome Browser");
        expectedFakeName = FakeDataProvider.generateFakeName();

    }

    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("This is Before method");
        System.out.println(expectedFakeName);
    }


    @Test(description = "Verify food title is displayed Home page")
    @Ignore
    public void testSum(){
        System.out.println("This is test sum");
    }

    @Test
    public void testSum2(){
        System.out.println("This is test sum 2");
    }


    @AfterClass
    public void tearDown(){
        System.out.println("Close Chrome Browser");
    }

}
