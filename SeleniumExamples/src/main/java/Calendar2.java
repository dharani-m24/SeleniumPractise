

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Calendar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver",
//				"E:\\Drivers\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");

		//WebDriverManager.chromedriver().setup(); 
		
		WebDriverManager.chromedriver().setup();

		
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-%20application/");

		WebElement dob = driver.findElement(By.id("dob"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", dob);

		dob.click();
		
		
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

		Select selectMonth = new Select(monthDropDown);

		selectMonth.selectByVisibleText("Nov");

		WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));

		Select selectYear = new Select(yearDropDown);

		selectYear.selectByVisibleText("1990");

		String date = "15";

		List<WebElement> alldate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		for (WebElement ele : alldate) {

			String dt = ele.getText();
			System.out.println(dt);
			if (dt.equals(date)) {
				ele.click();
				break;
			}
		}

	}

}
