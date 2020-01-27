package com.crm.qa.base;

import com.crm.qa.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

  public  static  WebDriver driver;
   //initialize a prop variable
   public static Properties prop;

   //Create constructor to read properties file
   public TestBase()
   {
       //read the properties file
       try
       {
        prop = new Properties();
           FileInputStream ip = new FileInputStream("C:\\Users\\Sagarika\\IdeaProjects\\FreeCRM\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
           prop.load(ip);
       }
       catch(FileNotFoundException e)
       {
            System.out.println("file not found");
       } catch (IOException e) {

           e.printStackTrace();
       }
   }

   //create one method to intialization to read the browser from property file

    public static void initialization()

    {
        //As this prop variable will give one string so stored in a string variable
        String browserName=prop.getProperty("browser");
        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Sagarika\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
       // driver.manage().deleteAllCookies();

        //now here we can remove the hardcode value
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);

        //driver.get(prop.getProperty("url"));
        driver.get("https://ui.freecrm.com/");
       // driver.navigate().to("https://ui.freecrm.com/");
    }

}
