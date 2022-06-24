import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class AlertExample extends BrowserSetUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub



		AlertExample.launchBrowser();
		driver.get("http://www.leafground.com/pages/Alert.html");

		//WebElement alertBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		WebElement alertBox=driver.findElement(By.xpath("//button[text()='Alert Box']"));
		alertBox.click();

		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		alert.accept();

	}

}
