package org.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Test {
    public static void main(String[] args){

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        //driver.manage().window().maximize();
        WebElement button=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
        String text= button.getText();
        System.out.println(text);
        driver.quit();
    }
}
