import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mymotto {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://mymotto-359902.oa.r.appspot.com/");

        driver.manage().window().maximize();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.findElement(
                By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]"))
                .click();
        driver.findElement(By.id("formFirstName")).sendKeys("Tuma");

        try {
            Thread.sleep(2000);
        }catch(Exception e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("formLastName")).sendKeys("Enterprises");

        try {
            Thread.sleep(2000);
        }catch(Exception e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("formOtherName")).sendKeys("Yakubu");

        try {
            Thread.sleep(2000);
        }catch(Exception e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("formMobile")).sendKeys("0542212222");

        try {
            Thread.sleep(2000);
        }catch(Exception e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("formAddres")).sendKeys("James Town, Liberia");
        try {
            Thread.sleep(2000);
        }catch(Exception e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]")).click();
        try {
            Thread.sleep(2000);
        }catch(Exception e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("forIDNumber")).sendKeys("AJS1248JA");
        try {
            Thread.sleep(2000);
        }catch(Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]")).click();
        try {
            Thread.sleep(10000);
        }catch(Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/button[1]")).click();
        try {
            Thread.sleep(2000);
        }catch(Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]")).click();
        try {
            Thread.sleep(10000);
        }catch(Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]")).click();
    }
}
