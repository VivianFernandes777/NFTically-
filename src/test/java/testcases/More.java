package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.TestBase;

public class More extends TestBase {
	@Test(priority = 1)
	public void more_aboutus() throws InterruptedException {
		WebElement more = driver.findElement(By.xpath(loc.getProperty("menumore")));
		WebElement aboutus = driver.findElement(By.xpath(loc.getProperty("dropdwonaboutus")));
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
		action.moveToElement(aboutus).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void more_contactus() throws InterruptedException {
		WebElement more = driver.findElement(By.xpath(loc.getProperty("menumore")));
		WebElement contactus = driver.findElement(By.xpath(loc.getProperty("dropdwoncontactus")));
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
		action.moveToElement(contactus).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void more_comerth() throws InterruptedException {
		WebElement more = driver.findElement(By.xpath(loc.getProperty("menumore")));
		WebElement comearth = driver.findElement(By.xpath(loc.getProperty("dropdwoncomearth")));
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
		action.moveToElement(comearth).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void more_helpcenter() throws InterruptedException {
		WebElement more = driver.findElement(By.xpath(loc.getProperty("menumore")));
		WebElement helpcenter = driver.findElement(By.xpath(loc.getProperty("dropdwonhelpcenter")));
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
		action.moveToElement(helpcenter).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test(priority = 5)
	public void more_faq() throws InterruptedException {
		WebElement more = driver.findElement(By.xpath(loc.getProperty("menumore")));
		WebElement faq = driver.findElement(By.xpath(loc.getProperty("dropdwonfaq")));
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
		action.moveToElement(faq).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void more_carrer() throws InterruptedException {
		WebElement more = driver.findElement(By.xpath(loc.getProperty("menumore")));
		WebElement carrers = driver.findElement(By.xpath(loc.getProperty("dropdwoncarrerrs")));
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
		action.moveToElement(carrers).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test(priority = 7)
	public void more_suggestion() throws InterruptedException {
		WebElement more = driver.findElement(By.xpath(loc.getProperty("menumore")));
		WebElement suggestion = driver.findElement(By.xpath(loc.getProperty("dropdwonsuggestion")));
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
		action.moveToElement(suggestion).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12000)");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	@Test(priority = 8)
	public void more_discordcommuntiy() throws InterruptedException {
		WebElement more = driver.findElement(By.xpath(loc.getProperty("menumore")));
		WebElement community = driver.findElement(By.xpath(loc.getProperty("dropdwondiscordcommunity")));
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
		action.moveToElement(community).click().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
}
