package task19;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SeleniumLocaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Edge Browser Instead of Chrome
		WebDriver driver = new EdgeDriver();  
		
		//Maximizing the window 
		driver.manage().window().maximize();
		
		//Navigating the URL
		driver.get("https://www.guvi.in/register");
		
		//Using ImplicitlyWait for page to wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		
		//Using class name locator for name			
		driver.findElement(By.className("form-control")).sendKeys("Boopathi T");        
		
		//Using id locator for email and password
		driver.findElement(By.id("email")).sendKeys("Boopathi13456@outlook.com");
		driver.findElement(By.id("password")).sendKeys("SDAboopathi1027");
		
		//Using cssSelector locator for mobile number
		driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("9688806196");  
		
		//Using xpath locator for Signup
		driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
		
		//Using tagName locator for Current Profile
		driver.findElement(By.tagName("select")).sendKeys("Students");
		
		//Using id locator for Degree and Year
		driver.findElement(By.id("degreeDrpDwn")).sendKeys("Higher Secondary");
		driver.findElement(By.id("year")).sendKeys("2017");

		//Closing the driver
		//driver.close();
	}

}
