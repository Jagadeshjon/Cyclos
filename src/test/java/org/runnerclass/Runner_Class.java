package org.runnerclass;

import java.util.concurrent.TimeUnit;

import org.baseclass.Base_Class_For_All_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.page.object.manager.PageObjectManager;
import org.pommod.Dashboardpage;
import org.pommod.Homepage;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Runner_Class extends Base_Class_For_All_Project {
	public static WebDriver driver = browser_configuration("chrome");
	// public static Homepage Homepage = new Homepage(driver);
	// public static Dashboardpage dashboard = new Dashboardpage(driver);
	public static PageObjectManager pom = new PageObjectManager(driver);

	public static void main(String[] args) {

		getUrl("https://demo.cyclos.org/ui/home");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		clickOnElement(pom.getHomepage().getLogin());

		inputValueElement(pom.getHomepage().getUsername(), "demo");

		inputValueElement(pom.getHomepage().getPassword(), "1234");

		clickOnElement(pom.getHomepage().getSubmit());

		clickOnElement(pom.getHomepage().getPayuser());

		clickOnElement(pom.getDashboard().getTouser());

		clickOnElement(pom.getDashboard().getActivewalking());
		
		inputValueElement(pom.getDashboard().getAmount(), "2");

		clickOnElement(pom.getDashboard().getPaynow());

		clickOnElement(pom.getDashboard().getPaynowdrop());

		inputValueElement(pom.getDashboard().getText(), "jaga");

		clickOnElement(pom.getDashboard().getNext());

		clickOnElement(pom.getDashboard().getConfirm());

		close();

	}

}
