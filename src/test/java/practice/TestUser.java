package practice;

import static org.testng.Assert. *;
import org.testng.annotations.Test;

public class TestUser {

    @Test(description = "verify Admin can create new user")
    public void createNewUserTest(){
        fail();
        System.out.println("Creating new user");
    }

    @Test(dependsOnMethods = "createNewUserTest")
    public void checkCreatedUser(){
        System.out.println("Checking created user");
    }


    @Test
    public void test1(){
        String str = "Hello";
        assertEquals(1,1);
        assertEquals("Hello","Hello");
        assertEquals(str.length() ,5);
        assertTrue(str.contains("e"));
        assertFalse(str.endsWith("E"));
    }


}

