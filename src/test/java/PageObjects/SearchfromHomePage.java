package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchfromHomePage {
 
	WebDriver driver;
	public SearchfromHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By searchField = By.cssSelector("#CC-headerWidget-Search");
	
	public void SearchAnItem() {
		try {
		WebElement SearchInputBox=driver.findElement(searchField);
		SearchInputBox.sendKeys("Note Book");
		Thread.sleep(2000);
		System.out.println("entered text --- note book ");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
