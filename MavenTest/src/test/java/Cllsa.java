
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		
public class Cllsa {

	public static void main(String[] args) {
	
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirup Subba\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver(); 	
		
				
				driver.get("https://www.google.com/");
				
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.close();
		    
		
		
	}

}
