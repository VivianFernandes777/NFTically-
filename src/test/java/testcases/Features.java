package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.TestBase;

public class Features extends TestBase {
	@Test(priority = 1)
	public void features_metaverse() throws InterruptedException {
		WebElement Featrures = driver.findElement(By.xpath(loc.getProperty("featuretopmenu")));
		WebElement Metaverse = driver.findElement(By.xpath(loc.getProperty("dropmetaverse")));
		Actions action = new Actions(driver);
		action.moveToElement(Featrures).perform();
		action.moveToElement(Metaverse).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void features_themecustomiztion() throws InterruptedException {
		WebElement Featrures = driver.findElement(By.xpath(loc.getProperty("featuretopmenu")));
		WebElement Metaverse = driver.findElement(By.xpath(loc.getProperty("droptheme&customiztion")));
		Actions action = new Actions(driver);
		action.moveToElement(Featrures).perform();
		action.moveToElement(Metaverse).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void features_marketingsupport() throws InterruptedException {
		WebElement Featrures = driver.findElement(By.xpath(loc.getProperty("featuretopmenu")));
		WebElement Metaverse = driver.findElement(By.xpath(loc.getProperty("dropmarketing&support")));
		Actions action = new Actions(driver);
		action.moveToElement(Featrures).perform();
		action.moveToElement(Metaverse).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void features_amlcompliances() throws InterruptedException {
		WebElement Featrures = driver.findElement(By.xpath(loc.getProperty("featuretopmenu")));
		WebElement Metaverse = driver.findElement(By.xpath(loc.getProperty("dropaml&compliances")));
		Actions action = new Actions(driver);
		action.moveToElement(Featrures).perform();
		action.moveToElement(Metaverse).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test(priority = 5)
	public void features_salessupport() throws InterruptedException {
		WebElement Featrures = driver.findElement(By.xpath(loc.getProperty("featuretopmenu")));
		WebElement Metaverse = driver.findElement(By.xpath(loc.getProperty("dropsales&support")));
		Actions action = new Actions(driver);
		action.moveToElement(Featrures).perform();
		action.moveToElement(Metaverse).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void features_reports() throws InterruptedException {
		WebElement Featrures = driver.findElement(By.xpath(loc.getProperty("featuretopmenu")));
		WebElement Metaverse = driver.findElement(By.xpath(loc.getProperty("dropreports")));
		Actions action = new Actions(driver);
		action.moveToElement(Featrures).perform();
		action.moveToElement(Metaverse).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test(priority = 7)
	public void features_utiliypurpose() throws InterruptedException {
		WebElement Featrures = driver.findElement(By.xpath(loc.getProperty("featuretopmenu")));
		WebElement Metaverse = driver.findElement(By.xpath(loc.getProperty("dropnft&utilitypurpose")));
		Actions action = new Actions(driver);
		action.moveToElement(Featrures).perform();
		action.moveToElement(Metaverse).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test(priority = 8)
	public void features_advancefeatures() throws InterruptedException {
		WebElement Featrures = driver.findElement(By.xpath(loc.getProperty("featuretopmenu")));
		WebElement Metaverse = driver.findElement(By.xpath(loc.getProperty("dropadvancesfeatures")));
		Actions action = new Actions(driver);
		action.moveToElement(Featrures).perform();
		action.moveToElement(Metaverse).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
}
