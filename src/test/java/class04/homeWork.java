package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement button = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        button.click();
        WebElement checkBox = driver.findElement(By.xpath("//input[@class='checkbox-field' and @value='Checkbox-4']"));
        checkBox.click();
    }
}
