package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class_For_All_Project {

	public static WebDriver driver; // driver has no value this is a static variable
	public static String value;

	public static WebDriver browser_configuration(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		driver. manage().deleteAllCookies();

		return driver;

	}

	public static void clickOnElement(WebElement element) {// Static method

		element.click();

	}

	public static void inputValueElement(WebElement element, String data) {

		element.sendKeys(data);

	}
	public static void close() {
		driver.close();
		
	}

	//public static void close() {

		//driver.close();

	//}

	public static void getUrl(String url) {

		driver.get(url);

	}

	public static void dropdown(String type, WebElement element, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("bytext")) {
			s.selectByVisibleText(value);

		} else if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);

			s.selectByIndex(index);

		}

	}

	public static void takescreenshoot(String path) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File(path);

		FileUtils.copyFile(source, destination);

	}

	public static void Scrollupanddown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static void implicitwait() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	public static String Particular_Celldata(String path, int rowIndex , int cellIndex) throws IOException {

		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);
		// Sheet s = wb.getSheet("");
		Row r = s.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {

			value = c.getStringCellValue();
			//System.out.println(stringvalue);

		} else if (type.equals(CellType.NUMERIC)) {
			double numericValue = c.getNumericCellValue();
			int a = (int) numericValue;
			//System.out.println(a);
			value = String.valueOf(a);
		}

		return value;
	}

}