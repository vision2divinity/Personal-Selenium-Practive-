import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sign_In {
    public static void main (String[] args) {


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

       // WebDriverManager.firefoxdriver().setup();
        //FirefoxDriver driver =new FirefoxDriver();

        driver.get("https://magento.softwaretestingboard.com/");
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
        e.printStackTrace();
        }
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
        e.printStackTrace();
        }
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/input[1]")).sendKeys("yesin@eay.jp");
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
        e.printStackTrace();
        }
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/input[1]")).sendKeys("qwerty12@");
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
        e.printStackTrace();
        }
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]/span[1]")).click();
        
       

    }
}
