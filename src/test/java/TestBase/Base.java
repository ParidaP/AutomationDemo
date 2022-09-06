package TestBase;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;

	@BeforeClass
	public void setBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.oceanstatejoblot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
	}

	public String randomString(int count) {
		String generateString = RandomStringUtils.randomAlphabetic(count);
		return (generateString);
	}

	public String randomNumbers(int count) {
		String generaterandomStringN = RandomStringUtils.randomNumeric(count);
		return (generaterandomStringN);
	}
    
	
	public WebElement waitForElementToBeClickable(WebElement elem, int waitTimeSec) {
		WebElement element = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeSec));
			element = wait.until(ExpectedConditions.elementToBeClickable(elem));

		} catch (Exception e) {
		 e.printStackTrace();
			assertTrue(false);
		}

		return element;

	}
	
	
	public void javaScriptClick(WebElement elem, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver; 
			js.executeAsyncScript("arguments[0].click()", elem);
			
	}
	
	
	
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();

	}

}