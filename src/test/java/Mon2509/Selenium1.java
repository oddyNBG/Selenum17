package Mon2509;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

    public static void main(String[] args) {

        // System.setProperty("webdrive.chrome.driver", "driver-lib\\chromedriver.exe"); --depricated

        WebDriverManager.chromedriver().setup(); // Setujemo chrome driver
        WebDriver driver = new ChromeDriver(); // Kreiramo objekat od chrome drivera

//        driver.get("https://www.google.com"); //Dajemo komandu drajveru na koji link da ode
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().forward();
        driver.quit();




    }
}
