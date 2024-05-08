package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath.php");

// to send the username in the textbox
        WebElement userName = driver.findElement(By.xpath("//input[@id='title']"));
        userName.sendKeys("abracadabra");

//click the button
        WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Here']"));
        clickButton.click();

//write something in the text field
        WebElement sq1 = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        sq1.sendKeys("Hello Java!");

//get the text
        WebElement text = driver.findElement(By.xpath("//label[contains(text(),'ipsum')]"));
        System.out.println(text.getText());
//if our attributes have numbers or spaces, we can search by partial name
        WebElement apiSettings  = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSettings.sendKeys("abracadabra 12345");
//if there are several elements with the same tags nd attributes, we can use indexing. We encapsulate he path with () and add index in square brackets in the end
        WebElement email = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email.sendKeys("hello@gmail.com");

        WebElement field2 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("helloi am here");

        //this is if the identified sibling is first:
        //input[@id='favourite-book']/following-sibling::input[2]

        //this is if the identified sibling is last:
        //input[@id='least-favorite']/preceding-sibling::input[1]
        // input[@id='least-favorite']/preceding-sibling::input[2]
        //input[@id='least-favorite']

        //if there is no immediately identified sibling, use parent identifier:
        //div[@id='familyTree']/child::input[3]

        WebElement followingSiblings = driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        followingSiblings.sendKeys("abcdef");








    }
}
