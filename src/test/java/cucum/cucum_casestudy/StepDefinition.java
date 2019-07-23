package cucum.cucum_casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver w;
	@Given("^User must be registered and directed to login page$")
	public void user_must_be_registered_and_directed_to_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.sivapragasam\\Downloads\\chromedriver_win32\\\\chromedriver.exe");
		w=new ChromeDriver();
		w.get("http://10.232.237.143:443/TestMeApp/");
	    w.findElement(By.partialLinkText("SignIn")).click();
	    
	}

	
	@When("^login by entering \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_by_entering_and(String arg1,String arg2) throws Throwable {
		w.findElement(By.name("userName")).sendKeys(arg1);
		w.findElement(By.name("password")).sendKeys(arg2);
		w.findElement(By.name("Login")).click();
	
	}

	@Then("^User must be in homepage$")
	public void user_must_be_in_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   if(w.getTitle().contains("Home"))
	   {
	   System.out.println("Login done successfully");
	   }
	   else
	   {
		   System.out.println("Login is not done successfully");
	   }
	}
}
