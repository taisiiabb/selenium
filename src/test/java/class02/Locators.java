package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
//find the element email address and send email address to it
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("fancyjwlry@gmail.com");
        //pass the password
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("abracadabra");
        //find the buttom
        WebElement button = driver.findElement(By.name("login"));
        //button.click();
        WebElement createAccount = driver.findElement(By.linkText("Create new account"));
        createAccount.click();

    }
}
