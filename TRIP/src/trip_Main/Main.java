package trip_Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import trip_utilities.Excelfile;
import trip_utilities.Open_url;
import trip_utilities.Search;
import trip_utilities.Sorting;
import trip_utilities.dateselector;
import trip_utilities.input;
import trip_utilities.selectbrowser;

public class Main {
	public static WebDriver driver;
	public static String readpropertyfile(String value) throws IOException
	{
		 Properties prop = new Properties();
		
		 try {
			InputStream input = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\TRIP\\Tripresource.properties");
		    prop.load(input);
		  
		 } catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 return   prop.getProperty(value);   
	}
	
	
	@Test
         public static void trip()  throws IOException, Exception
         {
        	 selectbrowser sb=new selectbrowser();
        	 driver=sb.SelectBrowser(driver,readpropertyfile("browser"));
        	 Open_url.openurl(readpropertyfile("url"),driver);
        	 input.setvalues(driver,readpropertyfile("source"),readpropertyfile("sourcecity"),readpropertyfile("start"),readpropertyfile("destinationcity"),readpropertyfile("End"));
        	 dateselector.selectdate(driver,readpropertyfile("origindate")); 
        	 Search.searchbtn(driver,readpropertyfile("searchbutton"));
        	 Sorting.sort(driver,readpropertyfile("sort"));
        	 Excelfile.writeexcel(driver);
        	 
         }
}
