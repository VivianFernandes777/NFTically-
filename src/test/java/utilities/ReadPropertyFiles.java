package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\Vivia\\eclipse-workspace\\Nftically\\src\\test\\resources\\Configfiles\\Config.properties");
		FileReader fr1 = new FileReader("C:\\Users\\Vivia\\eclipse-workspace\\Nftically\\src\\test\\resources\\Configfiles\\Locators.properties");  
		  Properties config = new Properties();
		  Properties locators = new Properties();
		  config.load(fr);
		  locators.load(fr1);
		  
		  System.out.println(config.getProperty("browser"));
		  System.out.println(config.getProperty("testurl"));
		  System.out.println(locators.getProperty("abtclosestore"));
	}

}
