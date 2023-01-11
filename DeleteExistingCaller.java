package serviceNowApplication;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class DeleteExistingCaller {

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
		Thread.sleep(20000);
		Shadow dom = new Shadow(driver);
		dom.findElementByXPath("//div[text()='All']").click();
		dom.findElementByXPath("//input[@id='filter']").sendKeys("Callers");
		Thread.sleep(5000);
		dom.findElementByXPath("//mark[text()='Callers']").click();
		WebElement frame = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);		
		WebElement ss = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
		Select S= new Select(ss);
		S.selectByValue("first_name");
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Nandha",Keys.ENTER);
		WebElement text1 = driver.findElement(By.xpath("//a[@class='linked formlink']"));
		String BeforeDelete = text1.getText();
		Thread.sleep(4000);
		text1.click();
		driver.findElement(By.xpath("//button[@id='sysverb_delete_bottom']")).click();
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		String AfterDelete = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		
		if (BeforeDelete != AfterDelete)
		{
			System.out.println("The Caller is Deleted");
		}
		else
		{
			System.out.println("The Caller is not Deleted Properly");
		}
		
		
	
	}

}
