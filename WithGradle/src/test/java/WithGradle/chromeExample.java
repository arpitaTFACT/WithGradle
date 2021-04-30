package WithGradle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  
		
        driver.get("http://www.google.com");
        
        WebElement mailID = driver.findElement(By.id("email"));
        mailID.sendKeys("test1@gmail.com");
        
        driver.close();
	}
}
