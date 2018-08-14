package LaunchDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CreateAccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
        driver.get("https://www.fox.com");
        
        driver.findElement(By.xpath("//div[contains(@class,'Header_headerContentWrapper')]//div[contains(@class,'Header_iconContainer')]/div/a[contains(@class,'userIcon')]")).click();
        jse.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.xpath("//div[contains(@class, 'optimizely-close-x') and text() = 'x']")).click();
        driver.findElement(By.xpath("//div[contains(@class,'Account_perksButtonContainer')]/button[contains(text(),'Sign Up')]")).click();     
        WebElement fName = driver.findElement(By.name("signupFirstName"));
        fName.sendKeys("Fox");
        WebElement lName = driver.findElement(By.name("signupLastName"));
        lName.sendKeys("Test" + xRandomFunction());		
        WebElement email = driver.findElement(By.name("signupEmail"));
        email.sendKeys("lambu.jambu148@gmail.com");		
        WebElement pwd = driver.findElement(By.name("signupPassword"));
        pwd.sendKeys("123456");
        driver.findElement(By.xpath("//a[contains(text(),'Gender')]/parent::div//span")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Male')]")).click();
        WebElement bDate = driver.findElement(By.xpath("//input[contains(@placeholder,'Birthdate')]"));
        bDate.clear();
        bDate.sendKeys("08/11/1988");
        
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        driver.findElement(By.xpath("//div[contains(@class,'Account_signupButtonDesktop')]/button[contains(text(),'Create Profile')]")).click();
        //driver.switchTo().defaultContent();
        

        //driver.findElement(By.cssSelector(".Account_signupSuccessButton_1mM7y")).click();
        driver.findElement(By.xpath("//input[@value='Done']")).click();
        //driver.findElement(By.xpath("//div[contains(@class,'signupSuccessButton')]/button[contains(text(),'Done')]")).click();
        //driver.navigate().refresh();
        //driver.findElement(By.xpath("//div[contains(@class,'signupSuccessButton')]/button[contains(text(),'Done')]")).click();
      //iframe[contains(@id,'destination')]
       
        //driver.switchTo(frame(11));
        //driver.findElement(By.id("destination_publishing_iframe_foxnet_0"));
        //driver.findElement(By.name("Done")).click();
	}
	
	public static int xRandomFunction() {
		Random random = new Random();
		int value = random.nextInt();
		return value;
		}

}
