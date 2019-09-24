import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	static WebDriver driver;
	public void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\TestNGFlipkart\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void fillText(WebElement e,String input) {
		System.out.println("filled text");
		System.out.println("Hai");
		e.sendKeys(input);

	}
	
	public void clickButton(WebElement e) {
		e.click();
	}
	public void closeBrowser() {
		driver.quit();
	}
}
