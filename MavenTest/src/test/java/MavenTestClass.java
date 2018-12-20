
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
		
public class MavenTestClass {

	public static void main(String[] args) {
		TestCase();
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhirup Subba\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		 // launch Fire fox and direct it to the Base URL
        driver.get("https://www.target.com/");
				
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.close();
		    */
	
		
	}
	
	public static void TestCase() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhirup Subba\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		 // launch Fire fox and direct it to the Base URL
        driver.get("https://www.target.com/");
				
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.close();
		    
		
	}

}
