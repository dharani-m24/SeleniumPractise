import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\Gecko Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		
//		WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Drivers\\\\ChromeDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		//driver.findElement(By.linkText("Go to Home Page")).click();
		
		//driver.findElement(By.partialLinkText("Home Page")).click();
		
		WebElement emailBox=driver.findElement(By.id("email"));
		emailBox.sendKeys("abc@gmail.com");
		
		WebElement appendBox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		
		appendBox.sendKeys("Text");
		
		WebElement getTextBox=driver.findElement(By.name("username"));
		String text=getTextBox.getAttribute("value");
		
		System.out.println(text);
		
		WebElement clearBox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
		clearBox.clear();
		
		
		WebElement disableBox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
		
		boolean status=disableBox.isEnabled();
		
		System.out.println(status);
		
		if(status==false) {
			
			System.out.println("textBox is disabled");
		}
		
		
		

	}

}
