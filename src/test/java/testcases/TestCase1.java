package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.TestBase;

public class TestCase1 extends TestBase {

	@Test(priority = 1)
	public void menupricing_click() throws InterruptedException {
		// driver.navigate().back();
		WebElement pricing = driver.findElement(By.xpath(loc.getProperty("droppricing")));
		Actions action = new Actions(driver);
		action.moveToElement(pricing).click().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		// testcase1
		WebElement general = driver.findElement(By.xpath(loc.getProperty("generalminus")));
		general.click();
		Thread.sleep(2000);
		// testcase2
		WebElement basicfeaturesminus = driver.findElement(By.xpath(loc.getProperty("basicfeatauresminus")));
		basicfeaturesminus.click();
		Thread.sleep(2000);
		// testcase3
		WebElement metaverseminus = driver.findElement(By.xpath(loc.getProperty("metaverseminus")));
		metaverseminus.click();
		Thread.sleep(2000);
		// testcase4
		WebElement themecustomiztion = driver.findElement(By.xpath(loc.getProperty("theme&custimztionminus")));
		themecustomiztion.click();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void menupricing2_click() throws InterruptedException {
		WebElement pricing = driver.findElement(By.xpath(loc.getProperty("droppricing")));
		Actions action = new Actions(driver);
		action.moveToElement(pricing).click().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2700)");
		Thread.sleep(5000);
		// testcase5
		WebElement salessupport = driver.findElement(By.xpath(loc.getProperty("salesupportminus")));
		salessupport.click();
		Thread.sleep(2000);
        // testcase6
		WebElement marketingsupport = driver.findElement(By.xpath(loc.getProperty("marketingsupportminus")));
		marketingsupport.click();
		Thread.sleep(2000);
        // testcase7
		WebElement amlcompliances = driver.findElement(By.xpath(loc.getProperty("amlcompliancesminus")));
		amlcompliances.click();
		Thread.sleep(2000);
        // testcase8
		WebElement reports = driver.findElement(By.xpath(loc.getProperty("reportsminus")));
		reports.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void menupricing3_click() throws InterruptedException {
		WebElement pricing = driver.findElement(By.xpath(loc.getProperty("droppricing")));
		Actions action = new Actions(driver);
		action.moveToElement(pricing).click().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4800)");
		Thread.sleep(5000);
		// testcase9
		WebElement nftutility = driver.findElement(By.xpath(loc.getProperty("nftutilityminus")));
		nftutility.click();
		Thread.sleep(2000);
		// testcase10
		WebElement advancedfeatures = driver.findElement(By.xpath(loc.getProperty("advancedfeaturesminus")));
		advancedfeatures.click();
		Thread.sleep(2000);
		// testcas11
		WebElement support = driver.findElement(By.xpath(loc.getProperty("supportminus")));
		support.click();
		Thread.sleep(2000);
	}
}
