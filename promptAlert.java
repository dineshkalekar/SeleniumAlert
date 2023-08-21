package AlertHandal;v 


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class promptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize(); // Maximuz the Screen

		driver.get("http://omayo.blogspot.com/");

		WebElement e1=driver.findElement(By.xpath("//input[@id='prompt']"));
		e1.click();
		
		Thread.sleep(5000)	;
		
		Alert a1=driver.switchTo().alert();
		a1.sendKeys("dinesh");
		
		Thread.sleep(3000)	;
	//	a1.accept();
		
		a1.dismiss();
		
		
		
		

	}

}
