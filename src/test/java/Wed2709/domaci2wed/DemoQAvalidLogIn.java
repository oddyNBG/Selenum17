package Wed2709.domaci2wed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoQAvalidLogIn {

//    Domaci Zadatak 2:
//    https://demoqa.com/text-box napisati test case za dati text box

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/text-box");

        WebElement nameBox = driver.findElement(By.id("userName"));
        String userName = "Marko Markovic";
        nameBox.sendKeys(userName);

        WebElement mailBox = driver.findElement(By.id("userEmail"));
        String userEmail = "marko.markovic@gmail.com";
        mailBox.sendKeys(userEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        String curAdr = "Milentija Popovica 19";
        currentAddress.sendKeys(curAdr);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        String permAdr = "Milutina Milankovica 23";
        permanentAddress.sendKeys(permAdr);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        String expectedURL = "https://demoqa.com/text-box";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);

        WebElement resultBox = driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12"));
        Assert.assertTrue(resultBox.isDisplayed());

        WebElement resultEmail = driver.findElement(By.id("email"));
        String expectedEmailMessage = "Email:" + userEmail;
        Assert.assertEquals(resultEmail.getText(), expectedEmailMessage);



    }
}
