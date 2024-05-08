package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        //instance of chromedriver
        WebDriver driver = new ChromeDriver() ;
        //open the chome browser
        driver.get("https://facebook.com/");
        //maximise the window
        driver.manage().window().maximize();
        //fullscreen  window
        //driver.manage().window().fullscreen();

        //get the title of the webpage
        String title = driver.getTitle();
        System.out.println("the title of the page is "+ title);
        //just for observation
        Thread.sleep(4000);
        driver.quit();


    }
}
