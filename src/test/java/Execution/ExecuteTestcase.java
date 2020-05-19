package Execution;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;



import driverbase.BaseDriver;
import pages.Homepage;
import pages.PracticePage;
import utility.waitutility;

public class ExecuteTestcase  extends BaseDriver
{

	@Test(priority = 1)
	public void verifyPracticepage() throws InterruptedException
	{
		  log.info("Practice page Test started");
		 PracticePage  ppobj = new PracticePage();
		ppobj.Enterfirstname("chandan");
		ppobj.Enterlastname("way2testing");
		Thread.sleep(waitutility.sleep);
			     
	}
	@Test(priority = 2)
	public void homepagetest() throws InterruptedException
	{
		log.info("Homepage test started");
		Homepage hpobj  = new Homepage();
		
		hpobj.clickhome();
		Thread.sleep(waitutility.sleep);
	}

}
