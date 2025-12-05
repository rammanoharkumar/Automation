package org.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

    WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);

    @Test
    public void copyPasteUsingKeys() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");

        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("Will");
        WebElement lastName =  driver.findElement(By.id("lastname"));
        lastName.sendKeys("Smith");

        actions.click(firstName).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        WebElement userName = driver.findElement(By.id("username"));

        actions.click(userName).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

        actions.click(lastName).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        actions.click(userName).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

        driver.quit();
    }

}


