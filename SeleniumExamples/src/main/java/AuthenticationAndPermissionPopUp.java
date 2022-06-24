import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AuthenticationAndPermissionPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E:\\Drivers\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");

//		WebDriver driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//		
//		//Syntax
//		//https://username:password@the-internet.herokuapp.com/basic_auth
//
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		//permission pop up
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();
		
		driver.get("");
		
		
	}

}
