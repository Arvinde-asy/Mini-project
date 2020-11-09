package trip_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
      public static void searchbtn(WebDriver driver,String searchbutton) throws InterruptedException
      {
    	  Thread.sleep(1000);
    	  driver.findElement(By.id(searchbutton)).click();
      }
      
}
