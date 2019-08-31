import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookTest {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Rakshith\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.navigate().to("https://www.google.com/search?source=hp&ei=fFpqXbP1BMySwgObvLyQDQ&q=quinnox+bangalore&oq=quinnox+bangalore&gs_l=psy-ab.3...1750.1870..1900...0.0..0.0.0.......0....1..gws-wiz.&safe=active&ssui=on");
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("email")).sendKeys("rakshi.shara@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("*******");
		driver.findElement(By.id("u_0_a")).click();
		
		driver.quit();
	}
	

}
