package hooks_steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import week3.day1.B;

public class LoginLeaftapsHooks extends BaseClass {

	

@Given("user should redireced to Homepage")
public void user_should_redireced_to_homepage() {
   String title = driver.getTitle();
   System.out.println(title);
}

@When("user clicks on {string}")
public void clickLink(String text) {
	driver.findElement(By.linkText(text)).click();

}

@Then("{string} page should displayed")
public void Page_Should_Displayed(String title) {
	driver.findElement(By.xpath("//div[text()='"+title+"']"));


}

@When("user enter Firstname as {string}")
public void user_enter_firstname_as(String fname) {
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	
}

@When("user enter Lastname as {string}")
public void user_enter_lastname_as(String lname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
   
}

@When("user enter Company as {string}")
public void user_enter_company_as(String company) {
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
   
}

@When("user click {string} button")
public void user_click_button(String proceess) {
	driver.findElement(By.xpath("//input[@value='"+proceess+"']")).click();
}


@When("user select phone Option")
public void user_select_phone_option() {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
}

@Then("user enter phone as {string}")
public void user_enter_phone_as_phone(String Phne) {
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(Phne);
	
}

@When("user click on Find Leads button")
public void user_click_on_find_leads_button() {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
   
}

@When("user click on First result")
public void user_click_on_first_result() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

}



@When("user update Company as {string}")
public void user_update_company_as_company(String company) {
	
	WebElement Comp = driver.findElement(By.id("updateLeadForm_companyName"));
    Comp.clear();
    Comp.sendKeys(company);
}

@Then("Leads got Updated")
public void leads_got_updated() {
	if(driver.getTitle().contains("View Lead"))
	{
		System.out.println("Lead got Updated");
	}
	else
	{
		System.out.println("Lead not got updated");
	}
}

@Then("Leads got Deleted")
public void leads_got_deleted() {
	if(driver.getTitle().contains("My Leads"))
	{
		System.out.println("Lead got Deleted");
	}
	else
	{
		System.out.println("Lead not got Deleted");
	}
}

}

















