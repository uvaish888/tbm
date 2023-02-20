package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityBaseClass {
	public static WebDriver driver;

	public static void launchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void closeBrowser() {
		driver.quit();

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void browserMaximize() {
		driver.manage().window().maximize();

	}

	public static void fill(WebElement element, String txt) {
		element.sendKeys(txt);

	}
	


	public static void btnClick(WebElement element) {
		element.click();

	}
	
	public static void impWait() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	public static void copyTxt() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void pasteTxt() throws AWTException {
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);

		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);

	}

	public static void pressTab() throws AWTException {
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_TAB);
		r2.keyRelease(KeyEvent.VK_TAB);

	}

	public static void mouseHover(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();

	}
	
	public static void scrollDown(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView('true')", ele);

	}
	
	public static String retriveText(WebElement ele) {
		 return ele.getText();

	}
	
	public static void toWait() throws InterruptedException {
		Thread.sleep(10000);

	}
	
	public static void moveToChildWind() {
		String parId = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();
		
		for (String x : allId) {
			if(!x.equals(parId)) {
				driver.switchTo().window(x);
			}
		}	
	}
	public static void mouseDoubleClick() {
		Actions ac = new Actions(driver);
		ac.doubleClick().perform();

	}
	
	public static void driverWait(WebElement ele) {
		WebDriverWait w = new WebDriverWait(driver,10);
		w.until(ExpectedConditions.elementToBeClickable(ele));
		

	}
	
	public static void pressDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);	
	}
	public static void pressEnter() throws AWTException{
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public static void toRefresh() {
		driver.navigate().refresh();

	}
	
}
