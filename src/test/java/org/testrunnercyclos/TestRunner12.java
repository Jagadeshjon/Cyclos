package org.testrunnercyclos;

import org.baseclass.Base_Class_For_All_Project;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;






@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = "src\\test\\java\\org\\featurefiles\\Cyclos.feature",
		
		glue = "org.stepdef",
		
		monochrome = true,
		
	
		plugin = {"pretty", "html:Html_Report/Cyclos.html",
				
		"json:Jason_Report/Cyclos.json"
		
		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"		
		
		
		
		}
		
		
		
		
		)






public class TestRunner12 {
	public static WebDriver driver;
	@BeforeClass
	
	public static void Setup() {
		driver=Base_Class_For_All_Project.browser_configuration("chrome");
	}
	
	@AfterClass
	public static void Teardone() {
		driver.close();
	}
	
	

}
