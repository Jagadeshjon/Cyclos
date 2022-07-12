package org.page.object.manager;

import org.openqa.selenium.WebDriver;
import org.pommod.Dashboardpage;
import org.pommod.Homepage;

public class PageObjectManager {
     public WebDriver driver;
	private Homepage Homepage;
	
	private Dashboardpage dashboard;
	
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}



	public Homepage getHomepage() {
		if(Homepage == null) {
		Homepage= new Homepage(driver);
		}
		return Homepage;
	}

	
	
	public Dashboardpage getDashboard() {
		if(dashboard == null) {
		dashboard = new Dashboardpage(driver);
		}
		return dashboard;
	}

	
	
	
	
	
	
	
	
	
	
	
}
