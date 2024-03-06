package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
//import io.cucumber.java.en.*;
//import java.util.concurrent.TimeUnit;
import  org.openqa.selenium.WebDriver;





public class Login {
	 WebDriver driver = null;
	 @Given("browser is open")
	public void browser_is_open() {
		
		
		
		System.setProperty("webdriver.chrome.driver","CucumberJava/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
	 }
		
		@And("user is on login page")
		public void user_is_on_login_page() {
		    driver.navigate().to("https://accounts.vmmaps.com/");
		}

		@When("user enters mail id and password")
		public void user_enters_mail_id_and_password() {
			driver.findElement(By.id("login-email")).sendKeys("xyz@yahoo.com");
			driver.findElement(By.id("login-password")).sendKeys("87654321");
			
		    
		}

		@And("user clicks login button")
		public void user_clicks_login_button() {
			driver.findElement(By.id("login-submit-text")).click();
		}

		@Then("user is navigated to the homepage")
		public void user_is_navigated_to_the_homepage() {
			driver.findElement(By.id("signinFormError")).isDisplayed();
			driver.close();
			
			
		}



}
	 
