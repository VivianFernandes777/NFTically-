package testcases;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.TestBase;

public class TestCase2 extends TestBase {

	@Test(priority = 1)
	public void moreaboutus_click() throws InterruptedException {
		// driver.navigate().back();
		WebElement more = driver.findElement(By.xpath(loc.getProperty("menumore")));
		WebElement aboutus = driver.findElement(By.xpath(loc.getProperty("dropdwonaboutus")));
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
		action.moveToElement(aboutus).click().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		// testcasecreatestore1
		WebElement createstore = driver.findElement(By.xpath(loc.getProperty("abtcreatestore")));
		createstore.click();
		Thread.sleep(2000);
		WebElement close = driver.findElement(By.xpath(loc.getProperty("abtclosestore")));
		close.click();
		Thread.sleep(2000);

	}

	@Test(priority = 2)

	public void morenaboutews1_click() throws InterruptedException {
		WebElement more = driver.findElement(By.xpath(loc.getProperty("menumore")));
		WebElement aboutus = driver.findElement(By.xpath(loc.getProperty("dropdwonaboutus")));
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
		action.moveToElement(aboutus).click().perform();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(5000);
		// testcase1
		WebElement news1 = driver.findElement(By.xpath(loc.getProperty("abtnews1")));
		news1.click();
		Thread.sleep(5000);
		Set<String> WindowsHandles = driver.getWindowHandles();
		System.out.println(WindowsHandles);
		//ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		//driver.switchTo().window(tabs2.get(1));
		//Thread.sleep(5000);
		//driver.close();

	}

	@Test(priority = 3)
	public void morenaboutews2_click() throws InterruptedException {
		WebElement more = driver.findElement(By.xpath(loc.getProperty("menumore")));
		WebElement aboutus = driver.findElement(By.xpath(loc.getProperty("dropdwonaboutus")));
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
		action.moveToElement(aboutus).click().perform();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(5000);
		// testcase2
		WebElement news2 = driver.findElement(By.xpath(loc.getProperty("abtnews2")));
		news2.click();
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		Thread.sleep(5000);
		driver.close();
	}

	@Test(priority = 4)
	public void morenaboutews3_click() throws InterruptedException {
		WebElement more = driver.findElement(By.xpath(loc.getProperty("menumore")));
		WebElement aboutus = driver.findElement(By.xpath(loc.getProperty("dropdwonaboutus")));
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
		action.moveToElement(aboutus).click().perform();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(5000);
		// testcase3
		WebElement news3 = driver.findElement(By.xpath(loc.getProperty("abtnews3")));
		news3.click();
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		Thread.sleep(10000);
		driver.close();
	}

	@Test(priority = 5)
	public void morenaboutews4_click() throws InterruptedException {
		WebElement more = driver.findElement(By.xpath(loc.getProperty("menumore")));
		WebElement aboutus = driver.findElement(By.xpath(loc.getProperty("dropdwonaboutus")));
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
		action.moveToElement(aboutus).click().perform();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(5000);
		// testcase4
		WebElement news4 = driver.findElement(By.xpath(loc.getProperty("abtnews4")));
		news4.click();
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		Thread.sleep(10000);
		driver.close();
	}

	@Test(priority = 6)
	public void morenaboutews5_click() throws InterruptedException {
		WebElement more = driver.findElement(By.xpath(loc.getProperty("menumore")));
		WebElement aboutus = driver.findElement(By.xpath(loc.getProperty("dropdwonaboutus")));
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
		action.moveToElement(aboutus).click().perform();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(5000);
		// testcase5
		WebElement news5 = driver.findElement(By.xpath(loc.getProperty("abtnews5")));
		news5.click();
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		Thread.sleep(10000);
		driver.close();
	}

}
