package hillel.homework11;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLogin {
    @DataProvider(name = "data")
    public Object[][] data() {
        return new Object[][]{
                {"TestLogin", "12345677", "user"},
                {"TestLogin1", "123456771", "user"},
        };
    }


    @Test(dataProvider = "data", groups = {"init"})
    public void testLogin(String login, String password, String role) {
        System.out.println("login :" + login);
        System.out.println("password :" + password);
        System.out.println("role :" + role);
        Assert.assertEquals(login, "TestLogin", "Login : ");
        Assert.assertEquals(password, "12345677", "Password : ");
        Assert.assertEquals(role, "user", "Role : ");
    }

    @Test(dependsOnGroups = {"init"})
    public void testDependsOnGroups() {
        System.out.println("Dependent test");
    }

    @Test
    @Parameters("login")
    public void testParametersFromOutside (String login) {
        System.out.println("Parameters From Outside :" + login);
    }
}