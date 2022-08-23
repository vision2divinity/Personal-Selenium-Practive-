import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addtocart {
    public static void main(String[] args) {

        // WebDriverManager.chromedriver().setup();
        // ChromeDriver driver = new ChromeDriver();

        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://magento.softwaretestingboard.com/");

        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(
                By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]"))
                .click();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // driver.findElement(By.id("search")).click();
        // try {
        // Thread.sleep(2000);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        driver.findElement(By.id("search")).sendKeys("yoga");
        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(
                By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[3]/div[2]/ul[1]/li[2]/a[1]/span[2]"))
                .click();

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
        driver.findElement(By
                .xpath("//fieldset[@class='fieldset fieldset-bundle-options']/div[1]//input[@class='input-text qty']"))
                .clear();
        driver.findElement(By
                .xpath("//fieldset[@class='fieldset fieldset-bundle-options']/div[1]//input[@class='input-text qty']"))
                .sendKeys("1");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By
                .xpath("//fieldset[@class='fieldset fieldset-bundle-options']/div[2]//input[@class='input-text qty']"))
                .clear();
        driver.findElement(By
                .xpath("//fieldset[@class='fieldset fieldset-bundle-options']/div[2]//input[@class='input-text qty']"))
                .sendKeys("1");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/fieldset[1]/div[3]/div[1]/div[1]/div[3]/input[1]"))
                .click();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/fieldset[1]/div[3]/div[1]/div[1]/div[5]/div[1]/input[1]"))
                .clear();
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/fieldset[1]/div[3]/div[1]/div[1]/div[5]/div[1]/input[1]"))
                .sendKeys("1");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/fieldset[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]"))
                .clear();
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/fieldset[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]"))
                .sendKeys("1");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
                .clear();
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
                .sendKeys("1");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]"))
                .click();
        try {
            Thread.sleep(10 * 1000);
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
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[1]/button[1]/span[1]")).click();
        try {
            Thread.sleep(10 * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/input[1]"))
                .sendKeys("yesin@eay.jp");
        try {
            Thread.sleep(8000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/fieldset[1]/fieldset[1]/div[1]/div[1]/input[1]"))
                .sendKeys("qwerty12@");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/fieldset[1]/fieldset[1]/div[2]/div[1]/button[1]/span[1]"))
                .click();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("James");
        // try {
        // Thread.sleep(2000);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys("love");
        // try {
        // Thread.sleep(2000);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[3]/div[1]/input[1]"))
                .sendKeys("Vision Tech GH");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/input[1]"))
                .sendKeys("Planet Close Jmaes Town");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/fieldset[1]/div[1]/div[2]/div[1]/input[1]"))
                .sendKeys("Car Fish Street");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/fieldset[1]/div[1]/div[3]/div[1]/input[1]"))
                .sendKeys("mahogany crescent");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[4]/div[1]/input[1]"))
                .sendKeys("New York");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[5]/div[1]/select[1]"))
                .click();
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[5]/div[1]/select[1]"))
                .sendKeys("U");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[5]/div[1]/select[1]"))
                .sendKeys(Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[7]/div[1]/input[1]"))
                .sendKeys("21311");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[8]/div[1]/select[1]")).click();
        // driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[8]/div[1]/select[1]")).sendKeys("United
        // States");
        // try {
        // Thread.sleep(2000);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[8]/div[1]/select[1]"))
                .sendKeys(Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[9]/div[1]/input[1]"))
                .sendKeys("+233574482260");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[2]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]"))
                .click();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[2]/div[1]/div[3]/form[1]/div[3]/div[1]/button[1]/span[1]"))
                .click();
    }
}
