

//***CHILDREN BROWSER POP UP***   TO CLOSE ONLY THE CHILD BROWSER

package pop;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String parenttitle=driver.getTitle();
		Set<String> allwin = driver.getWindowHandles();
		int count=allwin.size();
		System.out.println("Number of Browsers:"+count);
		Thread.sleep(3000);
		for(String string : allwin) { // to close all browsers and to print title of each browser
			driver.switchTo().window(string);
			String childtitle=driver.getTitle();
			if(parenttitle.equals(childtitle))
				
			System.out.println("parent title:"+parenttitle);
			else {
				System.out.println("child title:"+childtitle);

			driver.close();}
		}
	//	driver.close();//to close only parent window
	//	driver.quit();//to close all the windows
		
	}

}
