import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

;

public class Frames extends BrowserSetUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frames.launchBrowser();

		driver.get("http://www.leafground.com/pages/frame.html");

		driver.switchTo().frame(0);

		WebElement clickBtn = driver.findElement(By.xpath("//button[@id='Click']"));

		clickBtn.click();

		String text = driver.findElement(By.xpath("//button[@id='Click']")).getText();

		System.out.println(text);

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);

		driver.switchTo().frame("frame2");

		WebElement clickBtn2 = driver.findElement(By.id("Click1"));
		clickBtn2.click();

		driver.switchTo().defaultContent();

		List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));

		int size = totalframe.size();

		System.out.println(size);

	}

}
