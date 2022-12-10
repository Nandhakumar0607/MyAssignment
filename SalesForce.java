package myassignment.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hari.radakrishnan@geagel.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();

	}

}
