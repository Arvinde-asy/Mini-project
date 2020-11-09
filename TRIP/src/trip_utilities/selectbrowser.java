package trip_utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class selectbrowser {
	public WebDriver SelectBrowser(WebDriver driver, String browser) throws Exception {
		try {
			if (browser.equalsIgnoreCase("Chrome")) {

				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

				ChromeOptions co = new ChromeOptions();
				co.addArguments("disable-infobars");
				co.addArguments("disable-notifications");
				co.addArguments("start-maximized");
				driver = new ChromeDriver(co);

			} else if (browser.equalsIgnoreCase("opera")) {

				System.setProperty("webdriver.opera.driver",
						System.getProperty("user.dir") + "\\driver\\operadriver.exe");

				OperaOptions op = new OperaOptions();
				op.addArguments("--disable-infobars");
				op.addArguments("start-maximized");
				op.addArguments("disable-notifications");
				driver = new OperaDriver(op);
			} else {
				System.out.println("Invalid browser");
			}

		} catch (Exception e) {

		}
		return driver;
	}
}
