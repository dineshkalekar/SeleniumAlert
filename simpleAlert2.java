package AlertHandal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class simpleAlert2 {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new FirefoxDriver(); 

		driver.manage().window().maximize(); // Maximuz the Screen

		driver.get("http://omayo.blogspot.com/");

		driver.findElement(By.xpath("//input[@id='alert2']")).click();
		
		Thread.sleep(5000);

		Alert a1 = driver.switchTo().alert();
		
		String txt=a1.getText();
		
		System.out.println(txt);
		a1.accept();

	}

}
