import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class ClickExample extends BrowserSetUp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClickExample.launchBrowser();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement inputbox1=driver.findElement(By.id("field1"));
		
		inputbox1.clear();
		
		inputbox1.sendKeys("Welcome to selenium");
		
		WebElement copyTextBtn=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		
		Actions act=new Actions(driver);
		act.doubleClick(copyTextBtn).perform();;
		
		WebElement inputBox2=driver.findElement(By.id("field2"));
		if(inputbox1.getText().equalsIgnoreCase(inputBox2.getText())) {
			
			System.out.println("Text copied");
		}
		
		
		//right click
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickBtn=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		act.contextClick(rightClickBtn).perform();
		
		
	}

}
