import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class First {

	public static void main(String[] args) {
		//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "D:\\Rakshith\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launch website
		driver.navigate().to("http://www.google.com/");
		
		//click on the search text box and send value
		driver.findElement(By.name("q")).sendKeys("quinnox bangalore");
		
		//Click on the search button
		driver.findElement(By.name("btnK")).submit();
	}

}
