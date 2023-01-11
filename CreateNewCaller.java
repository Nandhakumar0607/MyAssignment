package serviceNowApplication;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.sukgu.Shadow;

public class CreateNewCaller {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dev144491.service-now.com/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("Banu@2812");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(9000);
		Shadow dom = new Shadow(driver);
		dom.findElementByXPath("//div[text()='All']").click();
		dom.findElementByXPath("//input[@id='filter']").sendKeys("Callers");
		Thread.sleep(5000);
		dom.findElementByXPath("//mark[text()='Callers']").click();
		WebElement frame = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);		
		driver.findElement(By.xpath("//button[text()='New']")).click();
		//driver.executeScript("arguments[0].click();",New);
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("Nandha");
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("IT Technician");
		driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("b.nandhakumar0212@gmail.com");
		driver.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys("1478529633");
		driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("9940332576");
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		
	}

}
