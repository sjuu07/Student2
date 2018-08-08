package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class findElements {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.id("login-email"));
		ele.sendKeys("juhimarysaji15@gmail.com");
		WebElement elem=driver.findElement(By.id("login-password"));
		elem.sendKeys("juna1joanna");
		WebElement el=driver.findElement(By.id("login-submit"));
		el.click();
		driver.findElement(By.id("nav-settings__dropdown-trigger")).click();
		driver.findElement(By.xpath("//a[@href=\"/m/logout/\"]")).click();;
		
		Thread.sleep(3000);
		driver.close();

	}

}
