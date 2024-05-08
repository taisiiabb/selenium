package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioBtns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement radioButton : radioButtons) {
            String value = radioButton.getAttribute("value");
            if (value.equals("15-50")) {
                radioButton.click();
                break;
            }
        }

    }
}
