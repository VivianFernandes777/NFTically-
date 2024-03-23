package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.TestBase;

public class Learn extends TestBase {

	@Test(priority = 1)
	public void whatisBlockchain_click() throws InterruptedException {
		WebElement mainmenu = driver.findElement(By.xpath(loc.getProperty("learntopmenu")));
		WebElement subMenu = driver.findElement(By.xpath(loc.getProperty("dropwhatisblockchain")));
		
		Actions action = new Actions(driver);
		action.moveToElement(mainmenu).perform();
		action.moveToElement(subMenu).click().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test(priority = 2)
	public void whatisNft_click() throws InterruptedException {
		Thread.sleep(3000);
		WebElement mainmenu = driver.findElement(By.xpath(loc.getProperty("learntopmenu")));
		WebElement subMenu = driver.findElement(By.xpath(loc.getProperty("dropwhatisnft")));

		Actions action = new Actions(driver);
		action.moveToElement(mainmenu).perform();
		action.moveToElement(subMenu).click().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test(priority = 3)
	public void whatismetaverse_click() throws InterruptedException {
		Thread.sleep(3000);
		WebElement mainmenu = driver.findElement(By.xpath(loc.getProperty("learntopmenu")));
		WebElement subMenu = driver.findElement(By.xpath(loc.getProperty("dropwhatismetaverse")));

		Actions action = new Actions(driver);
		action.moveToElement(mainmenu).perform();
		action.moveToElement(subMenu).click().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		driver.navigate().back();
	}
}
