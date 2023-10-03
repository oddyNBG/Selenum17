package Thu2809;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WordPressHappyLogIn {

//    Happy log in to WordPress.com

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://wordpress.com/");


        WebElement logInButton = driver.findElement(By.xpath("/html/body/nav/ul[2]/li[1]/a"));
        logInButton.click();

        WebElement mailUserBox = driver.findElement(By.id("usernameOrEmail"));
        mailUserBox.sendKeys("darkomarko");

        WebElement continueButton = driver.findElement(By.cssSelector(".button.form-button.is-primary"));
        continueButton.click();

        Thread.sleep(2000);
        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys("DareCareDajPare");


    }
}
