package AlertHandal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class simpleAlertGetText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize(); // Maximuz the Screen

		driver.get("http://omayo.blogspot.com/");

		WebElement e1=driver.findElement(By.xpath("//input[@id='alert1']"));
		e1.click();
		
		Thread.sleep(5000)	;
		
		Alert a1=driver.switchTo().alert();
		
		String GetText=a1.getText();
		
		System.out.println(GetText);
		
		Thread.sleep(2000);
		a1.accept();
		
		
		
		
		
		
	}

}
