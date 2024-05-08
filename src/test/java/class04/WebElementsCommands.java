package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");

        WebElement textBox = driver.findElement(By.xpath("//input[@id= 'textInput']"));
        textBox.clear();
        textBox.sendKeys("abracadabra");

        // check if the radio button is enabled
        //if yes click on it
        // confirm if it is selected
        WebElement button1 = driver.findElement(By.xpath("//input[@value='option']"));
        button1.isEnabled();
        if(button1.isEnabled()){
            button1.click();
        }
        button1.isSelected();
        // check if the radio button is enabled
        //if yes click on it
        // confirm if it is selected
        WebElement button2 = driver.findElement(By.xpath("//input[@value='option1']"));
        button2.isEnabled();
        if(button2.isEnabled()){
            button2.click();
        }
        button1.isSelected();

        WebElement rb2 = driver.findElement(By.xpath("//input[@value='option2']"));
        System.out.println("The status of the button is " + rb2.isEnabled());

        WebElement rb3 = driver.findElement(By.xpath("//input[@value='option3']"));
        System.out.println("The status of display of the radio button 3 is " + rb3.isDisplayed());

        //get the text from the webelement
        WebElement text = driver.findElement(By.xpath("//div[@id='textElement']"));
        System.out.println(text.getText());

        WebElement attribute = driver.findElement(By.xpath("//div[@id='attributeElement']"));
        System.out.println(attribute.getAttribute("data-custom-attribute"));

        //click on the radio button
        WebElement maleButton = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        maleButton.click();




    }
}
