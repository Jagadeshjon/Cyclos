package org.pommod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
    
public class Homepage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@aria-label='Login']" ) private WebElement login;
	
	@FindBy(xpath = "//input[@autocomplete='username']") private WebElement username;
	
	@FindBy(xpath = "//input[@autocomplete='password']") private WebElement password;
	@FindBy(xpath = "(//button[@type='button'])[2]") private WebElement submit;
	@FindBy(xpath = "(//div[@class='quick-access-icon'])[1]")private WebElement payuser;
	
	public Homepage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getPayuser() {
		return payuser;
	}
	
	
	
	
	
	

}
