package pop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/JUHI%20MARY%20SAJI/Desktop/auto.html");
		driver.findElement(By.id("a")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\JUHI MARY SAJI\\Desktop\\load.exe");
		

	}}
