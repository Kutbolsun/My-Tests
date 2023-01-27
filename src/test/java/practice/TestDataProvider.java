package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class TestDataProvider {

    @DataProvider (name = "login data")
    public Object[][] dpMethod(){
        return new Object[][]{
                {"john@gmail.com","VeryHardP@123!"},
                {"john@gmail","VeryHardP@123!"},
                {"john@gmail","VeryHardP@$$"},
                {"john@gmail.com","123"},
                {"john@gmail...com","V"}
        };
    }

    @Test(dataProvider = "login data")
    public void myTest(String email, String password){
        System.out.println("Test Login page: Testing emailing field with  " + email + " ------ " + "Testing password field with: " + password );
    }

}
