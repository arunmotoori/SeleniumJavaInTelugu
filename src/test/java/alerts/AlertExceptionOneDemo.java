package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExceptionOneDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement buttonOne = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		buttonOne.click();
		
		Thread.sleep(3000);
		
		String pageHeading = driver.findElement(By.tagName("h3")).getText();
		System.out.println(pageHeading);
		
		//driver.close();
		
		driver.quit();
		
	}

}
