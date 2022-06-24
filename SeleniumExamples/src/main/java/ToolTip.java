import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class ToolTip extends BrowserSetUp {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		ToolTip.launchBrowser();

		driver.get("http://www.leafground.com/pages/tooltip.html");

		WebElement inputBox = driver.findElement(By.id("age"));

		String toolTipText = inputBox.getAttribute("title");

		if (toolTipText.equalsIgnoreCase("Enter your name")) {
			System.out.println("Both text are same");
		}

	}

}
