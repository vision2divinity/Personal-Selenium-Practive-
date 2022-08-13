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
		driver.findElement(By.id("firstname")).sendKeys("James");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("lastname")).sendKeys("john");
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
		driver.findElement(By.id("email_address")).sendKeys("v@qa.team");
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
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		try {
			Thread.sleep(10*5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//t
		driver.findElement(By.cssSelector("[src='https://magento.softwaretestingboard.com/pub/static/version1656613854/frontend/Magento/luma/en_US/images/logo.svg']")).click();
		try {
			Thread.sleep(10*5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//this is signing in
		driver.findElement(By.xpath("//div[@class='panel header']//a[contains(.,'Sign In')]")).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("email")).sendKeys("v@qa.team");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("pass")).sendKeys("qwerty12");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@class='action login primary']/span[.='Sign In']")).click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*this for forgot password
		driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[.='Forgot Your Password?']")).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("email_address")).sendKeys("ve@qa.team");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//driver.findElement(By.id("captcha_user_forgotpassword")).sendKeys();
		//driver.findElement(By.xpath("//span[.='Reload captcha']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Reset My Password']")).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}  */
		driver.findElement(By.xpath("//a[@aria-label='store logo']//img")).click();
		//driver.findElement(By.cssSelector("[src='https://magento.softwaretestingboard.com/pub/static/version1656613854/frontend/Magento/luma/en_US/images/logo.svg']")).click();
		
		driver.findElement(By.xpath("//label[@for='search']")).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//driver.findElement(By.id("search")).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("search")).sendKeys("yoga");
		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@class='columns']//div[3]//div[2]//ul[1]//li[2]//a[1]//span[2]")).clear();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//img[@alt='Sprite Yoga Companion Kit']")).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//span[normalize-space()='Customize and Add to Cart']")).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@value='3']")).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//fieldset[@class='fieldset fieldset-bundle-options']/div[1]//input[@class='input-text qty']")).sendKeys("6");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//fieldset[@class='fieldset fieldset-bundle-options']/div[2]//input[@class='input-text qty']")).sendKeys("5");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/fieldset[1]/div[3]/div[1]/div[1]/div[3]/input[1]")).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/fieldset[1]/div[3]/div[1]/div[1]/div[5]/div[1]/input[1]")).sendKeys("4");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/fieldset[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("3");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("10");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();
	}

}
