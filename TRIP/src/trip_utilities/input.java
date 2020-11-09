package trip_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class input {

	public static void setvalues(WebDriver driver, String source, String sourcecity,
			String start, String destinationcity, String End) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.name(source)).click();
		Thread.sleep(2000);
			   driver.findElement(By.id(sourcecity)).sendKeys(start);
		Thread.sleep(2000);
			  //driver.findElement(By.id("BE_flight_origin_city")).sendKeys(Keys.ARROW_DOWN);
			   driver.findElement(By.id(sourcecity)).sendKeys(Keys.ENTER);
			 
			   
		Thread.sleep(4000);
		//Select destination of flight
			   driver.findElement(By.id(destinationcity)).sendKeys(End);
		Thread.sleep(2000);
			   driver.findElement(By.id(destinationcity)).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	}
}
	

