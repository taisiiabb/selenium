package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://ebay.com");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for (WebElement allLink : allLinks) {
            String linkText = allLink.getAttribute("href");
            System.out.println(linkText);
        }

    }
}
