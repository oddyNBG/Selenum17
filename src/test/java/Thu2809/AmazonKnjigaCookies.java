package Thu2809;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AmazonKnjigaCookies {

//    Zadatak 7
//https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2
//Testirati dodavanje knjige u korpu i da li se knjiga obrise kada obrisete kolacice

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2");

        WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
        addToCart.click();

        WebElement goToCart = driver.findElement(By.id("sw-gtc"));
        goToCart.click();

        Thread.sleep(2000);
        driver.manage().deleteAllCookies();

        driver.navigate().refresh();

        String expectedURL = "https://www.amazon.com/cart?ref_=sw_gtc";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);

        WebElement emptyCartMessage = driver.findElement(By.className("a-row sc-your-amazon-cart-is-empty"));
        String expectedMessage = "Your Amazon Cart is empty";
        Assert.assertEquals(emptyCartMessage.getText(), expectedMessage);





    }
}
