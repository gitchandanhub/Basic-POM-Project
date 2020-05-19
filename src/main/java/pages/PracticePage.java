package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverbase.BaseDriver;

public class PracticePage extends BaseDriver
{
	
	public PracticePage()
	{		
		PageFactory.initElements(driver, this);
	    //PageFactory.initElements(driver, PracticePage.class);
	}
	
	@FindBy (xpath = "//*[@id='post-body-2064404811754288590']/form[2]/input[1]")  WebElement firstname;
	@FindBy (xpath = "//input[@name='lastname']")  WebElement lastname;
	
	public void Enterfirstname(String name)
	{
		firstname.clear();
		firstname.sendKeys(name);
	}
	
	public void Enterlastname(String name)
	{
		lastname.clear();
		lastname.sendKeys(name);
	}
}
