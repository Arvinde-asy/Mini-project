package trip_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sorting {
   public static void sort(WebDriver driver,String sort) throws InterruptedException
   {
	   driver.findElement(By.xpath(sort)).click();
		Thread.sleep(5000);
   }
}
