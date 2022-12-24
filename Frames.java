package myassignment.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//b[text()='Topic :']/following-sibling::input")).sendKeys("Selenium");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']/following-sibling::input")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement dd1 = driver.findElement(By.xpath("//select[@id='animals']"));
		Select dd = new Select(dd1);
		dd.selectByVisibleText("Big Baby Cat");
		
	
	}

}
