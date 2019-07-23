package cucum.cucum_casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SD4 {
	WebDriver w;
	@Given("^user has registered in to TestMeApp$")
	public void user_has_registered_in_to_TestMeApp() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.sivapragasam\\Downloads\\chromedriver_win32\\\\chromedriver.exe");
		w=new ChromeDriver();
		w.get("http://10.232.237.143:443/TestMeApp/");
	    w.findElement(By.partialLinkText("SignIn")).click();
	    w.findElement(By.name("userName")).sendKeys("lalitha");
		w.findElement(By.name("password")).sendKeys("password123");
		w.findElement(By.name("Login")).click();
	}

	@When("^User search a particular product like headphones$")
	public void user_search_a_particular_product_like_headphones() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		w.findElement(By.name("products")).sendKeys("Headphone");
		w.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		
	}

	@When("^try to proceed to payment without adding any item in the cart$")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   
	    	}

	@Then("^TestMeApp doesn't display the cart icon$")
	public void testmeapp_doesn_t_display_the_cart_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   if(w.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size()==0)
	   {
		   System.out.println("Cart icon is not displayed.\nPass");
	   }
	   else
	   {
		   System.out.println("FAIL");
	   }
	}

}
