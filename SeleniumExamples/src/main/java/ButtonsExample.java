import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;


public class ButtonsExample extends BrowserSetUp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ButtonsExample button=new ButtonsExample();
		
		ButtonsExample.launchBrowser();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//find the position of thee button
		
		WebElement getPosition= driver.findElement(By.id("position"));
		
		Point point= getPosition.getLocation();
		
		int xValue= point.getX();
		 int yValue=point.getY();
		 
		 System.out.println("X value is "+ xValue +"Y value is :"+ yValue);
		 
		 
		 //find color
		 WebElement colorOfTheButton=driver.findElement(By.id("color"));
		 
		String color= colorOfTheButton.getCssValue("background-color");
		
		System.out.println(color);
		
		
		//find the size
		WebElement sizeButton=driver.findElement(By.id("size"));
		
		int height=sizeButton.getSize().getHeight();
		int width=sizeButton.getSize().getWidth();
		
		System.out.println("Height is :"+ height+" Width is :"+ width);
		
		

	}

}
