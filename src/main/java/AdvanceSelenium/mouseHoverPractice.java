package AdvanceSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import sun.jvm.hotspot.utilities.Assert;

import java.util.concurrent.TimeUnit;

public class mouseHoverPractice {

    public static void main(String[]args){

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement imgl = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
        WebElement text1 = driver.findElement(By.xpath("(//div[@class='figcaption'])[1]/h5"));
        WebElement link1 = driver.findElement(By.xpath("(//div[@class='figcaption'])[1]/h5"));

        Actions act = new Actions(driver);
        act.moveToElement(imgl).build().perform();
        Assert Assert;
        text1.getText().equals(Assert),"name: user1");
        Assert.that(link1.isEnabled());

    }

