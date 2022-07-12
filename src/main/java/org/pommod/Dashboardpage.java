package org.pommod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardpage {
	
		public WebDriver driver;
		@FindBy(xpath = "//button[contains(@class,'btn btn-icon')]") private WebElement touser;
		@FindBy(xpath = "//a[text()=' Active Walking ']") private WebElement activewalking;
		@FindBy(xpath = "//div[text()='Pay now']") private WebElement paynow;
		@FindBy(xpath = "//input[@type='tel']") private WebElement amount;
		@FindBy(xpath = "//a[text()=' Pay now ']") private WebElement paynowdrop;
		@FindBy(xpath = "//textarea[@rows='3']") private WebElement text;
		@FindBy(xpath = "//span[text()='Next']") private WebElement next;
		@FindBy(xpath = "//span[text()='Confirm']") private WebElement confirm;
		
		public Dashboardpage(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver, this);
		}
		public WebElement getTouser() {
			return touser;
		}
		public WebElement getActivewalking() {
			return activewalking;
		}
		public WebElement getPaynow() {
			return paynow;
		}
		public WebElement getAmount() {
			return amount;
		}
		public WebElement getPaynowdrop() {
			return paynowdrop;
		}
		public WebElement getText() {
			return text;
		}
		public WebElement getNext() {
			return next;
		}
		public WebElement getConfirm() {
			return confirm;
		}
		
		
		
	

}
