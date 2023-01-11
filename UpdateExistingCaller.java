package serviceNowApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class UpdateExistingCaller {

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
		driver.findElement(By.xpath("//a[text()='Kumar']")).click();
		WebElement UpdateBisPhone = driver.findElement(By.xpath("//input[@id='sys_user.phone']"));
		UpdateBisPhone.clear();
		UpdateBisPhone.sendKeys("2580140698");
		driver.findElement(By.xpath("//button[@id='sysverb_update_bottom']")).click();
		String UpdatedNum = driver.findElement(By.xpath("(//td[@class='vt'])[3]")).getText();
		System.out.println("The Updated Business number is " + UpdatedNum);
		driver.quit();
//		WebElement ele = driver.findElement(By.xpath("//td[text()='1478529633']"));
//		String text = ele.getText();
//		Actions act = new Actions(driver);
//		act.doubleClick(ele);
//		ele.clear();
//		ele.sendKeys("3369852147");
		

	}

}
