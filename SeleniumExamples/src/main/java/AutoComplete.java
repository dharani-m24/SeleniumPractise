import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;



public class AutoComplete extends BrowserSetUp{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		AutoComplete.launchBrowser();
		
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		
		
		WebElement  searchBox =driver.findElement(By.id("autocomplete"));
		
		searchBox.clear();
		//Thread.sleep(3000);
		searchBox.sendKeys("Toronto");
		//Thread.sleep(3000);
		String text="";
		
		do {
			
			searchBox.sendKeys(Keys.ARROW_DOWN);
			//Thread.sleep(3000);
			text=searchBox.getAttribute("value");
			
			if(text.equalsIgnoreCase("Toronto, OH, USA")) {
				searchBox.sendKeys(Keys.ENTER);
				System.out.println("Selected text is :"+ text);
				break;
			}
			
			//Thread.sleep(3000);
			
		}while(!text.isEmpty());
		
			}

}
