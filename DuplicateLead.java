package myassignment.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		driver.findElement(By.xpath("(//input[@class=' x-form-text x-form-field'])[25]")).sendKeys("qwerty@gmail.com");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).getText();
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		if (driver.getTitle().contains("Duplicate Lead"))
		{
			System.out.println("The title is Matching");
		}
		else
		{
			System.out.println("The title is not Matching");
		}
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
		if (driver.findElement(By.id("viewLead_firstName_sp")).getText().equals(text))
		{
			System.out.println("The firstname is Matching");
		}
		else
		{
			System.out.println("The firstname is not Matching");
		}
		
	}

}
