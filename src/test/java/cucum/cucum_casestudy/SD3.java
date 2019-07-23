package cucum.cucum_casestudy;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SD3 {
	WebDriver w;
	@Given("^user logged in to TestMeApp$")
	public void user_logged_in_to_TestMeApp() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.sivapragasam\\Downloads\\chromedriver_win32\\\\chromedriver.exe");
		w=new ChromeDriver();
		w.get("http://10.232.237.143:443/TestMeApp/");
	    w.findElement(By.partialLinkText("SignIn")).click();
	    w.findElement(By.name("userName")).sendKeys("lalitha");
		w.findElement(By.name("password")).sendKeys("password123");
		w.findElement(By.name("Login")).click();
	}

	@When("^User search a particular product by giving key words of <product>$")
	public void user_search_a_particular_product_by_giving_key_words_of_product(DataTable dt) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<Map<String,String>> m=dt.asMaps(String.class, String.class);
		for(int i=0;i<m.size();i++)
	    {
			w.findElement(By.name("products")).sendKeys(m.get(i).get("product"));
			w.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
			testmeapp_displays_the_product();
	    }
		
		
	}

@Then("^TestMeApp displays the product$")
public void testmeapp_displays_the_product() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertNotEquals("Sorry no products available in this category. Please try some other", w.getTitle());
    w.findElement(By.partialLinkText("Home")).click();
    
}
}
