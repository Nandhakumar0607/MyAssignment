package myassignment.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Nandha");
		driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("NP");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("PN");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("I LOVE TESTING");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("b.nandhakumar0212@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd1 = new Select(state);
		dd1.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[contains(@value,'Create')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("I TOO LOVE TESTING");
		driver.findElement(By.xpath("//input[contains(@value,'Update')]")).click();
		String S = driver.getTitle();
		System.out.println("The Title of the Page id: " + S);
		
	}

}
