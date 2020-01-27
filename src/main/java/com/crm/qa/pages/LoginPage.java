package com.crm.qa.pages;


import com.crm.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //Define page factory or Object Repository of login class
   // @FindBy(xpath="//span[contains(text(),'Log In')]")
    //WebElement signin;
    @FindBy(xpath="//input[@name=\"email\"]")
    //@FindBy(xpath = "//*[@id='ui']/div/div/form/div/div[1]/div/input")
    WebElement uname;
    @FindBy(name = "password")
    WebElement pass;
    @FindBy(xpath="(//div[contains(text(),'Login')])[1]")
    WebElement loginBtn;

    //create constructor
    public LoginPage() {
        //all the findby variables will be initilized with driver
        //this means it points to the current class objects
        PageFactory.initElements(driver, this);
    }


    public void sign()
    {
        loginBtn.click();
    }
        //perform different actions
        public  void validatelogin(String un, String pw)
        {
           // JavascriptExecutor js = (JavascriptExecutor)driver;
           // js.executeScript("document.getElementsByName('email').value='fgfjh';");

            uname.sendKeys(un);
            pass.sendKeys(pw);

            //loginBtn.click();
            //return new SignUpPage();
        }



}
