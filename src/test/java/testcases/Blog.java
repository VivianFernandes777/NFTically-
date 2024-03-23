package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.TestBase;

public class Blog extends TestBase{
	@Test(priority = 1)
	public void blog_dropdwon() throws InterruptedException {
		WebElement Blog = driver.findElement(By.xpath(loc.getProperty("dropdwonblog")));

		Actions action = new Actions(driver);
		action.moveToElement(Blog).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
}
