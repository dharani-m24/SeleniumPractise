import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Download {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Drivers\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
//		String location=System.getProperty("user.dir")+"\\Downloads";
//		
//		HashMap<String,String> perfernece=new HashMap<String,String>();
//		perfernece.put("download.default_directory", location);
//		
//		ChromeOptions option=new ChromeOptions();
//		option.setExperimentalOption("prefs",perfernece );
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/download");
		
		
		
		WebElement dwnloadFile=driver.findElement(By.xpath("//a[text()='Lesson2.doc']"));
		dwnloadFile.click();
		
		Thread.sleep(3000);
		
		File filelocation= new File("C:\\Users\\dhara\\Downloads");
		
		File[] totalfiles=filelocation.listFiles();
		
		for(File file: totalfiles) {
			
			if(file.getName().equals("Lesson2.doc")) {
				System.out.println("File is downloaded");
				break;
			}
		}

	}

}
