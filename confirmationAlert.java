package AlertHandal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class confirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver(); 

		driver.manage().window().maximize(); // Maximuz the Screen

		driver.get("http://omayo.blogspot.com/");

		WebElement e1=driver.findElement(By.xpath("//input[@id='confirm']"));
		e1.click();
		
		Thread.sleep(3000)	;
		
		
		Alert a1=driver.switchTo().alert();
		
	//	a1.accept();
		
		a1.dismiss();


	}

}
