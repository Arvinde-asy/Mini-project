package trip_utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Excelfile {
     public static void writeexcel(WebDriver driver) throws IOException
     {
    	//create List of all element found
 		List<WebElement> flightname= driver.findElements(By.xpath("//span[@class='i-b text ellipsis']"));
 		List<WebElement> departuretime=driver.findElements(By.xpath("//div[@class='i-b pr']"));
 		List<WebElement> arrivaltime=driver.findElements(By.xpath("//p[@class='bold fs-15 mb-2 pr time']"));		
 	    List<WebElement> durationofFlight=driver.findElements(By.xpath("//p[@class='fs-12 bold du mb-2']"));
 	    List<WebElement> price=driver.findElements(By.xpath("//p[@class='i-b tipsy fare-summary-tooltip fs-18']"));
    	//Create A Excel sheet
 	    XSSFWorkbook workbook=new XSSFWorkbook();
 		  XSSFSheet sheet=workbook.createSheet("FLIGHT DETAILS");			
 			String Data[]=new String[5];
 	//Entering the title in the Excel Sheet
 		       Row first= sheet.createRow(0);
 		       Cell Title=first.createCell(0);
 		       Title.setCellValue("Flight Name");
 		       Cell dt=first.createCell(1);
 		       dt.setCellValue("Departure Time");
 		       Cell at=first.createCell(2);
 		       at.setCellValue("Arrival Time");
 		       Cell dura=first.createCell(3);
 		       dura.setCellValue("Duration");
 		       Cell Price=first.createCell(4);
 		       Price.setCellValue("Price");
 		       
 			
 	//Getting details of flight in Excel sheet
 		      for (int i = 0;i <5;i++) 
 					{
 					XSSFRow row=sheet.createRow(i+1);

 					Data[0]= flightname .get(i).getText();
 					Data[1]= departuretime .get(i).getText();
 					Data[2]= arrivaltime.get(i).getText();
 					Data[3]=durationofFlight.get(i).getText();
 					Data[4]= price.get(i).getText();
 					for (int j = 0;j <5;j++) 
 					{
 					XSSFCell cell=row.createCell(j);
 					cell.setCellValue(Data[j]);
 					}
 				}
 					FileOutputStream fileOutputStream=new FileOutputStream("FlightDetail.xlsx");
 					   workbook.write(fileOutputStream);
 					    workbook.close();
 		}
     
}

