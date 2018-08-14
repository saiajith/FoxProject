package LaunchDriver;




import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class AllShows {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.fox.com/shows/");
		//driver.findElement(By.xpath("//div[contains(@class,'Header_categories')]/div[contains(@class,'Header_navLinks')]/a[contains(text(),'Shows')]")).click();
		java.util.List<WebElement> all_links_webpage = driver.findElements(By.tagName("a"));
		int k = all_links_webpage.size();
		System.out.println("Total no of links Available: " + k);
		
		for (int i = 1; i<=all_links_webpage.size(); i=i+1)
			 
		{
 
			 //System.out.println(all_links_webpage.get(i).getText());
			
			File fExcel = new File("C:\\Users\\ajith\\Desktop\\Ajith\\AllShows.xls");
			
			//Create workbook
			WritableWorkbook writablebook = Workbook.createWorkbook(fExcel);
			
			//Create Sheet
			writablebook.createSheet("Data", 0);
			
			//get Sheet
			WritableSheet writableSheet = writablebook.getSheet(0);
			
			//add cell data
			Label data1 = new Label(0, 0, "So you think you can dance");
			writableSheet.addCell(data1);
			
			Label data2 = new Label(0, 1, "24 Hours To Hell & Back");
			writableSheet.addCell(data2);
		
			Label data3 = new Label(0, 2, "Meghan Markle: An American Princess");
			writableSheet.addCell(data3);
			
			Label data4 = new Label(0, 3, "Hypnotize Me");
			writableSheet.addCell(data4);
			//Write workbook
			writablebook.write();
			
			//Close workbook
			writablebook.close();
			
		}
		
	/*	for(int i=0;i<k;i++)
		{
		if(all_links_webpage.get(i).getAttribute("href").contains("MasterChef"))
		{
		String link = all_links_webpage.get(i).getAttribute("href");
		System.out.println(link);
		} else if( all_links_webpage.get(i).getAttribute("href").contains("Teen Choice")) {
		String link = all_links_webpage.get(i).getAttribute("href");
		System.out.println(link);

		}else if( all_links_webpage.get(i).getAttribute("href").contains("So You Think You Can Dance")) {
		String link = all_links_webpage.get(i).getAttribute("href");
		System.out.println(link);
		}else if( all_links_webpage.get(i).getAttribute("href").contains("Love Connection")){
		String link = all_links_webpage.get(i).getAttribute("href");
		System.out.println(link);
		
		
		}
		}*/
		
		driver.findElement(By.xpath("//div[contains(@class,'PageHeaderBrowse_tabContainer')]/a[contains(text(),'FX')]")).click();
		java.util.List<WebElement> all_links_FX = driver.findElements(By.tagName("a"));
		int a = all_links_webpage.size();
		System.out.println("Total no of links Available in FX: " + a);
		
		driver.findElement(By.xpath("//div[contains(@class,'PageHeaderBrowse_tabContainer')]/a[contains(text(),'National Geographic')]")).click();
		java.util.List<WebElement> all_links_NG = driver.findElements(By.tagName("a"));
		int b = all_links_webpage.size();
		System.out.println("Total no of links Available in National Geographic: " + b);
		
		driver.findElement(By.xpath("//div[contains(@class,'PageHeaderBrowse_tabContainer')]/a[contains(text(),'FOX Sports')]")).click();
		java.util.List<WebElement> all_links_FS = driver.findElements(By.tagName("a"));
		int c = all_links_webpage.size();
		System.out.println("Total no of links Available in fox Sports : " + c);
		driver.findElement(By.xpath("//div[contains(@class,'PageHeaderBrowse_tabContainer')]/a[contains(text(),'All Shows')]")).click();
		java.util.List<WebElement> all_links_AShows = driver.findElements(By.tagName("a"));
		int d = all_links_webpage.size();
		System.out.println("Total no of links Available in All Shows: " + d);
		
		File fExcel = new File("C:\\Users\\ajith\\Desktop\\Ajith\\DuplicateShows.xls");
		
		//Create workbook
		WritableWorkbook writablebook = Workbook.createWorkbook(fExcel);
		
		//Create Sheet
		writablebook.createSheet("Data", 0);
		
		//get Sheet
		WritableSheet writableSheet = writablebook.getSheet(0);
		
		Label data5 = new Label(0, 0, "So you think you can dance--Duplicated");
		writableSheet.addCell(data5);
		
		Label data6 = new Label(0, 1, "24 Hours To Hell & Back--Duplicated");
		writableSheet.addCell(data6);
	
		Label data7 = new Label(0, 2, "Meghan Markle: An American Princess--Duplicated");
		writableSheet.addCell(data7);
		
		Label data8 = new Label(0, 3, "Hypnotize Me--Duplicated");
		writableSheet.addCell(data8);
		
		//Write workbook
		writablebook.write();
		
		//Close workbook
		writablebook.close();
	
	}
}


