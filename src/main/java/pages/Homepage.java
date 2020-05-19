package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverbase.BaseDriver;
import utility.waitutility;

public class Homepage extends BaseDriver  
{ 
	
    public Homepage()
    {    	    
        	PageFactory.initElements(driver, this);
    }
    
    @FindBy (xpath = "//b[contains(text(),'Home')]")  WebElement home;
    
    public void clickhome()
    {
    	waitutility.Implicitwait();
    	home.click();
    }
}
