import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class ActionExample extends BrowserSetUp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ActionExample.launchBrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		
		WebElement pwd=driver.findElement(By.id("txtPassword"));
		pwd.sendKeys("admin123");
		
		WebElement loginBtn=driver.findElement(By.id("btnLogin"));
		loginBtn.click();
		
		WebElement admin=driver.findElement(By.id("menu_admin_viewAdminModule"));
		
		Actions act=new Actions(driver);
		act.moveToElement(admin).build().perform();
		
		WebElement userManagement=driver.findElement(By.id("menu_admin_UserManagement"));
		act.moveToElement(userManagement).build().perform();
		
		
		WebElement user=driver.findElement(By.id("menu_admin_viewSystemUsers"));
		act.moveToElement(user).click().build().perform();
		
	}

}
