package AlertHandal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class simpleAlertGetText2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize(); // Maximuz the Screen

		driver.get("https://demoqa.com/alerts");

		WebElement e1=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		e1.click();
		
		Thread.sleep(5000)	;
		 
		Alert a1=driver.switchTo().alert();
			
		String GetTxt=a1.getText();
		
		System.out.println(GetTxt);
		
		Thread.sleep(1000);
		
		
		a1.accept();

	}

}
