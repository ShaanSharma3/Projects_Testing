package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import Pages.home;

public class TestCase1 {
@Test
	public void login1() throws InterruptedException{
		
	
	WebDriver driver;
	driver = new ChromeDriver();
	driver.get("https://o2.openmrs.org/openmrs/referenceapplication/login.page");
	
	
	
	home h = new home(driver);
	h.login("bhu","1234");
	h.login(" ","");
	h.login("admin","Admin123");
	
	h.Register("deep","k","v");
	h.Editpage();

	}
}
