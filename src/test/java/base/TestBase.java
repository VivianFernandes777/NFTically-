package base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1 ;

@BeforeMethod
	public void setUp() throws IOException {
		if (driver == null) {
			fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Configfiles\\Config.properties");
			fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Configfiles\\Locators.properties");
			config.load(fr);
			loc.load(fr1);

		}

		if (config.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(config.getProperty("testurl"));
			driver.manage().window().maximize();
		} else if (config.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(config.getProperty("testurl"));
			driver.manage().window().maximize();
		}

	}
@AfterMethod
	public void tearDown() {

		 driver.close();
		System.out.println("browser close");

	}
}
