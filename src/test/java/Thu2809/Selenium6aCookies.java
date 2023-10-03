package Thu2809;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium6aCookies {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://wordpress.com/");

        Cookie cookie = new Cookie("wordpress_logged_in", "darkomarko%7C1790777802%7CbibJzl031NZ2NyAPWMRIN4unQG8AMlYWVCnRJyvZzLa%7C8400102a338527104a41d4cb2fd804f757cf99db85db9faf088f5d577a46a146");

        driver.manage().addCookie(cookie);
        driver.navigate().refresh();

//        Thread.sleep(2000);
//        driver.manage().deleteAllCookies();
//        driver.navigate().refresh();


    }
}