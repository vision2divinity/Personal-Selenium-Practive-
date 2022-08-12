import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Personal_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://magento.softwaretestingboard.com/");
		
		
		//this is for signing up
		driver.findElement(By.xpath("//div[@class='panel header']//a[.='Create an Account']")).click();
		driver.findElement(By.id("firstname")).sendKeys("James");
		driver.findElement(By.id("lastname")).sendKeys("john");
		driver.findElement(By.id("is_subscribed")).click();
		driver.findElement(By.id("email_address")).sendKeys("vee@qa.team");
		driver.findElement(By.id("password")).sendKeys("qwerty1212@");
		driver.findElement(By.id("password-confirmation")).sendKeys("qwerty12");
		driver.findElement(By.xpath("//button[@class='action submit primary']/span[.='Create an Account']")).click();
		
		//this is for signing out
		driver.findElement(By.xpath("//div[@class='panel header']//button[@class='action switch']")).click();
		driver.findElement(By.xpath("//li[@class='customer-welcome active']//a[contains(.,'Sign Out')]")).click();
		
		//this is signing in
		driver.findElement(By.xpath("//div[@class='panel header']//a[contains(.,'Sign In')]")).click();
		driver.findElement(By.id("email")).sendKeys("vee@qa.team");
		driver.findElement(By.id("pass")).sendKeys("qwerty12@");
		driver.findElement(By.xpath("//button[@class='action login primary']/span[.='Sign In']")).click();
		
		//this for forgot password
		driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[.='Forgot Your Password?']")).click();
		driver.findElement(By.id("email_address")).sendKeys("vee@qa.team");
		//driver.findElement(By.xpath("captcha_user_forgotpassword")).click();
		//driver.findElement(((Object) By.id("captcha_user_forgotpassword")).sendKeys();
		
	}

}
