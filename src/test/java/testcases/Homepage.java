package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;

public class Homepage extends TestBase {

	@BeforeMethod
	@Test(priority = 1, enabled = false)
	public void closeFlyoverPopup() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(loc.getProperty("flyover"))).click();
	}

	@Test(priority = 2, enabled = false)
	public void closeFlyoverPopup_click() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(loc.getProperty("flyover"))).click();
	}

	@Test(priority = 3)
	public void Top3_ButtonClick() throws InterruptedException {
		driver.findElement(By.xpath(loc.getProperty("Btn1"))).click();
		String expectedTitle = "//button[@id='pills-home-tab']";
		String originalTitle = "//button[@id='pills-home-tab']";
		Assert.assertEquals(originalTitle, expectedTitle);
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("Btn2"))).click();
		String expectedTitle1 = "//button[@id='pills-contact-tab']";
		String originalTitle1 = "//button[@id='pills-contact-tab']";
		Assert.assertEquals(originalTitle1, expectedTitle1);
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("Btn3"))).click();

		String expectedTitle2 = "//button[@id='pills-disabled-tab']";
		String originalTitle2 = "//button[@id='pills-disabled-tab']";
		Assert.assertEquals(originalTitle2, expectedTitle2);
		Thread.sleep(4000);

	}

	@Test(priority = 4)
	public void videobtn_click() throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("videobtn"))).click();
		Thread.sleep(54000);
		driver.findElement(By.xpath(loc.getProperty("videoclosebtn"))).click();

	}

	@Test(dataProvider = "Testdata1", priority = 5,enabled = false)
	public static void emailid_validation(String Email) throws InterruptedException {
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,0)");
		Thread.sleep(1000);
		WebElement query = driver.findElement(By.xpath(loc.getProperty("FirstEmailild")));
		query.sendKeys(Email);
		Thread.sleep(1000);
		query = driver.findElement(By.xpath(loc.getProperty("Firstsubmit")));
		query.click();
		Thread.sleep(1000);
		query = driver.findElement(By.xpath(loc.getProperty("FirstEmailild")));
		query.clear();
		WebElement modalContainer = driver.findElement(By.className("modal-dialog"));
		Thread.sleep(2000);
		modalContainer.findElement(By.xpath(loc.getProperty("FirstModolClose"))).click();
		Thread.sleep(2000);

	}

	@DataProvider(name = "Testdata1" )
	public Object[][] dpMethod1() {
		return new Object[][] {
				// invalid address
				{ "plainaddress" }, 
				{ "#@%^%#$@#$@#.com" }, 
				{ "@example.com" }, 
				{ "Joe Smith <email@example.com>" },
				{ "email.example.com" }, 
				{ "email@example@example.com" }, 
				{ ".email@example.com" },
				{ "email.@example.com" }, 
				{ "email..email@example.com" }, 
				{ "あいうえお@example.com" },
				{ "email@example.com (Joe Smith)" }, 
				{ "email@example" }, 
				{ "email@-example.com" },
				{ "email@example.web" }, 
				{ "email@111.222.333.44444" }, 
				{ "email@example..com" },
				{ "List of Strange Invalid Email Addresses" },
				{ "”(),:;<>[\\]@example.com" },
				{ "just”not”right@example.com" }, 
				{ "this\\ is\"really\"not\\allowed@example.com" },
				// valid emailaddress
				{ "email@domain.com" }, 
				{ "firstname.lastname@domain.com" }, 
				{ "email@subdomain.domain.com" },
				{ "firstname+lastname@domain.com" }, 
				{ "email@123.123.123.123" }, 
				{ "email@[123.123.123.123]" },
				{ "“email”@domain.com" }, 
				{ "1234567890@domain.com" }, 
				{ "email@domain-one.com" },
				{ "_______@domain.com" }, 
				{ "email@domain.name" }, 
				{ "email@domain.co.jp" },
				{ "firstname-lastname@domain.com" }, 
				{ "List of Strange Valid Email Addresses" },
				{ "much.” more\\ unusual”@example.com" }, 
				{ "very.unusual.”@”.unusual.com@example.com" },
				{ "very.”(),:;<>[]”.VERY.”very@\\\\ \"very”.unusual@strange.example.com" }, 
				};
	}

	@Test(priority = 6)
	public void news_click() throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		// bitcoin
		driver.findElement(By.xpath(loc.getProperty("bitcoin"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		// yahoofinance
		driver.findElement(By.xpath(loc.getProperty("yahoofinance"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		// marketwatcher
		driver.findElement(By.xpath(loc.getProperty("marketwatcher"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		// benzinga
		driver.findElement(By.xpath(loc.getProperty("benzinga"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		/// insider
		driver.findElement(By.xpath(loc.getProperty("insider"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		// venturebeat
		driver.findElement(By.xpath(loc.getProperty("venturebeat"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		// newsnextbtn
		driver.findElement(By.xpath(loc.getProperty("newsnextbtn"))).click();
		Thread.sleep(3000);
		// nbb
		driver.findElement(By.xpath(loc.getProperty("nbb"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		// newsnextbtn
		driver.findElement(By.xpath(loc.getProperty("newsnextbtn"))).click();
		Thread.sleep(3000);
		// mint
		driver.findElement(By.xpath(loc.getProperty("mint"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		// newsnextbtn
		driver.findElement(By.xpath(loc.getProperty("newsnextbtn"))).click();
		Thread.sleep(3000);
		// financialexpress
		driver.findElement(By.xpath(loc.getProperty("financialexpress"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test(priority = 7)
	public void fullstackmeataver_click() throws InterruptedException {
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("meta2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("meta3"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("meta4"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("meta5"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("meta1"))).click();
	}

	@Test(priority = 9)
	public void trustedandglobal_clickbutton() throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2100)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("mafatlal"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("thizz"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("merchit"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("zixel"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("sportnft"))).click();
	}

	
	@Test(priority = 10)
	public void metabtn_click() throws InterruptedException {
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2300)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("metabtn"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test(priority = 11)
	public void opensea_clickbutton() throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("Themecustomisation"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("integration"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("support"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("nftfeatures"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("Enterprisefriendly"))).click();
		Thread.sleep(3000);

	}

	@Test(priority = 13)
	public void ourkeyinvestor_click() throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4700)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("kbtn2"))).click();
		driver.findElement(By.xpath(loc.getProperty("kbtn3"))).click();
		driver.findElement(By.xpath(loc.getProperty("kbtn4"))).click();
		driver.findElement(By.xpath(loc.getProperty("kbtn5"))).click();
		driver.findElement(By.xpath(loc.getProperty("kbtn6"))).click();
		driver.findElement(By.xpath(loc.getProperty("kbtn7"))).click();
		driver.findElement(By.xpath(loc.getProperty("kbtn8"))).click();
		driver.findElement(By.xpath(loc.getProperty("kbtn9"))).click();
		driver.findElement(By.xpath(loc.getProperty("kbtn10"))).click();
		driver.findElement(By.xpath(loc.getProperty("kbtn11"))).click();
		driver.findElement(By.xpath(loc.getProperty("kbtn12"))).click();
		driver.findElement(By.xpath(loc.getProperty("kbtn13"))).click();
		driver.findElement(By.xpath(loc.getProperty("kbtn14"))).click();
		driver.findElement(By.xpath(loc.getProperty("kbtn15"))).click();
		driver.findElement(By.xpath(loc.getProperty("kbtn16"))).click();
		driver.findElement(By.xpath(loc.getProperty("kbtn17"))).click();

	}

	@Test(priority = 14)
	public void reserveknowbutton_clickbutton() throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5300)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("Reseveknowbtn1"))).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("Reseveknowbtn2"))).click();
		driver.navigate().back();
	}

	@Test(priority = 15)
	public void joincommunity_clickbutton() throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6600)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("discordserver"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("telegram"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("twitter"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("instagram"))).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("linkedin"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("facebook"))).click();
		Thread.sleep(3000);
		driver.navigate().back();

	}

	@Test(priority = 16)
	public void learnfromacademy_click() throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6600)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("learnmore1"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("learnmore2"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("joinacademyknow"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test(priority = 17)
	public void joinareteam_click() throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6600)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("fullstackdeveloper"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("bussinessdevelopmentmanagr"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("seolead"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("technicalcontentwirter"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("DevopsEngineer"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("checkourcareerpage"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test(dataProvider = "Testdata", priority = 18, enabled = false)
	public static void fotteremailid_valid(String Email) throws InterruptedException {
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,7500)");
		Thread.sleep(1000);
		// driver.findElement(By.xpath(loc.getProperty("femailid"))).sendKeys(Email);
		// driver.findElement(By.xpath(loc.getProperty("Fsubmit"))).click();

		WebElement query = driver.findElement(By.xpath(loc.getProperty("femailid")));
		query.sendKeys(Email);
		Thread.sleep(1000);
		query = driver.findElement(By.xpath(loc.getProperty("Fsubmit")));
		query.click();
		Thread.sleep(1000);
		query = driver.findElement(By.xpath(loc.getProperty("femailid")));
		query.clear();

	}

	@DataProvider(name = "Testdata")
	public Object[][] dpMethod() {
		return new Object[][] {
				// invalid address
				{ "plainaddress" }, 
				{ "#@%^%#$@#$@#.com" },
				{ "@example.com" }, 
				{ "Joe Smith <email@example.com>" },
				{ "email.example.com" }, 
				{ "email@example@example.com" }, 
				{ ".email@example.com" },
				{ "email.@example.com" }, 
				{ "email..email@example.com" }, 
				{ "あいうえお@example.com" },
				{ "email@example.com (Joe Smith)" }, 
				{ "email@example" }, 
				{ "email@-example.com" },
				{ "email@example.web" }, 
				{ "email@111.222.333.44444" }, 
				{ "email@example..com" },
				{ "List of Strange Invalid Email Addresses" }, 
				{ "”(),:;<>[\\]@example.com" },
				{ "just”not”right@example.com" }, 
				{ "this\\ is\"really\"not\\allowed@example.com" },
				// valid emailaddress
				{ "email@domain.com" }, 
				{ "firstname.lastname@domain.com" }, 
				{ "email@subdomain.domain.com" },
				{ "firstname+lastname@domain.com" }, 
				{ "email@123.123.123.123" }, 
				{ "email@[123.123.123.123]" },
				{ "“email”@domain.com" }, 
				{ "1234567890@domain.com" }, 
				{ "email@domain-one.com" },
				{ "_______@domain.com" }, 
				{ "email@domain.name" }, 
				{ "email@domain.co.jp" },
				{ "firstname-lastname@domain.com" }, 
				{ "List of Strange Valid Email Addresses" },
				{ "much.” more\\ unusual”@example.com" }, 
				{ "very.unusual.”@”.unusual.com@example.com" },
				{ "very.”(),:;<>[]”.VERY.”very@\\\\ \"very”.unusual@strange.example.com" }, 
				};
	}

	@Test(priority = 20)
	public void footerLinks_click() throws InterruptedException {
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,7400)");
		Thread.sleep(3000);
		// *****FooterfeauturesLinks********
		driver.findElement(By.xpath(loc.getProperty("Fmetaverse"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("Ftheme&custom"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("Fsales&support"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("Fmarketing&Support"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("FAml&Complinaces"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("FReports"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("fnft&utiles"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("fadvanced"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		// ******FooterSolutionLink*****
		driver.findElement(By.xpath(loc.getProperty("FEnterprise"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("FCelebrity"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("FArtists"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("FInfluencers"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("FGamers"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("FEvents"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("FCommunities"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		// ***Footercompany******
		driver.findElement(By.xpath(loc.getProperty("Faboutus"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("Fcontactus"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("FContactClose"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("Fpricing"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		// *****FooterLearn******
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("Fblog"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("Facedemy"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("Fhelpccenter"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("Fcomearth"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@Test(priority = 21)
	public void footer_Privacylinks() throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,7500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("termofuse"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("privacypolicy"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("sitemap"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}
}
