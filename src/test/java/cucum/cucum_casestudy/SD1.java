package cucum.cucum_casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SD1 {
	WebDriver w;
	@Given("^User must be in home page and clicks on SignUp link$")
	public void user_must_be_in_home_page_and_clicks_on_SignUp_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\s.sivapragasam\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    w=new ChromeDriver();
	    w.get("http://10.232.237.143:443/TestMeApp/");
	    w.findElement(By.partialLinkText("SignUp")).click();
	}

	@When("^Register by entering the following data: give username as \"([^\"]*)\" and firstname as \"([^\"]*)\" and lastname as \"([^\"]*)\" and password as \"([^\"]*)\" and confirm password as \"([^\"]*)\" and gender as \"([^\"]*)\" and email as \"([^\"]*)\" and mobile number as \"([^\"]*)\" and DOB as \"([^\"]*)\" and address as \"([^\"]*)\" and select security question as \"([^\"]*)\" and give answer as \"([^\"]*)\"$")
	public void register_by_entering_the_following_data_give_username_as_and_firstname_as_and_lastname_as_and_password_as_and_confirm_password_as_and_gender_as_and_email_as_and_mobile_number_as_and_DOB_as_and_address_as_and_select_security_question_as_and_give_answer_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   w.findElement(By.name("userName")).click();
	   w.findElement(By.name("userName")).sendKeys(arg1);
	   w.findElement(By.name("firstName")).click();
	   w.findElement(By.name("firstName")).sendKeys(arg2);
	   w.findElement(By.name("lastName")).click();
	   w.findElement(By.name("lastName")).sendKeys(arg3);
	   w.findElement(By.name("password")).click();
	   w.findElement(By.name("password")).sendKeys(arg4);
	   w.findElement(By.name("confirmPassword")).click();
	   w.findElement(By.name("confirmPassword")).sendKeys(arg5);
	   w.findElement(By.cssSelector(arg6));
	   w.findElement(By.name("emailAddress")).click();
	   w.findElement(By.name("emailAddress")).sendKeys(arg7);
	   w.findElement(By.name("mobileNumber")).click();
	   w.findElement(By.name("mobileNumber")).sendKeys(arg8);
	   w.findElement(By.name("dob")).click();
	   w.findElement(By.name("dob")).sendKeys(arg9);
	   w.findElement(By.name("address")).click();
	   w.findElement(By.name("address")).sendKeys(arg10);
	   Select s=new Select(w.findElement(By.name("securityQuestion")));
	   s.selectByVisibleText(arg11);
	   w.findElement(By.name("answer")).click();
	   w.findElement(By.name("answer")).sendKeys(arg12);
	   w.findElement(By.name("Submit")).click();
	}

	@Then("^User must be in login page$")
	public void user_must_be_in_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  if(w.getTitle().contains("Login"))
	  {
		  System.out.println("Registration done successfully");
	  }
	  else
	  {
		  System.out.println("Registration not done");
	  }
	}

}
