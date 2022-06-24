import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class KeyBoardActionExample extends BrowserSetUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KeyBoardActionExample.launchBrowser();
		
		driver.get("https://text-compare.com/");
		
		WebElement inputBox1=driver.findElement(By.id("inputText1"));
		
		inputBox1.sendKeys("Welcome to selenium");
		
		WebElement inputBox2=driver.findElement(By.id("inputText2"));
		
		Actions act=new Actions(driver);
		
		//Ctr+A
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("A");
		
		act.keyUp(Keys.CONTROL);
		
		act.perform();
		
		//Ctr+C
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("C");
		
		act.keyUp(Keys.CONTROL);
		
		act.perform();
		
		//Tab
		
		act.sendKeys(Keys.TAB).perform();
		
		//CTR+ V
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("V");
		
		act.keyUp(Keys.CONTROL);
		
		act.perform();
		
		if(inputBox1.getText().equalsIgnoreCase(inputBox2.getText())) {
			System.out.println("Text is same");
		}
	}

}
