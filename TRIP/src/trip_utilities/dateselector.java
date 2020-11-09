package trip_utilities;

import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dateselector {
	public static void selectdate(WebDriver driver, String origindate) throws InterruptedException {
		// Select date of travel
		driver.findElement(By.id(origindate)).click();
		Thread.sleep(2000);
		ZonedDateTime ld = ZonedDateTime.now();
		ld = ld.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		String Dateformat = ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		driver.findElement(By.xpath("//*[@id='"+Dateformat+"']")).click();
	}
}
