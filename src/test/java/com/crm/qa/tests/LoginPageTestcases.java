package com.crm.qa.tests;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;
import com.crm.qa.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTestcases extends TestBase {

    LoginPage page;
    //create constructor
    //SignUpPage signuppage;
    // String uname;
    String sheetName = "Sheet1";

    public LoginPageTestcases() {
        //call super base construtor because before intiaization method we have to call testbase constructor by using super keyword

        super();
    }

    //define annotations

    @BeforeMethod
    public void setup() {
        //call intializtion method from testbase class
        initialization();
        //create the object of loginpage class
        page = new LoginPage();
        //

    }

    @DataProvider
    public Object[][] getCRMTestData() {
        Object data[][] = TestUtil.getTestData(sheetName);
        Object[][] data1 = data;
        return data1;
    }

    @Test(dataProvider="getCRMTestData")
    public void logintotest(String user, String pwd )
    {
       // page.sign();
        //uname = prop.getProperty("username1");
        //String pw = prop.getProperty("password1");
       // page.validatelogin(prop.getProperty("username1"),prop.getProperty("password1"));
       // page.sign();
        page.validatelogin(user, pwd);

    }
   /* @AfterMethod
    public void teardown()
    {
        driver.quit();
    }*/
    }

