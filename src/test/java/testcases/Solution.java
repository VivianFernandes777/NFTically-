package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.TestBase;

public class Solution extends TestBase {

	@Test(priority = 1)
	public void solutionenterprise_click() throws InterruptedException {

		WebElement solution = driver.findElement(By.xpath(loc.getProperty("menusolution")));
		WebElement enterprise = driver.findElement(By.xpath(loc.getProperty("dropdownenterprise")));
		Actions action = new Actions(driver);
		action.moveToElement(solution).perform();
		action.moveToElement(enterprise).click().perform();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6000)");
		Thread.sleep(5000);
		// firstlink
		WebElement casestudy = driver.findElement(By.xpath("//img[@src='assets/images/case-study-image.png']"));
		casestudy.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		// secondlink
		WebElement webinar = driver.findElement(By.xpath("//img[@src='assets/images/webinar-image.png']"));
		webinar.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		// thirdlink
		WebElement metabtn = driver.findElement(By.xpath("//button[@class='btn btn-accord-primary']"));
		metabtn.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	

	@Test(priority = 2)
	public void solutioncelebrity_click() throws InterruptedException {
	     WebElement solution = driver.findElement(By.xpath(loc.getProperty("menusolution")));
			 WebElement celebrities = driver.findElement(By.xpath(loc.getProperty("dropdowncelebrity")));
	         Actions action = new Actions(driver);
			 action.moveToElement(solution).perform();
			 action.moveToElement(celebrities).click().perform();
			
	         JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,6000)");
			 Thread.sleep(5000);
			 //testcase1
		     WebElement casestudy  = driver.findElement(By.xpath("//img[@src='assets/images/case-study-image.png']"));
			 casestudy.click();
			 Thread.sleep(5000);
			 driver.navigate().back();
			 Thread.sleep(3000);
			 //testcase2
			 WebElement webinar  = driver.findElement(By.xpath("//img[@src='assets/images/webinar-image.png']"));
			 webinar.click();
			 Thread.sleep(5000);
			 driver.navigate().back();
			 Thread.sleep(3000);
			 //testcase3
			 WebElement metabtn  = driver.findElement(By.xpath("//button[@class='btn btn-accord-primary']"));
			 metabtn.click();
			 Thread.sleep(5000);
		      driver.navigate().back();
			 Thread.sleep(3000);
			 driver.navigate().back();
		}
	
	@Test(priority = 3)
	public void solutionartists_click() throws InterruptedException {
	     WebElement solution = driver.findElement(By.xpath(loc.getProperty("menusolution")));
			 WebElement artist = driver.findElement(By.xpath(loc.getProperty("dropdownartist")));
	         Actions action = new Actions(driver);
			 action.moveToElement(solution).perform();
			 action.moveToElement(artist).click().perform();
			
	         JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,6000)");
			 Thread.sleep(5000);
			 //testcase1
		     WebElement casestudy  = driver.findElement(By.xpath("//img[@src='assets/images/case-study-image.png']"));
			 casestudy.click();
			 Thread.sleep(5000);
			 driver.navigate().back();
			 Thread.sleep(3000);
			 //testcase2
			 WebElement webinar  = driver.findElement(By.xpath("//img[@src='assets/images/webinar-image.png']"));
			 webinar.click();
			 Thread.sleep(5000);
			 driver.navigate().back();
			 Thread.sleep(3000);
			 //testcase3
			 WebElement metabtn  = driver.findElement(By.xpath("//button[@class='btn btn-accord-primary']"));
			 metabtn.click();
			 Thread.sleep(5000);
		      driver.navigate().back();
			 Thread.sleep(3000);
			 driver.navigate().back();
		}
	
	
	
	@Test(priority = 4)
	public void solutioninfluencers_click() throws InterruptedException {
	     WebElement solution = driver.findElement(By.xpath(loc.getProperty("menusolution")));
			 WebElement influencer = driver.findElement(By.xpath(loc.getProperty("dropdowninfulence")));
	         Actions action = new Actions(driver);
			 action.moveToElement(solution).perform();
			 action.moveToElement(influencer).click().perform();
			
	         JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,6000)");
			 Thread.sleep(5000);
			 //testcase1
		     WebElement casestudy  = driver.findElement(By.xpath("//img[@src='assets/images/case-study-image.png']"));
			 casestudy.click();
			 Thread.sleep(5000);
			 driver.navigate().back();
			 Thread.sleep(3000);
			 //testcase2
			 WebElement webinar  = driver.findElement(By.xpath("//img[@src='assets/images/webinar-image.png']"));
			 webinar.click();
			 Thread.sleep(5000);
			 driver.navigate().back();
			 Thread.sleep(3000);
			 //testcase3
			 WebElement metabtn  = driver.findElement(By.xpath("//button[@class='btn btn-accord-primary']"));
			 metabtn.click();
			 Thread.sleep(5000);
		      driver.navigate().back();
			 Thread.sleep(3000);
			 driver.navigate().back();
		}
	
	@Test(priority = 5)
	public void solutiongamers_click() throws InterruptedException {
	     WebElement solution = driver.findElement(By.xpath(loc.getProperty("menusolution")));
			 WebElement gamers = driver.findElement(By.xpath(loc.getProperty("dropdowngamers")));
	         Actions action = new Actions(driver);
			 action.moveToElement(solution).perform();
			 action.moveToElement(gamers).click().perform();
			
	         JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,6000)");
			 Thread.sleep(5000);
			 //testcase1
		     WebElement casestudy  = driver.findElement(By.xpath("//img[@src='assets/images/case-study-image.png']"));
			 casestudy.click();
			 Thread.sleep(5000);
			 driver.navigate().back();
			 Thread.sleep(3000);
			 //testcase2
			 WebElement webinar  = driver.findElement(By.xpath("//img[@src='assets/images/webinar-image.png']"));
			 webinar.click();
			 Thread.sleep(5000);
			 driver.navigate().back();
			 Thread.sleep(3000);
			 //testcase3
			 WebElement metabtn  = driver.findElement(By.xpath("//button[@class='btn btn-accord-primary']"));
			 metabtn.click();
			 Thread.sleep(5000);
		      driver.navigate().back();
			 Thread.sleep(3000);
			 driver.navigate().back();
		}
	
	@Test(priority = 6)
	public void solutionevents_click() throws InterruptedException {
	     WebElement solution = driver.findElement(By.xpath(loc.getProperty("menusolution")));
			 WebElement events = driver.findElement(By.xpath(loc.getProperty("dropdwonevents")));
	         Actions action = new Actions(driver);
			 action.moveToElement(solution).perform();
			 action.moveToElement(events).click().perform();
			
	         JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,6000)");
			 Thread.sleep(5000);
			 //testcase1
		     WebElement casestudy  = driver.findElement(By.xpath("//img[@src='assets/images/case-study-image.png']"));
			 casestudy.click();
			 Thread.sleep(5000);
			 driver.navigate().back();
			 Thread.sleep(3000);
			 //testcase2
			 WebElement webinar  = driver.findElement(By.xpath("//img[@src='assets/images/webinar-image.png']"));
			 webinar.click();
			 Thread.sleep(5000);
			 driver.navigate().back();
			 Thread.sleep(3000);
			 //testcase3
			 WebElement metabtn  = driver.findElement(By.xpath("//button[@class='btn btn-accord-primary']"));
			 metabtn.click();
			 Thread.sleep(5000);
		      driver.navigate().back();
			 Thread.sleep(3000);
			 driver.navigate().back();
		}
	
	
	@Test(priority = 7)
	public void solutioncommunities_click() throws InterruptedException {
	     WebElement solution = driver.findElement(By.xpath(loc.getProperty("menusolution")));
			 WebElement communitites = driver.findElement(By.xpath(loc.getProperty("dropdowncommuntites")));
	         Actions action = new Actions(driver);
			 action.moveToElement(solution).perform();
			 action.moveToElement(communitites).click().perform();
			
	         JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,6000)");
			 Thread.sleep(5000);
			 //testcase1
		     WebElement casestudy  = driver.findElement(By.xpath("//img[@src='assets/images/case-study-image.png']"));
			 casestudy.click();
			 Thread.sleep(5000);
			 driver.navigate().back();
			 Thread.sleep(3000);
			 //testcase2
			 WebElement webinar  = driver.findElement(By.xpath("//img[@src='assets/images/webinar-image.png']"));
			 webinar.click();
			 Thread.sleep(5000);
			 driver.navigate().back();
			 Thread.sleep(3000);
			 //testcase3
			 WebElement metabtn  = driver.findElement(By.xpath("//button[@class='btn btn-accord-primary']"));
			 metabtn.click();
			 Thread.sleep(5000);
		      driver.navigate().back();
			 Thread.sleep(3000);
			 driver.navigate().back();
		}
}
