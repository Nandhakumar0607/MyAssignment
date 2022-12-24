package myassignment.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following-sibling::button/span[@class='ui-button-text ui-c']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println("The Text from Alert :"+ alert1.getText());
		alert1.accept();
	
		
	}

}
