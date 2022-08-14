import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Personal_Practice {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://magento.softwaretestingboard.com/");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//this is for signing up
		driver.findElement(By.xpath("//div[@class='panel header']//a[.='Create an Account']")).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("firstname")).sendKeys("Am");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("lastname")).sendKeys("race");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("is_subscribed")).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("email_address")).sendKeys("tal@gmail.com");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("password")).sendKeys("qwerty12@");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("password-confirmation")).sendKeys("qwerty12@");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@class='action submit primary']/span[.='Create an Account']")).click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//this is for signing out
		driver.findElement(By.xpath("//div[@class='panel header']//button[@class='action switch']")).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[3]/a[1]")).click();
		
		driver.findElement(By.cssSelector("[src='https://magento.softwaretestingboard.com/pub/static/version1656613854/frontend/Magento/luma/en_US/images/logo.svg']")).click();
		
		//driver.navigate().refresh();
	}

}
