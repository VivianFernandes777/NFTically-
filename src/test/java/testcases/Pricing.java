package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.TestBase;

public class Pricing extends TestBase {

	@Test(priority = 1)
	public void menupricingbtn_click() throws InterruptedException {
		// driver.navigate().back();
		WebElement pricing = driver.findElement(By.xpath(loc.getProperty("droppricing")));
		Actions action = new Actions(driver);
		action.moveToElement(pricing).click().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
		// testcase1
		WebElement pricengbtn1 = driver.findElement(By.xpath(loc.getProperty("pricingbtn2")));
		pricengbtn1.click();
		Thread.sleep(2000);
		// testcase2
		WebElement priceingbtn2 = driver.findElement(By.xpath(loc.getProperty("pricingbtn1")));
		priceingbtn2.click();
		Thread.sleep(2000);
	}
	
	
	
	@Test(priority = 2)
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

	@Test(priority = 3)
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

	@Test(priority = 4)
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

	@Test(priority = 5)
	public void pricingplus_click() throws InterruptedException {
		WebElement pricing = driver.findElement(By.xpath(loc.getProperty("droppricing")));
		Actions action = new Actions(driver);
		action.moveToElement(pricing).click().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6300)");
		Thread.sleep(5000);
		// testcase12
		WebElement freq1 = driver.findElement(By.xpath(loc.getProperty("pricingfreq1")));
		freq1.click();
		Thread.sleep(2000);
		// testcase13
		WebElement freq2 = driver.findElement(By.xpath(loc.getProperty("pricingfreq2")));
		freq2.click();
		Thread.sleep(2000);
		// testcas14
		WebElement freq3 = driver.findElement(By.xpath(loc.getProperty("pricingfreq3")));
		freq3.click();
		Thread.sleep(2000);
		// testcas15
		//WebElement freq4 = driver.findElement(By.xpath(loc.getProperty("supportminus")));
		//freq4.click();
		//Thread.sleep(2000);
		// testcas16
		WebElement freq5 = driver.findElement(By.xpath(loc.getProperty("pricingfreq5")));
		freq5.click();
		Thread.sleep(2000);
		// testcas17
		WebElement freq6 = driver.findElement(By.xpath(loc.getProperty("pricingfreq6")));
		freq6.click();
		Thread.sleep(2000);
	}
}
