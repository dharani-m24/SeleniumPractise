import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
	
	public void show() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver;
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium"+Keys.ENTER);
		
		
		

	}

}
