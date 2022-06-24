import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class DropDownExample extends BrowserSetUp{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		DropDownExample.launchBrowser();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropDown1=driver.findElement(By.id("dropdown1"));
		
		
		Select select=new Select(dropDown1);
		//selecting the dropdown using index
		select.selectByIndex(4);
		
		Thread.sleep(4000);
		
		//selecting the dropdown using values
		select.selectByValue("3");
		
		Thread.sleep(4000);
		//selecting the dropdown using text
		select.selectByVisibleText("Appium");
		
		//get the size of the dropDown
		
		List<WebElement> listOfOptions =select.getOptions();
		
		int size=listOfOptions.size();
		
		System.out.println(size);
		
		WebElement multipleSelect=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		
		Select select2=new Select(multipleSelect);
		
		select2.selectByIndex(1);
		select2.selectByIndex(2);
		select2.selectByIndex(3);
	}

}
