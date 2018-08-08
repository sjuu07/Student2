package pop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/JUHI%20MARY%20SAJI/Desktop/popup.html");
		driver.findElement(By.xpath("//button[text()='Try me']")).click();
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		
		Thread.sleep(3000);
		alert.accept();
		System.out.println(text);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.close();
		
	}

}
