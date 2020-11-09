package trip_utilities;

import org.openqa.selenium.WebDriver;

public class Open_url {
	
	public static void openurl(String url,WebDriver driver)
	{
		driver.get(url);
		 System.out.println("Welcome To Yatra.com");
	}
	}
	
