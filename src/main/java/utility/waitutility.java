package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Timeouts;

import driverbase.BaseDriver;

public class waitutility extends BaseDriver
{
	public static long PageLoadTimeout = 10;
    public static long Implicitwait = 10;
    public static long sleep = 5000;
    
    public static void Implicitwait()
    {
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
