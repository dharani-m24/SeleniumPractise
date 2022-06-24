import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class DragAndDrop extends BrowserSetUp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DragAndDrop.launchBrowser();
		
		driver.get(" http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement dragElement=driver.findElement(By.xpath("//div[text()='Washington'][@id='box3']"));
		
		WebElement dropElement=driver.findElement(By.xpath("//div[text()='Italy']"));
		
		Actions act=new Actions(driver);
		
		act.clickAndHold(dragElement).moveToElement(dropElement).release(dropElement).perform();
		
		
		
		
		
		act.dragAndDrop(dragElement, dropElement).perform();
	}

}
