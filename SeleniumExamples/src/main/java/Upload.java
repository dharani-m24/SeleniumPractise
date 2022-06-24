

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E:\\Drivers\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.monsterindia.com/");

		WebElement uploadClick = driver.findElement(By.xpath("//span[@class='uprcse semi-bold']"));
		
		uploadClick.click();
		
		WebElement select=driver.findElement(By.xpath("(//input[@id='file-upload'])[1]"));
		
		//select.sendKeys("C:\\Users\\dhara\\Downloads\\File.pdf");
		
		select.click();
		
		/* Ctr+C path
		 * Crt+V
		 * Enter
		 * 
		 */
		
		Robot rb=new Robot();
		rb.delay(2000);
		
		StringSelection ss=new StringSelection("C:\\Users\\dhara\\Downloads\\File.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		
		//Ctrl +V
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//Enter
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
