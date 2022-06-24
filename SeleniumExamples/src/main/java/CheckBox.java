import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class CheckBox extends BrowserSetUp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckBox.launchBrowser();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> checkBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement box: checkBox) {
			
			String checkBoxvalue=box.getAttribute("id");
			
			System.out.println("values are :"+ checkBoxvalue);
			
			if(checkBoxvalue.equalsIgnoreCase("sing")) {
				
				box.click();
				break;
			}
		}
	}

}
