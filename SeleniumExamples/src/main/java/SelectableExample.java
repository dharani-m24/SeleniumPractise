import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class SelectableExample extends BrowserSetUp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SelectableExample.launchBrowser();
		
		driver.get("http://www.leafground.com/pages/selectable.html");
		
//		List<WebElement> list=driver.findElements(By.xpath("//ol[@id='selectable']/child::li"));
//		
//		Actions act=new Actions(driver);
//		
//		act.keyDown(Keys.CONTROL).click(list.get(0)).click(list.get(1)).click(list.get(2)).perform();
		
		
		//act.clickAndHold(list.get(0)).clickAndHold(list.get(1)).clickAndHold(list.get(2)).perform();
		
		List<WebElement> list	=driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		
		int size=list.size();
		
		System.out.println(size);
		
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(list.get(0)).click(list.get(1)).click(list.get(2)).perform();
		
	}

}
