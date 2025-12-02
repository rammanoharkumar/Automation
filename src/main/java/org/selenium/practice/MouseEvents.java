package org.selenium.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseEvents {

    WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);

  @Test
    public void doubleClick() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
        actions.doubleClick(doubleClickButton).build().perform();

        boolean result = driver.findElement(By.id("doublec")).isDisplayed();

        if(result)
            System.out.println("Message displayed");
        else
            System.out.println("Message not displayed");

        driver.quit();

    }

    @Test
    public void rightClick() throws AWTException, InterruptedException {
        driver.get("https://www.google.com");
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        WebElement rightClickButton = driver.findElement(By.xpath("//button[text()='Right Click Me']"));

        actions.contextClick(rightClickButton).pause(500).build().perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
//		actions.sendKeys(Keys.ENTER).build().perform();
//

        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        System.out.println(driver.getCurrentUrl());
        //driver.quit();


    }

    @Test
    public void dragDrop() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
        WebElement sourceelement = driver.findElement(By.id("draggable"));
        WebElement destinationElement = driver.findElement(By.id("droppable"));

        actions.dragAndDrop(sourceelement, destinationElement).build().perform();

        Thread.sleep(3000);

        driver.quit();
    }

    @Test
    public void handlingScroll() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/scroll-down.php");
        actions.scrollToElement(driver.findElement(By.xpath("//h3[text()='Where can I get some?']"))).perform();
        Thread.sleep(3000);
        driver.quit();

    }


}




