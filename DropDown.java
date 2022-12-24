package myassignment.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01b6hhw7csjf211q4hnvqtdlyg710515.node0");
		WebElement dd1 = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select tool = new Select(dd1);
		tool.selectByVisibleText("Selenium");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ui-selectonemenu-trigger ui-state')]")).click();
		driver.findElement(By.xpath("//li[@data-label='India']")).click();
		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
		driver.findElement(By.xpath("//li[@data-label='English']")).click();
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[@data-label='Chennai']")).click();
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		driver.findElement(By.xpath("//li[@data-label='Three']")).click();

		

	}

}
