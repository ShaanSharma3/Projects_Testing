package stepdefination;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Teststeps {
   
	WebDriver driver;
	@Given("open the openMRS website")
	public void navigate() {
		driver = new ChromeDriver();
		driver.get("https://o2.openmrs.org/openmrs/referenceapplication/login.page");
	}
	//@When("click on the Contact button")
//	public void clickAboutus() {
//		WebElement button=driver.findElement(By.xpath("//*[@id=\"menu-item-73181\"]/a"));
//		button.click();
//	}
	@When("login to the account")		
public void login() {

	By clickon=By.xpath("//*[@id=\"Inpatient Ward\"]");
	
	
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Admin123");
		driver.findElement(clickon).click();
		driver.findElement(By.id("loginButton")).click();
		
		
		
	}
	//@Then("should be redirected to the About page")
//	public void validate() {
//		
//		String at = driver.getTitle();
//		if (at.equals("About Us - QAI Global Institute")) {
//		    System.out.println(at + " is working");
//		} else {
//		    System.out.println(at + " is not working");
//		}
//		
//		
//	}
	@Then("Register and edit the account")
	public void Register() throws InterruptedException {
		By reg = By.xpath("//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]");
		
		driver.findElement(reg).click();
		driver.findElement(By.name("givenName")).sendKeys("ruth");
		driver.findElement(By.name("middleName")).sendKeys("n");
		driver.findElement(By.name("familyName")).sendKeys("a");
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
		
		
		WebElement dropdown = driver.findElement(By.id("gender-field")); // Replace with actual ID
		Select select = new Select(dropdown);
        select.selectByValue("F");
        
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        
        driver.findElement(By.name("birthdateDay")).sendKeys("08");
        driver.findElement(By.name("birthdateYear")).sendKeys("2002");
        
        WebElement dropdown1 = driver.findElement(By.id("birthdateMonth-field")); // Replace with actual ID
		Select mon = new Select(dropdown1);
        mon.selectByValue("2");
        
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("bengalure");
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        
        driver.findElement(By.name("phoneNumber")).sendKeys("9999888899");
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        
        WebElement dropdown2 = driver.findElement(By.id("relationship_type")); // Replace with actual ID
		Select type = new Select(dropdown2);
        type.selectByValue("8d91a01c-c2cc-11de-8d13-0010c6dffd0f-A");
        
        driver.findElement(By.xpath("//*[@id=\"relationship\"]/p[2]/input[1]")).sendKeys("bhavana");
        
        driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(1000);
        
        Thread.sleep(1000);
        
		driver.findElement(By.xpath("//*[@id=\"edit-patient-demographics\"]/a")).click();
		driver.findElement(By.name("middleName")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id=\"save-form\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"registration-submit\"]")).click();
        
       
			    		
    	
        
        
       
		
	}
}

