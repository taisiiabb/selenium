package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators02 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.name("ctl00$MainContent$username"));
        username.sendKeys("Tester");
        WebElement passWord = driver.findElement(By.name("ctl00$MainContent$password"));
        passWord.sendKeys("test");
        WebElement loginButton = driver.findElement(By.name("ctl00$MainContent$login_button"));
        loginButton.click();
        //confirm that you have logged in
        WebElement message = driver.findElement(By.className("login_info"));
        //get the text from teh element
        String text = message.getText();

        System.out.println("the text is "+ text);

        String title = driver.getTitle();
        System.out.println(title);

        if(title.equals("Web Orders")){
            System.out.println("you have logged in");
        } else{
            System.out.println("you haven't logged in");
        }


    }
}
