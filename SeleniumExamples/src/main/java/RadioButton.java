import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class RadioButton extends BrowserSetUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RadioButton.launchBrowser();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		//WebElement radioBtn=driver.findElement(By.xpath("//input[@id='java']"));
//		radioBtn.click();
		
		List<WebElement> radioBtn=driver.findElements(By.xpath("//input[@name='lang'][@type='radio']"));
		
		for(WebElement btn:radioBtn) {
			
			//WebElement localbtn=btn;
			
			String radioBtnValue=btn.getAttribute("value");
			
			System.out.println("Values are "+radioBtnValue);
			
			if(radioBtnValue.equalsIgnoreCase("python")) {
				
				btn.click();
				break;
			}
			
		}

	}

}
