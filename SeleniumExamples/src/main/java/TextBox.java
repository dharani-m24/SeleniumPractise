import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		//driver.get("http://www.leafground.com/pages/Edit.html");
		
		
//		
//		WebElement textBox=driver.findElement(By.id("email"));
//		
//		textBox.sendKeys("abc@gmail.com");
//		
//		
//		
//		WebElement appendTextBox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
//		appendTextBox.sendKeys("Hello");
//		
//		
//		
//		WebElement getText=driver.findElement(By.name("username"));
//		
//		String text=getText.getAttribute("value");
//
//		System.out.println(text);
//		
//		
//		
//		WebElement clearText=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
//		
//		clearText.clear();
//		
//		WebElement textBoxVisible=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
//		
//		boolean status=textBoxVisible.isEnabled();
//		
//		System.out.println(status);
//		
//		if(status==false) {
//			System.out.println("textBox is disabled");
//		}
//		
//		else {
//			System.out.println("textBox is enabled");
//		}
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> radio=	driver.findElements(By.xpath("//input[@name='lang'][@type='radio']"));
		
		for(WebElement r: radio) {
			
			WebElement local=r;
			
			String value=local.getAttribute("value");
			
			System.out.println(value);
			
			if(value.equalsIgnoreCase("RUBY")) {
				local.click();
			}
		}
		
	}
	
	

}
