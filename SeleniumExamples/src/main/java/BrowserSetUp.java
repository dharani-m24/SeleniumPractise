
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetUp {
	
	
	
	public static WebDriver driver;
	
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
	}

}
