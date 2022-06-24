import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadExample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Drivers\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		String location=System.getProperty("user.dir")+"\\DownloadWord";
		
		HashMap<String, String> prefernece=new HashMap<String, String>();
		
		prefernece.put("download.default_directory", location);
		
		ChromeOptions option=new ChromeOptions();
		
		option.setExperimentalOption("prefs", prefernece);

		
		WebDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/download");
		
		WebElement fileDownload=driver.findElement(By.xpath("//a[text()='TextDoc.txt']"));
		
		fileDownload.click();
		
		Thread.sleep(3000);
		
		File fileLocation=new File(location);
		
		File[] totalfiles=fileLocation.listFiles();
		
		for(File fl: totalfiles) {
			
			if(fl.getName().equals("TextDoc.txt")) {
				System.out.println("File is downloaded");
				break;
			}
		}
		
		
		
	}

}
