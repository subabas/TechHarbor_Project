package AdvanceSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class checkBoxPractice {

    public static void main(String[] args){

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement chk1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement chk2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        if (chk1.isSelected()){
            System.out.println("check box 1 is already selected");
        }
        else{
            chk1.click();
        }
        if (chk2.isSelected()){
            chk2.click();
        }

    }
}
