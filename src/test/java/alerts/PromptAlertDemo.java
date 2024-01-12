package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptAlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement buttonThree = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		buttonThree.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		String textOnAlert = alert.getText();
		System.out.println(textOnAlert);
		alert.sendKeys("Arun Motoori");
		Thread.sleep(3000);
		alert.accept();
		//alert.dismiss();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		String result = driver.findElement(By.id("result")).getText();
		System.out.println(result);
		
		driver.quit();
		
	}

}
