package Sun0110Sun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci1Sun {

//      Ulogujte se na demoqa(https://demoqa.com/ -> Book Store Application) preko cookies-a, dodati dve knjige
//      na svoj nalog, zatim se izlogovati brisanjem cookies-a. Ulogovati se ponovo preko log-in forme i potvrditi
//      da se knjige i dalje nalaze na nalogu.

//    Marko, Markovic, MarMar, Mar#Mar.123

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/books");

        Cookie logInCookie = new Cookie("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6Ik1hck1hciIsInBhc3N3b3JkIjoiTWFyI01hci4xMjMiLCJpYXQiOjE2OTYyNTA1OTB9.5VNxHQMB50p3rX_5XpnKfPASWawSZdYzverEV7yMy7U");

        driver.manage().addCookie(logInCookie);
        driver.navigate().refresh();

    }

}
