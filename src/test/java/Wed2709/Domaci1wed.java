package Wed2709;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci1wed {

//    Otici na YouTube i pustiti jednu pesmu po Vasem izboru.

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.youtube.com/");

//        WebElement searchBox = driver.findElement(By.name("search_query"));
//        Nije hteo da mi pristupi elementu po id "search" pa sam promenio na name...

        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("goorilaz feel good inc");

        WebElement magnifierIcon = driver.findElement(By.id("search-icon-legacy"));
        magnifierIcon.click();

        Thread.sleep(2000);
        WebElement trackTitle = driver.findElement(By.linkText("Gorillaz - Feel Good Inc. (Official Video)"));
        trackTitle.click();

    }

}
