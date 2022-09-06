package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import TestBase.Base;

public class HomePage extends Base {

	String url = "https://www.oceanstatejoblot.com";
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String PagetitleisPresent() {

		return driver.getTitle();

	}

	public void clickUserDropDown() {
		WebElement userDropdown = driver.findElement(By.cssSelector(".btn-user-dropdown"));
		Actions act = new Actions(driver);

		act.clickAndHold(userDropdown).perform();
      System.out.println("menue clicked");
      
	}

	public void clickLogin() {
		WebElement Login = driver.findElement(By.xpath("//a[@data-original-title='login']"));
		Login.click();

	}

	public HomePage clickCreatAccount() {

		WebElement registration = driver.findElement(By.xpath("//a[@data-original-title='createAccount']"));
        javaScriptClick(registration, driver);
		
		System.out.println("create accpunt clicked");
		return this;
	}

	public void firstNamelabel() {
		String label=driver.findElement(By.xpath("//label[@for='CC-userRegistration-firstname']")).getText();
	System.out.println("label");
	
	}
	public void setFrirstName(String firstname) {
		WebElement firstNameField = driver.findElement(By.id("CC-userRegistration-firstname"));
		firstNameField.clear();
		firstNameField.sendKeys(firstname);
	//	JavascriptExecutor js= (JavascriptExecutor)driver;
	//	js.executeAsyncScript("document.getElementById('CC-userRegistration-firstname').value='firstname')");
	}

	public void setLastName(String lastname) {
		WebElement lastNameField = driver.findElement(By.cssSelector("#CC-userRegistration-lastname"));
		//lastNameField.clear();
		lastNameField.sendKeys(lastname);
	}

	public void setEmail(String email) {
		WebElement emailField = driver.findElement(By.cssSelector("input#CC-userRegistration-emailAddress"));
		emailField.clear();
		emailField.sendKeys(email);
	}

	public void setPhoneNumber(String num) {

		WebElement phoneNumField = driver.findElement(By.cssSelector("input#CC-userRegistration-phoneNumber"));
		phoneNumField.clear();
		phoneNumField.sendKeys(num);
		;
	}

	public void setZipCode(String code) {

		WebElement codeField = driver.findElement(By.cssSelector("input#CC-userRegistration-zipCode"));
		codeField.clear();
		codeField.sendKeys(code);

	}

	public void setPassword(String psw) {

		WebElement passwordField = driver.findElement(By.id("CC-userRegistration-password"));
		passwordField.clear();
		passwordField.click();
	}

	public void confirmPassword(String cpsw) {

		WebElement confirmPassword = driver.findElement(By.id("CC-userRegistration-confirmPassword"));
		confirmPassword.clear();
		confirmPassword.click();
	}

	public void AccountSubmitBtn() {
		WebElement submitBtn = driver.findElement(By.id("CC-userRegistrationSubmit"));
		submitBtn.click();
	}

}
