package AlertHandal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize(); // Maximuz the Screen 
		
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		
		
//		//creating object for alert interface
//		Alert a1=driver.switchTo().alert();
//		a1.accept();
//		
		
		

	}

}
