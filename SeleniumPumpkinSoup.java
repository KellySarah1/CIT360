import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumPumpkinSoup {
	
	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\Java\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver =new FirefoxDriver();
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.id("gsr"));
	    element.sendKeys("Pumpkin Soup"); // send also a "\n"
	    element.submit();
	    
	    driver.get("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=3&cad=rja&uact=8&sqi=2&ved=0ahUKEwjzgNG6k9bQAhVRx2MKHZrLCqwQFggjMAI&url=http%3A%2F%2Fallrecipes.com%2Frecipe%2F9191%2Fpumpkin-soup%2F&usg=AFQjCNEBWy9J1RF7GcptChObZKTLuD9_nA&bvm=bv.139782543,d.cGc");
	    element.click();

	    }
	}
