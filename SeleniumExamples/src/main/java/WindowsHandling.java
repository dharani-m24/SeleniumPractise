import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class WindowsHandling extends BrowserSetUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WindowsHandling.launchBrowser();
		driver.get("http://www.leafground.com/pages/Window.html");

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

//		WebElement openhomePagebtn = driver.findElement(By.xpath("//button[text()='Open Home Page']"));
//
//		openhomePagebtn.click();
//
//		Set<String> handles = driver.getWindowHandles();
//
//		for (String windows : handles) {
//			if (!parentWindow.equals(windows)) {
//				driver.switchTo().window(windows);
//			}
//		}
//		
//		WebElement editBox=driver.findElement(By.xpath("//h5[text()='Edit']"));
//		editBox.click();
//		
//		driver.close();
//		//driver.quit();
//		
//		driver.switchTo().window(parentWindow);
//		
//		//find the number of windows opened
//		
//		WebElement openMultiple=driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
//		
//		openMultiple.click();
//		
//		Set<String> number=driver.getWindowHandles();
//		
//		int size=number.size();
//		
//		System.out.println(size);
		
		//close the child window
		
		WebElement dontCloseBtn=driver.findElement(By.xpath("(//button[@id='color'])[1]"));
		
		dontCloseBtn.click();
		
		Set<String> allwindows=driver.getWindowHandles();
		
		for(String windows: allwindows) {
			if(!parentWindow.equals(windows)) {
				driver.switchTo().window(windows);
				driver.close();
			}
		}
	}

}
