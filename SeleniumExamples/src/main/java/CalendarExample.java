import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Drivers\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		
		WebElement datebox=driver.findElement(By.id("onward_cal"));
		
		datebox.click();
		
		String month="September";
		
		String year="2022";
		
		String date="30";
		
		while(true) {
			
			String monthYear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
			System.out.println("Month and Year :"+ monthYear);
			
			String[] arr=monthYear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			
			if(month.contains(mon)  &&  year.equals(yr)) {
				break;
			}
			else {
				
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
		}
		
		List<WebElement>  allDates=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		
		for(WebElement el: allDates) {
			
			String dt=el.getText();
			
			if(date.equals(dt)) {
				el.click();
				break;
			}
		}
				
				

	}

}
