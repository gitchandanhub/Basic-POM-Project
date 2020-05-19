package driverbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import utility.waitutility;



public class BaseDriver 
{
     public static WebDriver driver = null;
     public static Properties config = new Properties();
     public static Logger log=Logger.getLogger("devpinoyLogger");
      @BeforeTest
      public void Initialize() throws Exception {
    	  FileInputStream fis = new FileInputStream("D:\\Selenium\\new eclipse may 2020-workspace\\MYPOM\\src\\main\\java\\properties\\config.properties");
    	  config.load(fis);
    	  if(config.getProperty("BrowserName").equalsIgnoreCase("Chrome"))
    	  {
    		  System.setProperty("webdriver.chrome.driver", config.getProperty("ChromeDriver_path"));
              driver = new ChromeDriver();
    	  }
    	  else  if(config.getProperty("Browser").equalsIgnoreCase("Firefox"))
          {
       	   System.setProperty("webdriver.gecko.driver", config.getProperty("FireFoxDriver_path"));
       	   driver = new FirefoxDriver();
          }
          else  if(config.getProperty("Browser").equalsIgnoreCase("IEDriver_path"))
          {
       	   System.setProperty("webdriver.internetExplorer.driver", config.getProperty("InternetExplorerpath"));
       	   driver = new InternetExplorerDriver();
          }
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(waitutility.Implicitwait, TimeUnit.SECONDS);
          driver.navigate().to(config.getProperty("URL"));
      }
      
      @AfterTest
      public void close()
      {
    	 // driver.quit();
      }
}
