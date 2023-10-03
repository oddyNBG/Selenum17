package Thu2809;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium7imageUpload {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://crop-circle.imageonline.co/#circlecropresult");

        //Desni klik na sliku -> Properties
        //Kopirate lokaciju
        //Dodate dva backslasha \\ naziv slike i njenu ekstenziju (jpg, png)
        String imageLocation = "C:\\Users\\dejan.avdijenko\\Downloads\\laptop.png";

        WebElement inputImage = driver.findElement(By.id("inputImage"));

        inputImage.sendKeys(imageLocation);

    }
}
